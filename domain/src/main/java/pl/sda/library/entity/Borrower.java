package pl.sda.library.entity;


import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Borrower extends BaseEntity {

    private String firstName;
    private String lastName;
    @OneToOne
    private BorrowerDetail borrowerDetail;

    public Borrower(){
        super();
    }


}
