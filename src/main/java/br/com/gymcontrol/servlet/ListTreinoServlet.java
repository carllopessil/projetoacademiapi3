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
@WebServlet("/find-all-treino")
public class ListTreinoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<CadastroTreino> cars = new CadastroTreinoDao().findAllTreino();

        req.setAttribute("cars", cars);

        req.getRequestDispatcher("CadastroTreino.jsp").forward(req, resp);

    }


}
