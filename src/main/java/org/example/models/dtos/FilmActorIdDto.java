package org.example.models.dtos;

import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link org.example.models.entities.FilmActorId} entity
 */
@Data
public class FilmActorIdDto implements Serializable {
    private final Integer actorId;
    private final Integer filmId;
}