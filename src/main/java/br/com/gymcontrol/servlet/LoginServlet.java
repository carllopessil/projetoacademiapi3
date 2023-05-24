package br.com.gymcontrol.servlet;

import br.com.gymcontrol.dao.CadastroTreinoDao;
import br.com.gymcontrol.dao.UserDao;
import br.com.gymcontrol.model.CadastroTreino;
import br.com.gymcontrol.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

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



            List<CadastroTreino> resultadosSegunda = null;
            List<CadastroTreino> resultadosTerca = null;
            List<CadastroTreino> resultadosQuarta = null;
            List<CadastroTreino> resultadosQuinta = null;
            List<CadastroTreino> resultadosSexta = null;
            List<CadastroTreino> resultadosSabado = null;
            List<CadastroTreino> resultadosDomingo = null;


            String nome = UserDao.PegaNome(req);
            System.out.println(nome);


            resultadosSegunda = CadastroTreinoDao.buscarDadosPorDiaSemana3("Segunda-Feira", cpf);
            System.out.println("teste" + resultadosSegunda.toString());

            resultadosTerca = CadastroTreinoDao.buscarDadosPorDiaSemana3("Terça-Feira", cpf);

            resultadosQuarta = CadastroTreinoDao.buscarDadosPorDiaSemana3("Quarta-Feira", cpf);

            resultadosQuinta = CadastroTreinoDao.buscarDadosPorDiaSemana3("Quinta-Feira", cpf);

            resultadosSexta = CadastroTreinoDao.buscarDadosPorDiaSemana3("Sexta-Feira", cpf);

            resultadosSabado = CadastroTreinoDao.buscarDadosPorDiaSemana3("Sabado", cpf);

            resultadosDomingo = CadastroTreinoDao.buscarDadosPorDiaSemana3("Domingo", cpf);

            req.setAttribute("nome", nome);
            req.setAttribute("resultadosSeg", resultadosSegunda);
            req.setAttribute("resultadosTer", resultadosTerca);
            req.setAttribute("resultadosQua", resultadosQuarta);
            req.setAttribute("resultadosQui", resultadosQuinta);
            req.setAttribute("resultadosSex", resultadosSexta);
            req.setAttribute("resultadosSab", resultadosSabado);
            req.setAttribute("resultadosDom", resultadosDomingo);


            req.getRequestDispatcher("InicioLoged.jsp").forward(req, resp);

        } else {

            resp.sendRedirect("/login#openModal");

        }

    }


}
