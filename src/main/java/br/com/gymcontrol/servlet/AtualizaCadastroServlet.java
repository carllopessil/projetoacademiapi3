package br.com.gymcontrol.servlet;

import br.com.gymcontrol.dao.GymUserDao;
import br.com.gymcontrol.model.CadastroTreino;
import br.com.gymcontrol.model.GymUser;
import br.com.gymcontrol.model.Usuario;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/atualizaCadastroUsuario")
public class AtualizaCadastroServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Usuario> resultadosUsuario = null;
        String cpf = (String) request.getSession().getAttribute("cpf");
        System.out.println(cpf);
        resultadosUsuario = new GymUserDao().selectUser(cpf);

        Usuario usuario= resultadosUsuario.get(0);



        request.setAttribute("NomeUsuario", usuario.getNome());
        request.setAttribute("Sobrenome", usuario.getSobrenome());
        request.setAttribute("Sexo", usuario.getSexo());
        request.setAttribute("DateBirth", usuario.getDatebirth());
        request.setAttribute("Email", usuario.getEmail());
        request.setAttribute("Senha", usuario.getSenha());

        request.getRequestDispatcher("index.jsp").forward(request, response);






    }

}
