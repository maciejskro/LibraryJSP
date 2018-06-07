package pl.sda.library.model;

import javax.persistence.criteria.Order;
import java.util.List;

public interface IBaseRepository<T> {

    T create( T entity);
    Boolean delete( T entity);
    T find( Long id);
    List<T> findAll (Order order, String... porpertiesOrder );
    List<T> findAll ();
    T update( T entity);
    void cleanUp();
}
