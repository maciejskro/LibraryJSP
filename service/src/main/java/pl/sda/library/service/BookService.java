package pl.sda.library.service;

import pl.sda.library.dto.BookDTO;
import pl.sda.library.entity.Author;
import pl.sda.library.entity.Book;
import pl.sda.library.entity.BooksType;
import pl.sda.library.exception.AuthorNotFoundException;
import pl.sda.library.exception.ItemNoFoundException;
import pl.sda.library.model.AuthorRepository;
import pl.sda.library.model.BookRepository;
import pl.sda.library.model.IBaseRepository;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class BookService implements IBookService  {

    private IBaseRepository<Book> bookRepository;
    private IBaseRepository<Author> authotRepository;

    public BookService() {
        this.bookRepository = new BookRepository();
        this.authotRepository = new AuthorRepository();
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
                .map( b -> { BookDTO bdto = new BookDTO(b.getId(), b.getTitle() ,"" ,b.getReleaseDate(), b.getPages()
                                    , b.getISBN(), b.getBooksType().getDescription(), b.getIsBorrow(), b.getDescription() , "sldk");
                            bdto.getAuthors(b.getAuthors());
                            return bdto; } )
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
    public Boolean addBook(BookDTO bookdto) throws  AuthorNotFoundException {
        Author a = Optional.ofNullable(authotRepository.find(1l)).orElseThrow(
                () -> {
                    return new AuthorNotFoundException("author not found");
                }
        );
        Book book = createBook(bookdto);
        book.setAuthors(Arrays.asList(a));
        bookRepository.create(book);
        return null;
    }



    @Override
    public Boolean editBook(BookDTO book) {
        return null;
    }
    private Book createBook(BookDTO bookdto) {
        Book result = new Book();
            result.setTitle(bookdto.getTitle());
            result.setDescription(bookdto.getDescription());
            result.setBooksType(BooksType.valueOf( bookdto.getBooksType() ));
        return result;
    }
}
