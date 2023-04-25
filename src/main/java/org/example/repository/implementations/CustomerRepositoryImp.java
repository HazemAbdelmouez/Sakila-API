package org.example.repository.implementations;

import org.example.models.entities.Customer;
import org.example.repository.interfaces.CustomerRepository;
import org.example.util.connection.ConnectionManager;

public class CustomerRepositoryImp extends MainRepositoryImp<Customer> implements CustomerRepository {

    public CustomerRepositoryImp() {
        super(ConnectionManager.getInstance().getEntityManagerFactory().createEntityManager(), Customer.class);
    }

}
