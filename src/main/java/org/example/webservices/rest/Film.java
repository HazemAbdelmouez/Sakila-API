package org.example.webservices.rest;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

import org.example.models.dtos.FilmDto;
import org.example.service.FilmService;

@Path("film")
public class Film {
    FilmService filmService;

    public Film(){

        filmService = new FilmService();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<FilmDto> getAllFilms() {
        return filmService.getAllFilms();
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public FilmDto getFilm(@PathParam("id") int id){
        return filmService.findFilmById(id);
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public void addFilm(FilmDto film){
        filmService.addFilm(film);
    }

    @DELETE
    @Path("{id}")
    public Response deleteFilm(@PathParam("id") int id){
        filmService.deleteFilmByID(id);
        return Response.ok().build();
    }

}