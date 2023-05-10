package br.com.gymcontrol.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/busca-treinos")
    public class BuscaTreinos extends HttpServlet {

        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, IOException {

            String treinoExercicio = request.getParameter("treino-exercicio");

            System.out.println(treinoExercicio);

            request.getRequestDispatcher("index.html").forward(request, response);

        }


    }

