package org.example.models.dtos;

import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link org.example.models.entities.FilmCategoryId} entity
 */
@Data
public class FilmCategoryIdDto implements Serializable {
    private final Integer filmId;
    private final Short categoryId;
}