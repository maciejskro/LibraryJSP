package pl.sda.library.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "borrower")
public class Borrower extends BaseEntity implements Serializable {

    private String firstName;
    private String lastName;
    private String username;
    private String password;
    @OneToOne
    @JoinColumn(name = "id")
    private BorrowerDetail borrowerDetail;
    @OneToMany(mappedBy = "borrower")
    private List<Borrow> borrowList;


    public Borrower(){
    }


    public Long getId() {
        return super.getId();
    }

    public void setId(Long id) {
        super.setId(id);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public BorrowerDetail getBorrowerDetail() {
        return borrowerDetail;
    }

    public void setBorrowerDetail(BorrowerDetail borrowerDetail) {
        this.borrowerDetail = borrowerDetail;
    }

    public List<Borrow> getBorrowList() {
        return borrowList;
    }

    public void setBorrowList(List<Borrow> borrowList) {
        this.borrowList = borrowList;
    }
}
