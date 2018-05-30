package pl.sda.library.dto;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

public class AuthorDTO {

    private Long id;
    @NotNull
    @Length(min = 2)
    private String firstname;
    @NotNull
    private String lastname;

    private String placeOfBorn;

}
