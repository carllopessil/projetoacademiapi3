package br.com.gymcontrol.servlet;

import br.com.gymcontrol.dao.HistoryDAO;
import com.google.gson.Gson;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HistoryServlet")
public class HistoryServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        String cpf = (String) request.getSession().getAttribute("cpf");
        HistoryDAO historyDAO = new HistoryDAO();
        List<Boolean> history = historyDAO.getLast30DaysStatus(cpf);

        PrintWriter out = response.getWriter();
        Gson gson = new Gson();
        out.print(gson.toJson(history));
        out.flush();
    }
}