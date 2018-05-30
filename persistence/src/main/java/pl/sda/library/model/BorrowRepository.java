package pl.sda.library.model;

import pl.sda.library.entity.Borrow;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

public class BorrowRepository extends BaseRepository<Borrow> implements IBaseRepository<Borrow> {

    private EntityTransaction et;

    BorrowRepository(EntityManagerFactory emf) {
        super(emf);
        this.et = em.getTransaction();
    }
}
