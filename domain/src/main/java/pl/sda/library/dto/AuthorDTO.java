package pl.sda.library.dto;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class AuthorDTO {

    private Long id;
    @NotNull
    @Length(min = 2)
    private String firstname;
    @NotNull
    private String lastname;

    private String placeOfBorn;

}
