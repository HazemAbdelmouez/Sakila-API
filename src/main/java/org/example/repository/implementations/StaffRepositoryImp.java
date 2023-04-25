package org.example.repository.implementations;

import org.example.models.entities.Staff;
import org.example.repository.interfaces.StaffRepository;
import org.example.util.connection.ConnectionManager;

import java.sql.Connection;

public class StaffRepositoryImp extends MainRepositoryImp<Staff> implements StaffRepository {

    public StaffRepositoryImp() {
        super(ConnectionManager.getInstance().getEntityManagerFactory().createEntityManager(), Staff.class);
    }

}
