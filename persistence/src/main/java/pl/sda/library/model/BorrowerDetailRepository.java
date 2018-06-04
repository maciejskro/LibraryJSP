package pl.sda.library.model;

import pl.sda.library.entity.BorrowerDetail;

import javax.persistence.EntityTransaction;

public class BorrowerDetailRepository extends BaseRepository<BorrowerDetail> implements IBaseRepository<BorrowerDetail> {

    private EntityTransaction et;

    BorrowerDetailRepository() {
        super();
      //  et = em.getTransaction();
    }
}
