package pl.sda.library.controller;

import org.dom4j.rule.Action;
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

@WebServlet("/homeservlet")
public class HomeServlet extends HttpServlet {

    private final IBookService bookService;

    public HomeServlet() {
        this.bookService = new BookService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(false);
        if (session != null ) {
            req.setAttribute("books" , bookService.findAll());
            req.getRequestDispatcher("index.jsp").forward(req, resp);
        } else  {
            req.getRequestDispatcher("login_content.jsp").forward(req,resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // Long bookId =  Long.valueOf( req.getParameter("bookId"));
       // req.getParameter("action");

        HttpSession session = req.getSession();
        BorrowerDTO user = (BorrowerDTO) session.getAttribute("logeduser");

    }
}
