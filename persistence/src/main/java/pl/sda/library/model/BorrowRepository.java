package pl.sda.library.model;

import pl.sda.library.entity.Borrow;

import javax.persistence.EntityTransaction;

public class BorrowRepository extends BaseRepository<Borrow> implements IBaseRepository<Borrow> {

    private EntityTransaction et;

    public BorrowRepository() {
        super();
       // this.et = em.getTransaction();
    }
}
