package pl.sda.library.controller;

import pl.sda.library.service.BorrowerService;
import pl.sda.library.service.IBorrowerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/authenticate")
public class AutheticationServlet extends HttpServlet {

    private final IBorrowerService borrowService;

    public AutheticationServlet() {
        this.borrowService = new BorrowerService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("login.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String lostPass = req.getParameter("lostpass");



        // get all user
        // if contains user then store sesion and redirect homesevlet
        // other retun login_content.jsp with error


    }
}
