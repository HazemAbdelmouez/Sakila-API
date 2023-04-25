package org.example.models.dtos;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;
import java.time.Instant;

/**
 * A DTO for the {@link org.example.models.entities.Rental} entity
 */
@Data
public class RentalDto implements Serializable {
    private final Integer id;
    @NotNull
    private final Instant rentalDate;
    private final Instant returnDate;
    @NotNull
    private final Instant lastUpdate;
}