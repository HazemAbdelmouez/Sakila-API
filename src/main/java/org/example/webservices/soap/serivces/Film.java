package org.example.webservices.soap.serivces;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import org.example.models.dtos.ActorDto;
import org.example.models.dtos.FilmDto;
import org.example.service.ActorService;
import org.example.service.FilmService;

import java.util.List;

@WebService
public class Film {
    FilmService filmService;

    public Film(){
         filmService = new FilmService();

    }

    @WebMethod
    public List<FilmDto> getAllFilms(){
        List<FilmDto> films = filmService.getAllFilms();
        return films;
    }

    @WebMethod
    public FilmDto getFilmById(int id){
        FilmDto film = filmService.findFilmById(id);
        return film;
    }

    @WebMethod
    public void addFilm(FilmDto filmDto){
        filmService.addFilm(filmDto);
    }

}
