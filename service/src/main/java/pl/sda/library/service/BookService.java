package pl.sda.library.service;

import pl.sda.library.dto.BookDTO;
import pl.sda.library.entity.Book;
import pl.sda.library.exception.ItemNoFoundException;

import java.util.List;

public class BookService implements IBookService  {

    @Override
    public void removeBook(Book i) {

    }

    @Override
    public BookDTO find(Long id) throws ItemNoFoundException {
        return null;
    }

    @Override
    public List<BookDTO> findAll() {
        return null;
    }

    @Override
    public List<String> findAllCategory() {
        return null;
    }

    @Override
    public Boolean addBook(BookDTO book) {
        return null;
    }

    @Override
    public Boolean editBook(BookDTO book) {
        return null;
    }
}
