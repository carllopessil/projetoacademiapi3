package br.com.gymcontrol.dao;

import br.com.gymcontrol.model.CadastroTreino;
import br.com.gymcontrol.model.TreinosCadastrados;


import javax.servlet.http.HttpServletRequest;
import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CadastroTreinoDao {


    public CadastroTreinoDao() {

    }

    public void createTreino(CadastroTreino cadastroTreino, HttpServletRequest request) {
        String SQL = "INSERT INTO TREINOSCADASTRO (EXERCICIO, REPETICAO, CARGA, DIASEMANA, CPF) VALUES (?, ?, ?, ?, ?)";

        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");
            System.out.println("success in database connection");

            // Obtém o CPF da sessão de login do objeto request
            String cpf = (String) request.getSession().getAttribute("cpf");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, cadastroTreino.getExercicio());
            preparedStatement.setString(2, cadastroTreino.getRepeticao());
            preparedStatement.setString(3, cadastroTreino.getCarga());
            preparedStatement.setString(4, cadastroTreino.getDiaSemana());
            preparedStatement.setString(5, cpf);

            System.out.println(cadastroTreino.getExercicio());
            System.out.println(cadastroTreino.getRepeticao());
            System.out.println(cadastroTreino.getCarga());
            System.out.println(cadastroTreino.getDiaSemana());
            System.out.println(cpf);

            preparedStatement.execute();
            System.out.println("success in connection");
            JOptionPane.showMessageDialog(null, "Treino cadastrado");

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


    private static final String URL = "jdbc:h2:~/test";
    private static final String USUARIO = "sa";
    private static final String SENHA = "sa";

    public static List<CadastroTreino> buscarDadosPorDiaSemana(String diaSemana) {
        List<CadastroTreino> resultados = new ArrayList<>();

        try (Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA)) {
            String query = "SELECT * FROM TREINOSCADASTRO WHERE diaSemana = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            System.out.println("validando o select");
            stmt.setString(1, diaSemana);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                String id = rs.getString("id");
                String exercicio = rs.getString("exercicio");
                String repeticao = rs.getString("repeticao");
                String carga = rs.getString("carga");
                String diaSemana2 = rs.getString("diaSemana");

                CadastroTreino cadastroTreino = new CadastroTreino(id, exercicio, repeticao, carga, diaSemana2);
                resultados.add(cadastroTreino);
            }

        } catch (SQLException e) {
            System.out.println("não entrou");

            e.printStackTrace();
        }

        return resultados;

    }

}













