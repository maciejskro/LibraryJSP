package pl.sda.library.dto;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
