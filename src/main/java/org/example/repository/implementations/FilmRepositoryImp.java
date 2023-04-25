package org.example.repository.implementations;

import org.example.models.entities.Film;
import org.example.repository.interfaces.FilmRepository;
import org.example.util.connection.ConnectionManager;

public class FilmRepositoryImp extends MainRepositoryImp<Film> implements FilmRepository {
    public FilmRepositoryImp() {
        super(ConnectionManager.getInstance().getEntityManagerFactory().createEntityManager(), Film.class);
    }
}
