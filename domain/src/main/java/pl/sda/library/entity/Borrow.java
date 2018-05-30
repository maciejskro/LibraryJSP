package pl.sda.library.entity;



import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
public class Borrow extends BaseEntity{

    private LocalDate dateOfBorrow;
    @ManyToOne
    private Book book;
    @ManyToOne
    private Borrower borrower;

    public Borrow() {
    }
}
