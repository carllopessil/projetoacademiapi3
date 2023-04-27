package br.com.gymcontrol.servlet;

import br.com.gymcontrol.dao.CadastroTreinoDao;
import br.com.gymcontrol.dao.GymUserDao;
import br.com.gymcontrol.model.CadastroTreino;
import br.com.gymcontrol.model.GymUser;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


    @WebServlet("/create-treino")
    public class CreateTreinoServlet extends HttpServlet {

        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {


            String exercicio = request.getParameter("create-treino");


            CadastroTreino treino = new CadastroTreino();
            treino.setExercicio(exercicio);
            System.out.println(exercicio);



            String repeticao = request.getParameter("repeticao");
            treino.setRepeticao(repeticao);
            System.out.println(repeticao);


            String carga = request.getParameter("carga");
            treino.setCarga(carga);
            System.out.println(carga);

            new CadastroTreinoDao().createTreino(treino);
            request.getRequestDispatcher("CadastroTreino.jsp").forward(request, response);

        }

    }


