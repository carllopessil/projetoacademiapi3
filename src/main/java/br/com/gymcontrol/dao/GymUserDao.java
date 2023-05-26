package br.com.gymcontrol.dao;

import br.com.gymcontrol.model.CadastroTreino;
import br.com.gymcontrol.model.GymUser;
import br.com.gymcontrol.model.Usuario;

import javax.servlet.http.HttpServletRequest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class GymUserDao {
    public void GymUser(GymUser gymUser){

        //COMANDO SQL PARA CRIAR TABELA GYMUSER NO BANCO DE DADOS
        // CREATE TABLE GYMUSER(ID INT PRIMARY KEY AUTO_INCREMENT, NAME VARCHAR(255), SOBRENOME VARCHAR(255), SEXO VARCHAR(255), DATEBIRTH VARCHAR(255), EMAIL VARCHAR(255), CPF VARCHAR(255), SENHA VARCHAR(255))
        String SQL = "INSERT INTO GYMUSER (NAME, SOBRENOME, SEXO, DATEBIRTH, EMAIL, CPF, SENHA) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try{
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test","sa","sa");
            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, gymUser.getName());
            preparedStatement.setString(2, gymUser.getSobrenome());
            preparedStatement.setString(3, gymUser.getSexo());
            preparedStatement.setString(4, gymUser.getDateBirth());
            preparedStatement.setString(5, gymUser.getEmail());
            preparedStatement.setString(6, gymUser.getCpf());
            preparedStatement.setString(7, gymUser.getSenha());
            preparedStatement.execute();
            System.out.println("success in connection");
            connection.close();

        }catch (Exception e){
            System.out.println("fail in connection");

        }


        }

        public void UpdateUser(GymUser gymUser, HttpServletRequest request){
         String SQL = "UPDATE GYMUSER SET NAME=?, SOBRENOME=?, SEXO = ?, DATEBITH=?, EMAIL = ?, SET SENHA=? WHERE CPF=? ";
         try{
             String cpf = (String) request.getSession().getAttribute("cpf");

             if (cpf != null){
             Connection connection = DriverManager.getConnection("jdbc:h2:~/test","sa","sa");
             System.out.println("success in connection");
             PreparedStatement preparedStatement = connection.prepareStatement(SQL);
                 preparedStatement.setString(1, gymUser.getName());
                 preparedStatement.setString(2, gymUser.getSobrenome());
                 preparedStatement.setString(3, gymUser.getSexo());
                 preparedStatement.setString(4, gymUser.getDateBirth());
                 preparedStatement.setString(5, gymUser.getEmail());
                 preparedStatement.setString(6, gymUser.getSenha());
             System.out.println("success in update gymUser");

             connection.close();

             }
         }catch (Exception e ){
             System.out.println("deu ruim na conexão");

    }


    }
    public static List<Usuario> selectUser (String cpf){
        List<Usuario> resultados = new ArrayList<>();
        String SQL = "SELECT * FROM GYMUSER WHERE CPF = ?";
        try{
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test","sa","sa");
            System.out.println("success in connection");
            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, cpf);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()){

                String nome=rs.getString("NAME");;
                String sobrenome= rs.getString("SOBRENOME");
                String sexo= rs.getString("SEXO");
                String datebirth= rs.getString("DATEBIRTH");
                String email= rs.getString("EMAIL");
                String senha=rs.getString("SENHA");
                System.out.println(nome + sobrenome + sexo + datebirth + email + senha);

                Usuario usuario = new Usuario(nome, sobrenome, sexo, datebirth, email, senha);
                resultados.add(usuario);
            }

        } catch (Exception e){

            System.out.println("erro: "+e.getMessage());
        }
    return resultados;
    }
}

