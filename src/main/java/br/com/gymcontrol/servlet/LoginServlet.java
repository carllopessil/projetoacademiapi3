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

        req.setAttribute("message", "Login invalido!!");
        req.getRequestDispatcher("TelaPrincipal.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");



        User user = new User(username, password);
        UserDao userDao = new UserDao();


        boolean isValidUser = userDao.verifyCredentials(user);


        if (isValidUser) {
            String cpf = userDao.getCpf(user);
            req.getSession().setAttribute("cpf", cpf);
            System.out.println(cpf);
            resp.sendRedirect("InicioLoged.jsp");

        } else {

            resp.sendRedirect("/login#openModal");

        }

    }


}
