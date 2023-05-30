package br.com.gymcontrol.servlet;

import br.com.gymcontrol.dao.HistoryDAO;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

    @WebServlet("/InserirStatusServlet")

    public class InserirStatusServlet  extends HttpServlet {
        private static final long serialVersionUID = 1L;

        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String cpf = (String) request.getSession().getAttribute("cpf");
            boolean status = Boolean.parseBoolean(request.getParameter("status"));

            HistoryDAO historyDAO = new HistoryDAO();
            historyDAO.insertStatus(cpf, status);

            request.getRequestDispatcher("/TelaInicialLogada").forward(request, response);
        }
    }

