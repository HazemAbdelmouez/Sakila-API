package org.example.models.dtos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;

/**
 * A DTO for the {@link org.example.models.entities.Film} entity
 */
@Data
public class FilmDto implements Serializable {
    private final Integer id;
    @Size(max = 128)
    @NotNull
    private final String title;
    private final String description;
    private final Integer releaseYear;
    private final Short rentalDuration;
    @NotNull
    private final BigDecimal rentalRate;
    private final Integer length;
    @NotNull
    private final BigDecimal replacementCost;
    @Size(max = 5)
    private final String rating;
    @Size(max = 54)
    private final String specialFeatures;
    @NotNull
    private final Instant lastUpdate;
}