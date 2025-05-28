package com.solaria.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UuidGenerator;

import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @UuidGenerator
    private UUID id;

    @Column(length = 15, nullable = false)
    @Size(max = 15, message = "First name cannot exceed 15 characters.")
    @NotBlank(message = "First name is required.")
    private String firstName;

    @Column(length = 15, nullable = false)
    @Size(max = 15, message = "Last name cannot exceed 15 characters.")
    @NotBlank(message = "Last name is required.")
    private String lastName;

    @Column(unique = true, nullable = false)
    @Size(max = 20, message = "Username cannot exceed 20 characters.")
    @NotBlank(message = "Username is required.")
    private String username;

    @Email
    @Column(unique = true, nullable = false)
    @NotBlank(message = "Email is required.")
    private String email;

    @Column(nullable = false)
    @Size(min = 8, message = "Password must be at least 8 characters long.")
    @NotBlank(message = "Password is required.")
    private String password;

    @Column(updatable = false)
    @CreationTimestamp
    private Timestamp createdAt;

    private boolean ban;

}
