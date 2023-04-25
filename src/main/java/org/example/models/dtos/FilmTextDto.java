package org.example.models.dtos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link org.example.models.entities.FilmText} entity
 */
@Data
public class FilmTextDto implements Serializable {
    private final Short id;
    @Size(max = 255)
    @NotNull
    private final String title;
    private final String description;
}