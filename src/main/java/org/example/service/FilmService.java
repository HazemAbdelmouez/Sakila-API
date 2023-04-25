package org.example.service;

import org.example.mappers.FilmMapper;
import org.example.models.dtos.FilmDto;
import org.example.models.entities.Film;
import org.example.repository.implementations.FilmRepositoryImp;
import org.example.repository.interfaces.FilmRepository;

import java.util.ArrayList;
import java.util.List;

public class FilmService {

    FilmRepository filmRepository;

    public FilmService(){
        this.filmRepository = new FilmRepositoryImp();
    }

    public List<FilmDto> getAllFilms(){

        List<FilmDto> filmsDto = new ArrayList<FilmDto>();

        for(Film film: filmRepository.getAll()){

            filmsDto.add(FilmMapper.MAPPER. mapToFilmDTO(film));
        }
        return  filmsDto;
    }

    public void addFilm(FilmDto filmDto){
        Film film = FilmMapper.MAPPER.mapToFilm(filmDto);

        filmRepository.add(film);
    }

    public FilmDto findFilmById(int id){
        FilmDto filmDto;

        filmDto = FilmMapper.MAPPER.mapToFilmDTO(filmRepository.getById(id));

        return filmDto;
    }

    public void deleteFilmByID(int id){
        filmRepository.delete(id);
    }

}
