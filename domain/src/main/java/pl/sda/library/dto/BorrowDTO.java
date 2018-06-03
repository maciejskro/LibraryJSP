package pl.sda.library.dto;

import lombok.Getter;
import lombok.Setter;
import pl.sda.library.entity.Book;
import pl.sda.library.entity.Borrower;

import java.time.LocalDate;

@Getter
@Setter
public class BorrowDTO {

    private LocalDate dateOfBorrow;
    private Book book;
    private Borrower borrower;
}
