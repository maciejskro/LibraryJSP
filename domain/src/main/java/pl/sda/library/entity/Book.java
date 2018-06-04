package pl.sda.library.entity;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="book")
public class Book extends BaseEntity {

    private String title;
    @ManyToOne
    @JoinColumn(name = "id")
    private Author autorID;
    private LocalDate releaseDate;
    private Integer pages;
    private String ISBN;
    private BooksType booksType;
    private Byte isBorrow;
    private String description;

    @OneToMany(mappedBy = "book")
    public List<Borrow> borrowList;


    public Book(){
        super();

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAutorID() {
        return autorID;
    }

    public void setAutorID(Author autorID) {
        this.autorID = autorID;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public BooksType getBooksType() {
        return booksType;
    }

    public void setBooksType(BooksType booksType) {
        this.booksType = booksType;
    }

    public Byte getIsBorrow() {
        return isBorrow;
    }

    public void setIsBorrow(Byte isBorrow) {
        this.isBorrow = isBorrow;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Borrow> getBorrowList() {
        return borrowList;
    }

    public void setBorrowList(List<Borrow> borrowList) {
        this.borrowList = borrowList;
    }
}
