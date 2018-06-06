package pl.sda.library.model;

import pl.sda.library.entity.Author;

import javax.persistence.EntityTransaction;

public class AuthorRepository extends BaseRepository<Author> implements IBaseRepository<Author> {

    private EntityTransaction et;

    public AuthorRepository() {
        super();
       // et = em.getTransaction();
    }


}
