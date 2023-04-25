package org.example.repository.implementations;

import org.example.models.entities.Store;
import org.example.repository.interfaces.StoreRepository;
import org.example.util.connection.ConnectionManager;

public class StoreRepositoryImp extends MainRepositoryImp<Store> implements StoreRepository {

    public StoreRepositoryImp() {
        super(ConnectionManager.getInstance().getEntityManagerFactory().createEntityManager(), Store.class);
    }

}
