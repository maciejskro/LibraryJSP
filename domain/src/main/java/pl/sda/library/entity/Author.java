package pl.sda.library.entity;

import javax.persistence.Entity;

@Entity
public class Author extends BaseEntity {

    private String firstname;
    private String lastname;
    private String placeOfBorn;


    public Author() {
        super();
    }

    public Long getId() {
        return super.getId();
    }
    public void setId(Long id) {
        super.setId(id);
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPlaceOfBorn() {
        return placeOfBorn;
    }

    public void setPlaceOfBorn(String placeOfBorn) {
        this.placeOfBorn = placeOfBorn;
    }
}
