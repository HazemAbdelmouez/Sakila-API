package org.example.repository.implementations;

import org.example.models.entities.Inventory;
import org.example.repository.interfaces.InventoryRepository;
import org.example.util.connection.ConnectionManager;

public class InventoryRepositoryImp extends MainRepositoryImp<Inventory> implements InventoryRepository {

    public InventoryRepositoryImp() {
        super(ConnectionManager.getInstance().getEntityManagerFactory().createEntityManager(), Inventory.class);
    }

}
