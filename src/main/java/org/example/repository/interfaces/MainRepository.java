package org.example.repository.interfaces;

import java.util.List;

public interface MainRepository<T> {
    List<T> getAll();

    T getById(int id);

    T add(T entity);

    T update(T entity);

    void delete(int id);
}