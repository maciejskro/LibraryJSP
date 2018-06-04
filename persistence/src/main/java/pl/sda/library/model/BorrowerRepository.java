package pl.sda.library.model;

import pl.sda.library.entity.Borrower;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import java.util.List;

public class BorrowerRepository extends BaseRepository<Borrower> implements IBaseRepository<Borrower> {

    private EntityTransaction et;

    public BorrowerRepository() {
        super();
        et = em.getTransaction();
    }
    public List<Borrower> findAll() {
        return super.findAll();
    }
}
