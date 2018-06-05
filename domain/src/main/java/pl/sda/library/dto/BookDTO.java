package pl.sda.library.dto;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import pl.sda.library.entity.Author;
//import Author;
//import BooksType;

import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class BookDTO {

    private  Long id;
    @NotEmpty
    @Length (min =2 , max=50)
    private  String title;

    private String autorName;
    private LocalDate releaseDate;
    private Integer pages;
    private String ISBN;
    private String booksType;
    private Byte isBorrow;
    private String description;
    private String borrowerName;

    public BookDTO(Long id, @NotEmpty @Length(min = 2, max = 50) String title, String autorName, LocalDate releaseDate, Integer pages, String ISBN, String booksType, Byte isBorrow, String description, String borrowerName) {
        this.id = id;
        this.title = title;
        this.autorName = autorName;
        this.releaseDate = releaseDate;
        this.pages = pages;
        this.ISBN = ISBN;
        this.booksType = booksType;
        this.isBorrow = isBorrow;
        this.description = description;
        this.borrowerName = borrowerName;
    }

    public String getAuthors(List<Author> listauth) {
        StringBuilder sb = new StringBuilder();
        for (Author a : listauth) {
            sb.append( getAutorName() + ", ");
        }
        return sb.toString().substring(0, sb.length()-2);
    }
}
