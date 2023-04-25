package org.example.repository.implementations;

import org.example.models.entities.Payment;
//import org.example.repository.implementations.MainRepositoryImp;
import org.example.repository.interfaces.PaymentRepository;
import org.example.util.connection.ConnectionManager;

public class PaymentRepositoryImp extends MainRepositoryImp<Payment> implements PaymentRepository {

    public PaymentRepositoryImp() {
        super(ConnectionManager.getInstance().getEntityManagerFactory().createEntityManager(), Payment.class);
    }

}
