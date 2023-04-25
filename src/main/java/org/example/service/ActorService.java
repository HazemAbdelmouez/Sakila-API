package org.example.service;

import org.example.mappers.ActorMapper;
import org.example.models.dtos.ActorDto;
import org.example.models.entities.Actor;
import org.example.repository.implementations.ActorRepositoryImp;
import org.example.repository.interfaces.ActorRepository;

import java.util.ArrayList;
import java.util.List;

public class ActorService {

    ActorRepository actorRepository;


    public ActorService(){
        this.actorRepository = new ActorRepositoryImp();
    }

    public List<ActorDto> getAllActors(){

        List<ActorDto> actorsDto = new ArrayList<ActorDto>();

        for(Actor actor: actorRepository.getAll()){

            actorsDto.add(ActorMapper.MAPPER.mapToActorDTO(actor));
        }
        return  actorsDto;
    }

    public void addActor(ActorDto actorDto){
        Actor actor = ActorMapper.MAPPER.mapToActor(actorDto);

        actorRepository.add(actor);
    }

    public ActorDto findActorByID(int id){
        ActorDto actorDto;

        actorDto = ActorMapper.MAPPER.mapToActorDTO(actorRepository.getById(id));

        return actorDto;
    }

    public void deleteActorByID(int id){
        actorRepository.delete(id);
    }
}
