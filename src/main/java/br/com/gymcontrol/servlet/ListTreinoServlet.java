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
import java.util.ArrayList;
import java.util.List;
@WebServlet("/find-all-treino")
public class ListTreinoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<CadastroTreino> cars = new CadastroTreinoDao().findAllTreino();
        List diaSemana = new CadastroTreinoDao().DiaDaSemana();

        if (!diaSemana.isEmpty()){
            req.setAttribute("DiaSemana", diaSemana);

        }else {
            System.out.println("Está vazio");
        }
        req.setAttribute("cars", cars);
        for (int i = 0;i<10;i++ ) {
            System.out.println(diaSemana.get(0));

        }

        req.getRequestDispatcher("CadastroTreino.jsp").forward(req, resp);

        String nome = UserDao.PegaNome(req);
        req.setAttribute("nome", nome);
    }

}
