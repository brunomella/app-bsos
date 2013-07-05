package br.com.bsos.app.dao.util;

import br.com.bsos.app.modelo.util.AbstractEntity;
import br.com.bsos.app.repository.util.GenericRepository;
import java.lang.reflect.ParameterizedType;
import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.Query;



public abstract class GenericDao<T extends AbstractEntity> implements GenericRepository<T> {

  
    protected final EntityManager manager;
    protected final Class<T> clazz;

    protected GenericDao(EntityManager manager) {
        
        this.manager = manager;

        @SuppressWarnings("unchecked")
        Class<T> classe = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];

        this.clazz = classe;
    }

    
    @Override
    public Collection<T> loadAll() {
        Query query = manager.createQuery("from " + clazz.getName());

        @SuppressWarnings("unchecked")
        Collection<T> resultList = query.getResultList();

        return resultList;
    }

    @Override
    public T loadById(Long id) {
        return manager.find(clazz, id);
    }

    @Override
    public void remove(T entity) {
        manager.remove(manager.getReference(clazz, entity.getId()));
    }

    @Override
    public T save(T entity) {
        return manager.merge(entity);
    }
   
    
}