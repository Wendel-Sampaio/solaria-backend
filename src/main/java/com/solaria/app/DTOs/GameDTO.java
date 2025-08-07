package com.solaria.app.DTOs;

import com.solaria.app.entities.Genre;

import java.time.LocalDate;

import java.util.UUID;

public record GameDTO(
        String title,
        String description,
        Genre genre,
        String coverImage,
        LocalDate releaseDate,
        UUID creatorUserId
) {
}
