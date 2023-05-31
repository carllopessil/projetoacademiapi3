package br.com.gymcontrol.servlet;

import br.com.gymcontrol.dao.GymUserDao;
import br.com.gymcontrol.model.Usuario;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/atualizaUsuario123")
public class AtualizaUsuarioServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String cpf = (String) request.getSession().getAttribute("cpf");
        System.out.println(cpf);

        Usuario usuario = new Usuario(
                request.getParameter("name"),
                request.getParameter("sobrenome"),
                request.getParameter("sexo"),
                request.getParameter("DateBirth"),
                request.getParameter("email"),
                request.getParameter("senha")
        );

        boolean isUpdated = new GymUserDao().updateUser(usuario, cpf);
        if (isUpdated) {
            request.getRequestDispatcher("/TelaInicialLogada").forward(request, response);
        } else {
            response.sendRedirect("ErroAtualizarCadastro.jsp");
        }
    }
}