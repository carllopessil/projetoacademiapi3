package br.com.gymcontrol.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HistoryDAO {
    private static final String JDBC_URL ="jdbc:h2:~/test";
    private static final String JDBC_USERNAME = "sa";
    private static final String JDBC_PASSWORD = "sa";

    public List<Boolean> getLast30DaysStatus(String cpf) {
        List<Boolean> history = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD)) {
            String sql = "SELECT status FROM history WHERE CPF = ? ORDER BY date DESC LIMIT 30;";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, cpf);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                history.add(resultSet.getBoolean("status"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return history;
    }
    public void insertStatus(String cpf, boolean status) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD)) {
            String sql = "INSERT INTO history (CPF, status, date) VALUES (?, ?, CURRENT_DATE);";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, cpf);
            statement.setBoolean(2, status);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}