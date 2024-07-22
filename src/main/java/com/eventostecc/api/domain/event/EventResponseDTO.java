package com.eventostecc.api.domain.event;

import java.util.Date;
import java.util.UUID;

public record EventResponseDTO(UUID id, String title, String description, Date date, Boolean remote, String eventUrl, String imgUrl) {
}
