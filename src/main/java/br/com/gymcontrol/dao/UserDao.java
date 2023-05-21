package br.com.gymcontrol.dao;

import br.com.gymcontrol.model.User;

import java.sql.*;

public class UserDao {

    private static final String JDBC_URL = "jdbc:h2:~/test";
    private static final String JDBC_USERNAME = "sa";
    private static final String JDBC_PASSWORD = "sa";

    public boolean verifyCredentials(User user) {
        boolean isValid = false;

        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD)) {
            String sql = "SELECT COUNT(*) FROM GYMUSER WHERE EMAIL = ? AND SENHA = ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, user.getUsername());
                statement.setString(2, user.getPassword());

                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        int count = resultSet.getInt(1);
                        isValid = count > 0;
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return isValid;
    }

    public String getCpf(User user) {
        String cpf = null;

        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD)) {
            String sql = "SELECT cpf FROM GYMUSER WHERE EMAIL = ? AND SENHA = ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, user.getUsername());
                statement.setString(2, user.getPassword());

                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        cpf = resultSet.getString("cpf");
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return cpf;
    }
}
///
//        try {
//
//            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");
//
//            System.out.println("success in database connection");
//
//            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
//
//            preparedStatement.setString(1, user.getUsername());
//            ResultSet resultSet = preparedStatement.executeQuery();
//
//            System.out.println("success in select username");
//
//            String CPF= resultSet.getString("CPF");
//
//
//
//
//            connection.close();
//
//            return CPF;
//
//        } catch (Exception e) {
//
//            System.out.println("Error: " + e.getMessage());
//
//            return null;
//
//
