package com.solaria.app.DTOs;

import com.solaria.app.entities.UserRole;

public record RegisterDTO(
        String firstName,
        String lastName,
        String username,
        String email,
        String password,
        UserRole role
) {
}
