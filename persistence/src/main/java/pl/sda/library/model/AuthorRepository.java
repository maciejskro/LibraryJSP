package pl.sda.library.model;

import pl.sda.library.entity.Author;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class AuthorRepository extends BaseRepository<Author, Long> {


    protected AuthorRepository(EntityManagerFactory emf) {
        super(emf);
    }
}
