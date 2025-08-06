package com.solaria.app.DTOs;

import com.solaria.app.entities.UserRole;

public record RegisterDTO(String email, String password, UserRole role) {
}
