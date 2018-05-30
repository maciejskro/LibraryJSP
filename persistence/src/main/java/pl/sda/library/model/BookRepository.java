package pl.sda.library.model;


import pl.sda.library.entity.Book;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.criteria.Order;
import java.util.List;


public class BookRepository extends BaseRepository<Book> implements IBaseRepository<Book> {

    private EntityTransaction et;

    public BookRepository(EntityManagerFactory emf) {
        super(emf);
        this.et = em.getTransaction();
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
    public List findAll(Order order, String... porpertiesOrder) {
        return super.findAll( null, "was" );
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
