package org.example.models.dtos;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;
import java.time.Instant;

/**
 * A DTO for the {@link org.example.models.entities.Store} entity
 */
@Data
public class StoreDto implements Serializable {
    private final Short id;
    @NotNull
    private final Instant lastUpdate;
}