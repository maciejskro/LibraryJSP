package pl.sda.library.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="borrower")
public class Borrower extends BaseEntity {

    private String firstName;
    private String lastName;
    private String username;
    private String passwd;
    @OneToOne
    @JoinColumn(name = "id")
    private BorrowerDetail borrowerDetail;
    @OneToMany(mappedBy = "borrower")
    private List<Borrow> borrowList;


    public Borrower(){
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

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String password) {
        this.passwd = password;
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
