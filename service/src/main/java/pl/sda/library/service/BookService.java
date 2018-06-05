package pl.sda.library.service;

import pl.sda.library.dto.BookDTO;
import pl.sda.library.entity.Book;
import pl.sda.library.entity.BooksType;
import pl.sda.library.exception.ItemNoFoundException;
import pl.sda.library.model.BookRepository;
import pl.sda.library.model.IBaseRepository;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BookService implements IBookService  {

    private IBaseRepository<Book> bookRepository;

    public BookService() {
        this.bookRepository = new BookRepository();

    }

    @Override
    public void removeBook(Book i) {

    }

    @Override
    public BookDTO find(Long id) throws ItemNoFoundException {
        return null;
    }

    @Override
    public List<BookDTO> findAll() {
        List<Book> bookList = bookRepository.findAll();

        return bookList.stream()
                .map( b -> new BookDTO(b.getId(), b.getTitle() ,b.getAuthors().toString() ,b.getReleaseDate(), b.getPages()
                                    , b.getISBN(), b.getBooksType().toString(), b.getIsBorrow(), b.getDescription() , "sldk") )
                .collect(Collectors.toList());
    }

    @Override
    public List<String> findAllCategory() {
        List<String> result = Arrays.stream(BooksType.values())
                .map(BooksType::getDescription)
                .collect(Collectors.toList());
        return result;
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
