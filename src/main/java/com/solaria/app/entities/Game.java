package com.solaria.app.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.UuidGenerator;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "games")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Game {

    @Id
    @UuidGenerator
    private UUID id;

    @Column(unique = true, nullable = true)
    private Long rawgId;

    @Column(length = 100, nullable = false)
    @Size(min = 3, max = 100, message = "Title must be between 3 and 100 characters.")
    @NotBlank(message = "Title is required.")
    private String title;

    @Column(length = 1000, nullable = false)
    @Size(min = 3, max = 1000, message = "Description must be between 30 and 1000 characteres.")
    @NotBlank(message = "Description is required.")
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    @NotNull(message = "Genre is required.")
    private Genre genre;

    private String coverImage;

    @NotNull(message = "Release date is required.")
    private LocalDate releaseDate;

    @NotNull(message = "Creator user id is required.")
    private UUID creatorUserId;

    @UpdateTimestamp
    @Column(nullable = false)
    private LocalDateTime updatedAt;

    public Game(String title, String description, Genre genre, String coverImage, LocalDate releaseDate, UUID creatorUserId) {
        this.title = title;
        this.description = description;
        this.genre = genre;
        this.coverImage = coverImage;
        this.releaseDate = releaseDate;
        this.creatorUserId = creatorUserId;
    }
}
