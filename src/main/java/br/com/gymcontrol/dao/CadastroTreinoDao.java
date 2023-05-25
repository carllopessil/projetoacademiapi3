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
            String cpf = (String) request.getSession().getAttribute("cpf");

            if (cpf != null){
                Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");
                System.out.println("success in database connection");

                // Obtém o CPF da sessão de login do objeto request

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

                connection.close();
              //  JOptionPane.showMessageDialog(null, "Treino cadastrado");


            } else {
                System.out.println("VOLTA PARA A TELA DE LOGIN");
                JOptionPane.showMessageDialog(null, "Entre com seu login");


            }

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


    public List<TreinosCadastrados> findAllCadastro(HttpServletRequest request) {
        String SQL = "SELECT * FROM TREINOSCADASTRO WHERE CPF = ?";

        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");
            System.out.println("success in database connection");

            // Obtém o CPF da sessão de login do objeto request
            String cpf = (String) request.getSession().getAttribute("cpf");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, cpf);

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

    public static List<CadastroTreino> buscarDadosPorDiaSemana(String diaSemana, String cpf) {
        List<CadastroTreino> resultados = new ArrayList<>();

        try (Connection conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa")) {
            String query = "SELECT * FROM TREINOSCADASTRO WHERE diaSemana = ? AND cpf = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            System.out.println("validando o select");
            stmt.setString(1, diaSemana);
            stmt.setString(2, cpf);


            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                String id = rs.getString("id");
                String exercicio = rs.getString("exercicio");
                String repeticao = rs.getString("repeticao");
                String carga = rs.getString("carga");
                String diaSemana2 = rs.getString("diaSemana");

                System.out.println(id + exercicio + repeticao + carga + diaSemana2);
                CadastroTreino cadastroTreino = new CadastroTreino(id, exercicio, repeticao, carga, diaSemana2);
                resultados.add(cadastroTreino);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados!");
            e.printStackTrace();
        }

        return resultados;
    }

    public static List<CadastroTreino> buscarDadosPorDiaSemana3(String diaSemana, String cpf) {
        List<CadastroTreino> resultados = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA)) {
            String query = "SELECT TOP 3 CARGA, EXERCICIO FROM TREINOSCADASTRO WHERE DIASEMANA = ? AND CPF = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            System.out.println("validando o select " + diaSemana);
            stmt.setString(1, diaSemana);
            stmt.setString(2, cpf);


            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                String exercicio = rs.getString("exercicio");
                String carga = rs.getString("carga");
                System.out.println(exercicio);
                System.out.println(exercicio+ carga);
                CadastroTreino cadastroTreino = new CadastroTreino(exercicio, carga);
                resultados.add(cadastroTreino);
            }

        } catch (SQLException e) {
            System.out.println("não entrou" + diaSemana);
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }

        return resultados;

    }
}













