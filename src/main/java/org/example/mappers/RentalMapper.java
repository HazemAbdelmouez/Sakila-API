package org.example.mappers;


import org.example.models.dtos.RentalDto;
import org.example.models.entities.Rental;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RentalMapper {

    RentalMapper MAPPER = Mappers.getMapper(RentalMapper.class);

    RentalDto mapToRentalDTO(Rental rental);

    Rental mapToRental(RentalDto rentalDto);
}
