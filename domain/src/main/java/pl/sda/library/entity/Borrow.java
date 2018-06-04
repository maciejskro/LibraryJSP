package pl.sda.library.entity;


import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class Borrow extends BaseEntity implements Serializable {

    private LocalDate dateOfBorrow;
    @ManyToOne
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;

    @ManyToOne
    @JoinColumn(name = "borrower_id" ,nullable = false)
    private Borrower borrower;

    public Borrow() {
        super();
    }

    @Override
    public Long getId() {
        return super.getId();
    }

    @Override
    public void setId(Long id) {
        super.setId(id);
    }

    public LocalDate getDateOfBorrow() {
        return dateOfBorrow;
    }

    public void setDateOfBorrow(LocalDate dateOfBorrow) {
        this.dateOfBorrow = dateOfBorrow;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Borrower getBorrower() {
        return borrower;
    }

    public void setBorrower(Borrower borrower) {
        this.borrower = borrower;
    }
}
