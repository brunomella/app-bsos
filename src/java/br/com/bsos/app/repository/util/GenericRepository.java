package br.com.bsos.app.repository.util;

import br.com.bsos.app.modelo.util.AbstractEntity;
import java.util.Collection;



public interface GenericRepository<T extends AbstractEntity> {

    Collection<T> loadAll();

    T loadById(Long id);

    void remove(T entity);

    T save(T entity);
}