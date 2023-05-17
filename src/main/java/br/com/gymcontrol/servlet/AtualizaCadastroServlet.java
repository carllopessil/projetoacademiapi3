package br.com.gymcontrol.servlet;

import br.com.gymcontrol.dao.GymUserDao;
import br.com.gymcontrol.model.GymUser;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/atualiza")
public class AtualizaCadastroServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String userId = request.getParameter("id");

        String name = request.getParameter("name");
        GymUser user = new GymUser();
        user.setName(name);
        System.out.println(name);

        String Sexo = request.getParameter("sexo");
        user.setSexo(Sexo);
        System.out.println(Sexo);

        String DateBirth = request.getParameter("DateBirth");
        user.setDateBirth(DateBirth);
        System.out.println(DateBirth);

        String Email = request.getParameter("email");
        user.setEmail(Email);
        System.out.println(Email);


        new GymUserDao().GymUser(user);
        request.getRequestDispatcher("AtualizaCadastroServlet.jsp").forward(request, response);

    }

}