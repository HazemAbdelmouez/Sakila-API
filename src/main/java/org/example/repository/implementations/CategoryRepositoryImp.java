package org.example.repository.implementations;
import org.example.models.entities.Category;
import org.example.repository.implementations.MainRepositoryImp;
import org.example.repository.interfaces.CategoryRepository;
import org.example.util.connection.ConnectionManager;

public class CategoryRepositoryImp extends MainRepositoryImp<Category> implements CategoryRepository {

    public CategoryRepositoryImp() {
        super(ConnectionManager.getInstance().getEntityManagerFactory().createEntityManager(), Category.class);
    }

}
