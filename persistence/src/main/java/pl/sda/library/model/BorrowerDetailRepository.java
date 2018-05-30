package pl.sda.library.model;

import pl.sda.library.entity.BorrowerDetail;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

public class BorrowerDetailRepository extends BaseRepository<BorrowerDetail> implements IBaseRepository<BorrowerDetail> {

    private EntityTransaction et;

    BorrowerDetailRepository(EntityManagerFactory emf) {
        super(emf);
        et = em.getTransaction();
    }
}
