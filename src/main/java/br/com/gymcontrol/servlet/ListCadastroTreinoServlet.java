package br.com.gymcontrol.servlet;

import br.com.gymcontrol.dao.CadastroTreinoDao;
import br.com.gymcontrol.dao.UserDao;
import br.com.gymcontrol.model.CadastroTreino;
import br.com.gymcontrol.model.TreinosCadastrados;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet("/buscatreinos123")
public class ListCadastroTreinoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<TreinosCadastrados> TreinosCad = new CadastroTreinoDao().findAllCadastro(req);
        req.setAttribute("TreinosCad", TreinosCad);
        String nome = UserDao.PegaNome(req);
        req.setAttribute("nome", nome);
        req.getRequestDispatcher("AlterarTreino.jsp").forward(req, resp);

    }

}
