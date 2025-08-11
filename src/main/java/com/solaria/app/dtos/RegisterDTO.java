package com.solaria.app.dtos;

public record RegisterDTO(
        String firstName,
        String lastName,
        String username,
        String email,
        String password
) {
}
