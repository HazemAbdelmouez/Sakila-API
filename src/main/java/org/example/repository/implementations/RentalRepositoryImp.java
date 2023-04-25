package org.example.repository.implementations;


import org.example.models.entities.Rental;
import org.example.repository.interfaces.RentalRepository;
import org.example.util.connection.ConnectionManager;

public class RentalRepositoryImp extends MainRepositoryImp<Rental> implements RentalRepository {

    public RentalRepositoryImp() {
        super(ConnectionManager.getInstance().getEntityManagerFactory().createEntityManager(), Rental.class);
    }

}
