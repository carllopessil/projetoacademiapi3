package br.com.gymcontrol.servlet;


import br.com.gymcontrol.dao.CadastroTreinoDao;
import br.com.gymcontrol.dao.UserDao;
import br.com.gymcontrol.model.CadastroTreino;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/MeuServlet")

public class BuscaTreinosServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String diaSemana = request.getParameter("dia");
        String cpf = (String) request.getSession().getAttribute("cpf");
        String nome = UserDao.PegaNome(request);
        System.out.println(nome);


        if (cpf == null) {
            response.sendRedirect("TelaPrincipal.jsp"); // Redireciona para a página de login
            return; // Encerra o processamento do servlet
        }
        if (diaSemana != null) {
            List<CadastroTreino> resultados = null;

            if (diaSemana.equals("segunda")) {
                resultados = CadastroTreinoDao.buscarDadosPorDiaSemana("Segunda-Feira", cpf);
            } else if (diaSemana.equals("terca")) {
                resultados = CadastroTreinoDao.buscarDadosPorDiaSemana("Terça-Feira", cpf);
            } else if (diaSemana.equals("quarta")) {
                resultados = CadastroTreinoDao.buscarDadosPorDiaSemana("Quarta-Feira", cpf);

        } else if (diaSemana.equals("quinta")) {
            resultados = CadastroTreinoDao.buscarDadosPorDiaSemana("Quinta-Feira", cpf);

        } else if (diaSemana.equals("sexta")) {
            resultados = CadastroTreinoDao.buscarDadosPorDiaSemana("Sexta-Feira", cpf);

        } else if (diaSemana.equals("sabado")) {
            resultados = CadastroTreinoDao.buscarDadosPorDiaSemana("Sabado", cpf);

        } else if (diaSemana.equals("domingo")) {
            resultados = CadastroTreinoDao.buscarDadosPorDiaSemana("Domingo", cpf);
        }

            request.setAttribute("nome", nome);
            request.setAttribute("resultados", resultados);
            request.getRequestDispatcher("pagina-de-resultado.jsp").forward(request, response);
        }
}

}









