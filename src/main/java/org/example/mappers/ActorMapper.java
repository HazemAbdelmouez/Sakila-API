package org.example.mappers;

import org.example.models.dtos.ActorDto;
import org.example.models.entities.Actor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ActorMapper {

    ActorMapper MAPPER = Mappers.getMapper(ActorMapper.class);

    ActorDto mapToActorDTO(Actor actor);

    Actor mapToActor(ActorDto actorDto);
}
