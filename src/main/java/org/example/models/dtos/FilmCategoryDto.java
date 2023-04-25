package org.example.models.dtos;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;
import java.time.Instant;

/**
 * A DTO for the {@link org.example.models.entities.FilmCategory} entity
 */
@Data
public class FilmCategoryDto implements Serializable {
    @NotNull
    private final Instant lastUpdate;
}