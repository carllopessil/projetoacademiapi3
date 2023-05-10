package br.com.gymcontrol.servlet;

import br.com.gymcontrol.dao.CadastroTreinoDao;
import br.com.gymcontrol.model.CadastroTreino;
import br.com.gymcontrol.model.TreinosCadastrados;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet("/find-all-cadastro")
public class ListCadastroTreinoServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<TreinosCadastrados> cars = new CadastroTreinoDao().findAllCadastro();
        req.setAttribute("cars", cars);
        req.getRequestDispatcher("AlterarTreino.jsp").forward(req, resp);

    }
}
