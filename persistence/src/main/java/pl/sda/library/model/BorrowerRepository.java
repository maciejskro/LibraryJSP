package pl.sda.library.model;

import pl.sda.library.entity.Borrower;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

public class BorrowerRepository extends BaseRepository<Borrower> implements IBaseRepository<Borrower> {

    private EntityTransaction et;

    BorrowerRepository(EntityManagerFactory emf) {
        super(emf);
        et = em.getTransaction();
    }
}
