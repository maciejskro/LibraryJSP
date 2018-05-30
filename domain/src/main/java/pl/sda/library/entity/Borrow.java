package pl.sda.library.entity;



import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Borrow extends BaseEntity{

    private LocalDate dateOfBorrow;
    @ManyToOne
    private Book book;
    @ManyToOne
    private Borrower borrower;

    public Borrow() {
        super();
    }
}
