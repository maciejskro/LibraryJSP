package pl.sda.library.service;

import pl.sda.library.dto.BookDTO;
import pl.sda.library.entity.Book;
import pl.sda.library.exception.ItemNoFoundException;

import java.util.List;

public interface IBookService {

    Boolean addBook(BookDTO book);

    Boolean editBook(BookDTO book);

    void removeBook(Book i);

    BookDTO find(Long id) throws ItemNoFoundException;

    List<BookDTO> findAll();

    List<String> findAllCategory();
}
