package com.eventostecc.api.controllers;

import com.eventostecc.api.domain.event.Event;
import com.eventostecc.api.domain.event.EventRequestDTO;
import com.eventostecc.api.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class EventController {

    @Autowired
    private EventService eventService;

    public ResponseEntity<Event> create (@RequestBody EventRequestDTO body) {
        Event newEvent = this.eventService.createEvent(body);
        return ResponseEntity.ok(newEvent);
    }

}
