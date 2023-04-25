package org.example.models.dtos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;
import java.time.Instant;

/**
 * A DTO for the {@link org.example.models.entities.Country} entity
 */
@Data
public class CountryDto implements Serializable {
    private final Integer id;
    @Size(max = 50)
    @NotNull
    private final String country;
    @NotNull
    private final Instant lastUpdate;
}