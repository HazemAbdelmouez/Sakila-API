package org.example;

import org.example.models.entities.Actor;
import org.example.models.entities.Film;

import org.example.repository.implementations.ActorRepositoryImp;
import org.example.repository.interfaces.ActorRepository;
import org.hibernate.query.IllegalNamedQueryOptionsException;

import java.time.Instant;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        ActorRepositoryImp ac = new ActorRepositoryImp();
        System.out.println(ac.getById(1).getFirstName());


      //  List<Actor> actorList = ac.getAllActors();

//        for(Actor actor : actorList){
//            System.out.println(actor.getFirstName());
//        }

//        FilmRepository fl = new FilmRepository();
//        List<Film> allFilms = fl.getAllFilms();
//        for(Film film : allFilms){
//            System.out.println(film.getTitle());
//        }

//

//        Actor actor1 = new Actor();
//
//        actor1.setFirstName("Hazem");
//
//        actor1.setLastName("Moez");
//
//        actor1.setLastUpdate(Instant.parse("2022-02-15T18:35:24.00Z"));
//
//        ac.addActor(actor1);

  //          fl.deleteFilm(1);
//        ActorService actorService = new ActorService();
//
//        System.out.println(actorService.findActorByID(1).getFirstName());

    }
}