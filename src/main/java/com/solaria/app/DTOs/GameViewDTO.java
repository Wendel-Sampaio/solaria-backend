package com.solaria.app.DTOs;

import com.solaria.app.entities.Genre;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public record GameViewDTO(UUID id, String title, String description, Genre genre, String coverImage, LocalDate releaseDate, LocalDateTime updatedAt) {
}
