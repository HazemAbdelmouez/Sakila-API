package org.example.mappers;


import org.example.models.dtos.FilmDto;

import org.example.models.entities.Film;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface FilmMapper {

    FilmMapper MAPPER = Mappers.getMapper(FilmMapper.class);

    FilmDto mapToFilmDTO(Film film);

    Film mapToFilm(FilmDto filmDto);
}
