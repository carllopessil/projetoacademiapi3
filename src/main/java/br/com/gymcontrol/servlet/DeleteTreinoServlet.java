package br.com.gymcontrol.servlet;

import br.com.gymcontrol.dao.CadastroTreinoDao;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteTreinoServlet {
    @WebServlet("/delete-treino")
    public class DeleteCarServlet extends HttpServlet {

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

            String carId = req.getParameter("id");

            new CadastroTreinoDao().deleteTreinoById(carId);

            resp.sendRedirect("/find-all-treino");

        }

    }
}
