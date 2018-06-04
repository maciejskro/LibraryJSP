package pl.sda.library.dto;

import lombok.Getter;
import lombok.Setter;
//import Book;
//import Borrower;

import java.time.LocalDate;

@Getter
@Setter
public class BorrowDTO {

    private LocalDate dateOfBorrow;
//    private Book book;
//    private Borrower borrower;
}
