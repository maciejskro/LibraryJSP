package pl.sda.library.model;

public interface IntBaseRepository<T> {

    T create( T entity);
    Boolean delete( T entity);
    T read( Long id);
    T update( T entity);
}
