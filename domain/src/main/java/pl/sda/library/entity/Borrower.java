package pl.sda.library.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
@Getter
@Setter
public class Borrower extends BaseEntity {

    private String firstName;
    private String lastName;
    private String username;
    private String password;
    @OneToOne
    private BorrowerDetail borrowerDetail;

    public Borrower(){
        super();
    }


}
