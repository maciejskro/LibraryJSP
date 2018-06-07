package pl.sda.library.controller;

import pl.sda.library.dto.BookDTO;
import pl.sda.library.service.AuthorService;
import pl.sda.library.service.BookService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddBookServlet extends HttpServlet {

    private final AuthorService authorservice;
    private final BookService bookservice;

    public AddBookServlet() {
        this.authorservice = new AuthorService();
        this.bookservice = new BookService();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BookDTO bookdto = createBookDto( req);
        try {
            bookservice.addBook(bookdto);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private BookDTO createBookDto(HttpServletRequest req) {
        BookDTO result = new BookDTO();
            result.setBooksType(req.getParameter("boottype"));
        return result;

    }

}
