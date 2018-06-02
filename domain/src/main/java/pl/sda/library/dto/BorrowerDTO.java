package pl.sda.library.dto;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class BorrowerDTO {


    private String firstName;
    private String lastName;
    @NotNull
    @Length(min=3 , max = 32)
    private String username;
    @NotNull
    @Length (min = 3, max = 64)
    private String password;

    public BorrowerDTO(@NotNull @Length(min = 3, max = 32) String username, @NotNull @Length(min = 3, max = 64) String password) {
        this.username = username;
        this.password = password;
    }
}
