package br.com.gymcontrol.dao;

import br.com.gymcontrol.model.CadastroTreino;
import br.com.gymcontrol.model.TreinosCadastrados;


import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CadastroTreinoDao {


    public CadastroTreinoDao() {

    }

    public void createTreino(CadastroTreino cadastroTreino) {
        String SQL = "INSERT INTO TREINOSCADASTRO (EXERCICIO, REPETICAO, CARGA, DIASEMANA) VALUES (?, ?, ?, ?)";



        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");
            System.out.println("success in database connection");
            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, cadastroTreino.getExercicio()); //1 = primeiro paramentro identificando na String SQL do ponto de interrogação
            preparedStatement.setString(2, cadastroTreino.getRepeticao());
            preparedStatement.setString(3, cadastroTreino.getCarga());
            preparedStatement.setString(4, cadastroTreino.getDiaSemana());

            System.out.println(cadastroTreino.getExercicio());
            System.out.println(cadastroTreino.getExercicio());
            System.out.println(cadastroTreino.getRepeticao());
            System.out.println(cadastroTreino.getDiaSemana());


            preparedStatement.execute();
            System.out.println("success in connection");
            JOptionPane.showMessageDialog(null,"Treino cadastrado");

            connection.close();


        } catch (Exception e) {
            System.out.println("fail in connection CADASTRO DO TREINO DO USUARIO");
            System.out.println(e.getMessage());
        }


    }

    public List<CadastroTreino> findAllTreino() {

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
                String carDiaSemana = resultSet.getString("diaSemana");

                CadastroTreino treino = new CadastroTreino(carId, carExercicio, carRepeticao, carCarga, carDiaSemana);

                cars.add(treino);

            }

            System.out.println("success in select * TREINO");

            connection.close();

            return cars;

        } catch (Exception e) {

            System.out.println("fail in database connection no select");

            return Collections.emptyList();

        }



    }

    public void deleteTreinoById(String TreinoId) {
        String SQL = "DELETE TREINOSCADASTRO WHERE ID = ?";

        try {

            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, TreinoId);
            preparedStatement.execute();

            System.out.println("success on delete car with id: " + TreinoId);

            connection.close();

        } catch (Exception e) {

            System.out.println("fail in database connection");

        }

    }


    public List<TreinosCadastrados> findAllCadastro() {

        String SQL = "SELECT * FROM TREINOSCADASTRO";

        try {

            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            ResultSet resultSet = preparedStatement.executeQuery();

            List<TreinosCadastrados> cars = new ArrayList<>();

            while (resultSet.next()) {
                String carId = resultSet.getString("id");
                String carExercicio = resultSet.getString("exercicio");
                String carRepeticao = resultSet.getString("repeticao");
                String carCarga = resultSet.getString("carga");
                String carDiaSemana = resultSet.getString("diaSemana");

                TreinosCadastrados treino = new TreinosCadastrados(carId, carExercicio, carRepeticao, carCarga, carDiaSemana);

                cars.add(treino);

            }

            System.out.println("success in select * TREINO");

            connection.close();

            return cars;

        } catch (Exception e) {

            System.out.println("fail in database connection no select");

            return Collections.emptyList();

        }



    }


    public void updateTreino(CadastroTreino treino) {

        String SQL = "UPDATE CAR SET NAME = ? WHERE ID = ?";

        try {

            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa","sa");

            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, treino.getExercicio());
            preparedStatement.setString(2, treino.getId());
            preparedStatement.execute();

            System.out.println("success in update car");

            connection.close();

        } catch (Exception e) {

            System.out.println("fail in database connection");
            System.out.println("Error: " + e.getMessage());

        }

    }

}
