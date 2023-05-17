package br.com.gymcontrol.servlet;


import br.com.gymcontrol.dao.CadastroTreinoDao;
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

        if (diaSemana != null) {
            List<CadastroTreino> resultados = null;

            if (diaSemana.equals("segunda")) {
                resultados = CadastroTreinoDao.buscarDadosPorDiaSemana("Segunda-Feira");
            } else if (diaSemana.equals("terca")) {
                resultados = CadastroTreinoDao.buscarDadosPorDiaSemana("Terça-Feira");
            } else if (diaSemana.equals("quarta")) {
                resultados = CadastroTreinoDao.buscarDadosPorDiaSemana("Quarta-Feira");
            }


            request.setAttribute("resultados", resultados);
            request.getRequestDispatcher("pagina-de-resultado.jsp").forward(request, response);
        }

}
}









