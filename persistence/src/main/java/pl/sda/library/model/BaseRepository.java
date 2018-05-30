package pl.sda.library.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import java.lang.reflect.ParameterizedType;

public abstract class BaseRepository<T, K> {


    protected final EntityManager em;
    protected final EntityManagerFactory emf;
    protected final Class<T> entityClass;

    protected  BaseRepository(EntityManagerFactory emf) {
        ParameterizedType superclass = (ParameterizedType) getClass().getGenericSuperclass();
        this.emf = emf;
        this.em = emf.createEntityManager();
        this.entityClass = (Class<T>) superclass.getActualTypeArguments()[0];
    }

    public T create(T entity) {
        EntityTransaction et = null;
        try {
            et =em.getTransaction();
            et.begin();
            em.persist(entity);
            et.commit();
        } catch ( Exception e) {
            if(et != null) {
                et.rollback();
            }
        }
        return entity;
    }

    public T read(K id) {
        T result = em.find(entityClass, id);
        return result;
    }

    public T update (T entity) {
        EntityTransaction et =null;
        try {
            et = em.getTransaction();
            et.begin();
            em.merge(entity);
            et.commit();
        } catch (Exception e) {
            if (et !=null) {
                et.rollback();
            }
        }
        return entity;
    }
    public Boolean delete(T entity) {
        EntityTransaction et = null;
        try {
            et = em.getTransaction();
            et.begin();
            em.remove(entity);
            et.commit();
            return true;
        } catch (Exception e){
            if (entity != null) {
                et.rollback();
            }
            return false;
        }
    }
}
