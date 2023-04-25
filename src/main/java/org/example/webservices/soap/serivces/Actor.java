package org.example.webservices.soap.serivces;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import org.example.models.dtos.ActorDto;
import org.example.service.ActorService;

import java.util.List;

@WebService
public class Actor {
    ActorService actorService;

    public Actor(){
         actorService = new ActorService();

    }

    @WebMethod
    public List<ActorDto> getAllActors(){
        List<ActorDto> actors = actorService.getAllActors();
        return actors;
    }

    @WebMethod
    public ActorDto getActorById(int id){
        ActorDto actor = actorService.findActorByID(id);
        return actor;
    }

    @WebMethod
    public void addActor(ActorDto actorDto){
        actorService.addActor(actorDto);
    }

}
