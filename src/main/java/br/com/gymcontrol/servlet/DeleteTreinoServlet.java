package br.com.gymcontrol.servlet;

import br.com.gymcontrol.dao.CadastroTreinoDao;
import br.com.gymcontrol.dao.UserDao;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/deleteTreino")
public class DeleteTreinoServlet extends HttpServlet{

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
            String cadId = req.getParameter("id");
            System.out.println(cadId);


            new CadastroTreinoDao().deleteTreinoById(cadId);



            resp.sendRedirect("/buscatreinos123");


    }
}
