package pl.sda.library.controller;

import pl.sda.library.dto.BookDTO;
import pl.sda.library.dto.BorrowerDTO;
import pl.sda.library.service.BookService;
import pl.sda.library.service.IBookService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/homeservlet")
public class HomeServlet extends HttpServlet {

    private final IBookService bookService;

    public HomeServlet() {
        this.bookService = new BookService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(false);
        List<BookDTO> books = bookService.findAll();
        req.setAttribute("books" , books);
        req.getRequestDispatcher("booktable.jsp").forward(req,resp);
//        if (session != null ) {
//            req.setAttribute("books" , bookService.findAll());
//            req.getRequestDispatcher("index.jsp").forward(req, resp);
//        } else  {
//            req.getRequestDispatcher("login.jsp").forward(req,resp);
//        }


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // Long bookId =  Long.valueOf( req.getParameter("bookId"));
       // req.getParameter("action");

        HttpSession session = req.getSession();
        BorrowerDTO user = (BorrowerDTO) session.getAttribute("logeduser");
        resp.sendRedirect("/homeservlet");

    }
}
