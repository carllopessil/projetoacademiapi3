package br.com.gymcontrol.dao;

import br.com.gymcontrol.model.CadastroTreino;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CadastroTreinoDao {
    public CadastroTreinoDao(String exercicio) {

    }
    public CadastroTreinoDao(CadastroTreino cadastroTreino) {

    }

    public CadastroTreinoDao() {

    }

    public void createTreino(CadastroTreino cadastroTreino) {
        String SQL = "INSERT INTO TREINOSCADASTRO (EXERCICIO, REPETICAO, CARGA) VALUES (?, ?, ?)";



        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");
            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, cadastroTreino.getExercicio()); //1 = primeiro paramentro identificando na String SQL do ponto de interrogação
            preparedStatement.setString(2, cadastroTreino.getRepeticao());
           preparedStatement.setString(3, cadastroTreino.getCarga());
            preparedStatement.execute();
            System.out.println("success in connection");
            connection.close();
            System.out.println(cadastroTreino.getExercicio());
            System.out.println(cadastroTreino.getRepeticao());

        } catch (Exception e) {
            System.out.println("fail in connection");
        }
    }

    public List<CadastroTreino> findAllCars() {

        String SQL = "SELECT * FROM TREINO";

        try {

            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            ResultSet resultSet = preparedStatement.executeQuery();

            List<CadastroTreino> cars = new ArrayList<>();

            while (resultSet.next()) {

                String carId = resultSet.getString("id");
                String carExercicio = resultSet.getString("exercicio");
                String carRepeticao = resultSet.getString("repeticao");
                String carCarga = resultSet.getString("carga");
                CadastroTreino treino = new CadastroTreino(carId, carExercicio, carRepeticao, carCarga);

                cars.add(treino);

            }

            System.out.println("success in select * TREINO");

            connection.close();

            return cars;

        } catch (Exception e) {

            System.out.println("fail in database connection");

            return Collections.emptyList();

        }

    }
}


