package org.example.models.dtos;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;

/**
 * A DTO for the {@link org.example.models.entities.Payment} entity
 */
@Data
public class PaymentDto implements Serializable {
    private final Integer id;
    @NotNull
    private final BigDecimal amount;
    @NotNull
    private final Instant paymentDate;
    private final Instant lastUpdate;
}