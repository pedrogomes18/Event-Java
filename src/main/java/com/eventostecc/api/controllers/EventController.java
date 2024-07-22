package com.eventostecc.api.controllers;

import com.eventostecc.api.domain.event.Event;
import com.eventostecc.api.domain.event.EventRequestDTO;
import com.eventostecc.api.domain.event.EventResponseDTO;
import com.eventostecc.api.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Controller
@RequestMapping("/api/event")
public class EventController {

    @Autowired
    private EventService eventService;

    @PostMapping(consumes = "multipart/form-data")
    public ResponseEntity<Event> create (@RequestParam("title") String title,
                                         @RequestParam(value = "description", required = false) String description,
                                         @RequestParam("date") Long date,
                                         @RequestParam("city") String city,
                                         @RequestParam("uf") String uf,
                                         @RequestParam("remote") Boolean remote,
                                         @RequestParam("eventUrl") String eventUrl,
                                         @RequestParam(value = "image", required = false) MultipartFile image) {
        EventRequestDTO eventRequestDTO = new EventRequestDTO(title, description, date, uf,city, remote, eventUrl, image);
        Event newEvent = this.eventService.createEvent(eventRequestDTO);
        return ResponseEntity.ok(newEvent);
    }

    @GetMapping
    public ResponseEntity<List<EventResponseDTO>>
        getEvents(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size) {
        List<EventResponseDTO> allEvents = this.eventService.getEvents(page, size);
        return ResponseEntity.ok(allEvents);
    }

}
