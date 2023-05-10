package br.com.gymcontrol.model;

public class CadastroTreino {

    private String id;
    private String exercicio;
    private String repeticao;
    private String carga;
    private String diaSemana;



    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }



    public CadastroTreino(String exercicio) {

        this.exercicio = exercicio;
    }

    public CadastroTreino() {

    }

    public String getId() {
        return id;
    }

    public String getExercicio() {
        return exercicio;
    }

    public CadastroTreino(String id, String exercicio, String repeticao, String carga, String diaSemana) {
        this.id = id;
        this.exercicio = exercicio;
        this.repeticao = repeticao;
        this.carga = carga;
        this.diaSemana = diaSemana;
    }

    public String getCarga() {
        return carga;
    }

    public String getRepeticao() {
        return repeticao;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setExercicio(String exercicio) {
        this.exercicio = exercicio;
    }

    public void setRepeticao(String repeticao) {
        this.repeticao = repeticao;
    }

    public void setCarga(String carga) {
        this.carga = carga;
    }
}
