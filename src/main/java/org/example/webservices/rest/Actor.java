package org.example.webservices.rest;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

import org.example.models.dtos.ActorDto;
import org.example.service.ActorService;

@Path("actor")
public class Actor {

ActorService actorService;

    public Actor(){
         actorService = new ActorService();

    }

    

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<ActorDto> getAllActors(){
        List<ActorDto> actors = actorService.getAllActors();
        return actors;
    }
    

   
    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public ActorDto getActorById(@PathParam("id") int id){
        ActorDto actor = actorService.findActorByID(id);
        return actor;
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public void addActor(ActorDto actorDto){
        actorService.addActor(actorDto);
    }

   

    @DELETE
    @Path("{id}")
    public Response deleteActor(@PathParam("id") int id){
        actorService.deleteActorByID(id);       
        return Response.ok().build();
    }

}