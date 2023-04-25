package org.example.repository.implementations;

import org.example.models.entities.Language;
import org.example.repository.interfaces.LanguageRepository;
import org.example.util.connection.ConnectionManager;


public class LanguageRepositoryImp extends MainRepositoryImp<Language> implements LanguageRepository {

    public LanguageRepositoryImp() {
        super(ConnectionManager.getInstance().getEntityManagerFactory().createEntityManager(), Language.class);
    }

}
