package pl.sda.library.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
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
@NoArgsConstructor
@AllArgsConstructor
public class BookDTO {

    private  Long id;
    @NotEmpty
    @Length (min =2 , max=50)
    private  String title;

    private String authorName;
    private LocalDate releaseDate;
    private Integer pages;
    private String ISBN;
    private String booksType;
    private Boolean isBorrow;
    private String description;
    private String borrowerName;


    public String getAuthors(List<Author> listauth) {
        StringBuilder sb = new StringBuilder();
        for (Author a : listauth) {
            sb.append( a.getAuthorName() + ", ");
        }
        String result = listauth.size()>0 ? sb.toString().substring(0, sb.length()-2): "" ;
        this.authorName = result;
        return result;
    }

}
