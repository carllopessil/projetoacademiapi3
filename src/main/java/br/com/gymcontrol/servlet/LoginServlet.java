package br.com.gymcontrol.servlet;

import br.com.gymcontrol.dao.UserDao;
import br.com.gymcontrol.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getRequestDispatcher("TelaPrincipal.html").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        User user = new User(username, password);

        boolean isValidUser = new UserDao().verifyCredentials(user);

        if (isValidUser) {

            req.getSession().setAttribute("username", username);

            resp.sendRedirect("InicioLoged.html");

        } else {

            req.setAttribute("message", "Invalid credentials!");

//            req.getRequestDispatcher("TelaPrincipal.html").forward(req, resp);

            resp.sendRedirect("/login#openModal");

        }

    }


}