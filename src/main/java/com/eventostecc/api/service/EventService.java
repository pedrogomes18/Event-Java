package com.eventostecc.api.service;

import com.amazonaws.services.s3.AmazonS3;
import com.eventostecc.api.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.eventostecc.api.domain.event.Event;
import com.eventostecc.api.domain.event.EventRequestDTO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;

@Service
public class EventService {

	@Autowired
	private AmazonS3 s3Client;

	@Autowired
	private EventRepository	eventRepository;

	@Value("${aws.bucket.name}")
	private String bucketName;

	public Event createEvent(EventRequestDTO data) {
		String imgUrl = null;
		
		if(data.image()!= null) {
			imgUrl = this.uploadImage(data.image());
		}
		
		Event newEvent = new Event();
		newEvent.setTitle(data.title());
		newEvent.setDescription(data.description());
		newEvent.setDate(new Date(data.date()));
		newEvent.setImgUrl(imgUrl);
		newEvent.setEventUrl(data.eventUrl());
		newEvent.setRemote(data.remote());

		eventRepository.save(newEvent);

		return newEvent;

	}
	
	private String uploadImage(MultipartFile multipartFile) {
		String filename = UUID.randomUUID() + "-" + multipartFile.getOriginalFilename();

		try {
			File file = this.convertMultipartToFile(multipartFile);
			s3Client.putObject(bucketName, filename, file);
			file.delete();
			return s3Client.getUrl(bucketName, filename).toString();
		} catch (Exception e) {
			System.out.println("Erro ao subir arquivo: " + e.getMessage());
			return "";
		}
    }

	private File convertMultipartToFile(MultipartFile multipartFile) throws IOException {
		File convFile = new File(Objects.requireNonNull(multipartFile.getOriginalFilename()));
		FileOutputStream fos = new FileOutputStream(convFile);
		fos.write(multipartFile.getBytes());
		fos.close();
		return convFile;
	}
}
