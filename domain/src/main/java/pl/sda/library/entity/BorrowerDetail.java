package pl.sda.library.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class BorrowerDetail extends BaseEntity {

    private String address;
    private String city;
    private String email;
    private String phoneNo;

    public BorrowerDetail() {
        super();
    }

}
