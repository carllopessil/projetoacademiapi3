package br.com.gymcontrol.model;

public class Usuario {
    String nome;
    String sobrenome;
    String sexo;
    String datebirth;
    String email;
    String senha;

    public Usuario(String nome, String sobrenome, String sexo, String datebirth, String email, String senha) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.datebirth = datebirth;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getSexo() {
        return sexo;
    }

    public String getDatebirth() {
        return datebirth;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }
}
