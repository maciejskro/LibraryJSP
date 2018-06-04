package pl.sda.library.model;


import pl.sda.library.entity.Book;

import javax.persistence.EntityTransaction;
import javax.persistence.criteria.Order;
import java.util.List;


public class BookRepository extends BaseRepository<Book> implements IBaseRepository<Book> {

    private EntityTransaction et;

    public BookRepository() {
        super();
      //  this.et = em.getTransaction();
    }

    @Override
    public Book create(Book entity) {
        return super.create(entity);
    }

    @Override
    public Book find(Long bookId) {
        return find(bookId);

    }

    @Override
    public List<Book> findAll(Order order, String... porpertiesOrder) {
        return super.findAll( order, porpertiesOrder );
    }

    @Override
    public List<Book> findAll() {
        return super.findAll();
    }

    @Override
    public Boolean delete(Book entity) {
        return super.delete( entity);
    }

    @Override
    public Book update(Book entity) {
        return super.update(entity);
    }
}
