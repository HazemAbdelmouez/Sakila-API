package org.example.models.dtos;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;
import java.time.Instant;

/**
 * A DTO for the {@link org.example.models.entities.Actor} entity
 */
@Data
public class ActorDto implements Serializable {
    private final Integer id;

    // @Size(max = 45)
    @NotNull
    private final String firstName;

    // @Size(max = 45)
    @NotNull
    private final String lastName;
    @NotNull
    private final Instant lastUpdate;
}