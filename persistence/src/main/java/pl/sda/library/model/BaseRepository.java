package pl.sda.library.model;


import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Order;
import javax.persistence.criteria.Root;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseRepository<T>  implements IBaseRepository<T> {

    public static final String PERSISTENCE_NAME= "persistenceUnitPostgres";
    //private static final SessionFactory SESSION_FACTORY;

    //@PersistenceContext(unitName = "persistenceUnitPostgres")
    protected EntityManager em;
    protected static EntityManagerFactory emf;
    protected Class<T> entityClass;



    protected BaseRepository() {
        ParameterizedType superclass = (ParameterizedType) getClass().getGenericSuperclass();
        if (emf == null) {
            this.emf = Persistence.createEntityManagerFactory(PERSISTENCE_NAME);
        }
        this.entityClass = (Class<T>) superclass.getActualTypeArguments()[0];
        this.em = emf.createEntityManager();
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

    public T find(Long id) {
        T result = em.find(entityClass,id);
        return result;
    }

    public List<T> findAll(Order order, String... propertiesOrder ) {

        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        CriteriaQuery<T> criteria = criteriaBuilder.createQuery(entityClass);
        Root<T> root = criteria.from(entityClass);

        List<Order>  orders = new ArrayList<>();
        for ( String prop : propertiesOrder) {
            if (order.isAscending()) {
                orders.add(criteriaBuilder.asc(root.get(prop)));
            } else
                orders.add(criteriaBuilder.desc(root.get(prop)));
        }
        criteria.orderBy(orders);
        return em.createQuery(criteria).getResultList();

    }
    public List<T> findAll() {
        List<T> result = new ArrayList<>();
        EntityTransaction et = null;
        try {
            et = em.getTransaction();
            et.begin();
            Query q = em.createQuery("select o from " + entityClass.getSimpleName() + " o");
            result = q.getResultList();
            et.commit();
        } catch (Exception e) {
            if( et !=null) {
                et.rollback();
            }
        }
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
    public void cleanUp() {
        em.close();
        //emf.close();
    }

    public EntityManager getEm() {
        return em;
    }
}
