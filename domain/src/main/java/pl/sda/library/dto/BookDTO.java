package pl.sda.library.dto;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
//import Author;
//import BooksType;

import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

@Getter
@Setter
public class BookDTO {

    private  Long id;
    @NotEmpty
    @Length (min =2 , max=50)
    private  String title;

//    private Author autorID;
    private LocalDate releaseDate;
    private Integer pages;
    private String ISBN;
//    private BooksType booksType;
    private Byte isBorrow;
    private String description;

}
