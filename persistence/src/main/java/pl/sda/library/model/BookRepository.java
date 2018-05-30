package pl.sda.library.model;


import pl.sda.library.entity.Book;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import java.util.List;


public class BookRepository extends BaseRepository {

    private EntityTransaction et;

    public BookRepository(EntityManagerFactory emf) {
        super(emf);
    }

    @Override
    public Object create(Object entity) {
        Book book = (Book) entity;
        super.create(book);
        return entity;
    }

    public Book find(Long bookId) {
        return find(bookId);

    }

    public List<Book> find() {
        return null;
    }


    @Override
    public Boolean delete(Object entity) {
        return super.delete( entity);
    }

    public Object read(Long id) {
        return null;
    }

    @Override
    public Object update(Object entity) {
        return null;
    }
}
