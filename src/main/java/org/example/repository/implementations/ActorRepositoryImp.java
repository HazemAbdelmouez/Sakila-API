package org.example.repository.implementations;

import org.example.models.entities.Actor;
import org.example.repository.interfaces.ActorRepository;
import org.example.util.connection.ConnectionManager;

public class ActorRepositoryImp extends MainRepositoryImp<Actor> implements ActorRepository {

    public ActorRepositoryImp() {
        super(ConnectionManager.getInstance().getEntityManagerFactory().createEntityManager(), Actor.class);
    }

}
