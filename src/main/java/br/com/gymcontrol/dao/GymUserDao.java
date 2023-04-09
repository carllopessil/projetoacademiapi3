package br.com.gymcontrol.dao;

import br.com.gymcontrol.model.GymUser;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class GymUserDao {
    public void GymUser(GymUser gymUser){

        String SQL = "INSERT INTO GYMUSER (NAME, SEXO, DATEBIRTH, EMAIL, SENHA) VALUES (?, ?, ?, ?, ?)";
        try{
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test","sa","sa");
            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, gymUser.getName());
            preparedStatement.setString(2, gymUser.getSexo());
            preparedStatement.setString(3, gymUser.getDateBirth());
            preparedStatement.setString(4, gymUser.getEmail());
            preparedStatement.setString(5, gymUser.getSenha());
            preparedStatement.execute();
            System.out.println("success in connection");
            connection.close();

        }catch (Exception e){
            System.out.println("fail in connection");

        }

    }

}