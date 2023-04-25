package org.example.models.dtos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;
import java.time.Instant;

/**
 * A DTO for the {@link org.example.models.entities.Address} entity
 */
@Data
public class AddressDto implements Serializable {
    private final Integer id;
    @Size(max = 50)
    @NotNull
    private final String address;
    @Size(max = 50)
    private final String address2;
    @Size(max = 20)
    @NotNull
    private final String district;
    @Size(max = 10)
    private final String postalCode;
    @Size(max = 20)
    @NotNull
    private final String phone;
    @NotNull
    private final Instant lastUpdate;
}