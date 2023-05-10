package br.com.gymcontrol.model;

public class TreinosCadastrados {
    private String id;
    private String exercicio;
    private String repeticao;
    private String carga;
    private String diaSemana;


    public TreinosCadastrados() {

    }

    public TreinosCadastrados(String id, String exercicio, String repeticao, String carga, String diaSemana) {
        this.id = id;
        this.exercicio = exercicio;
        this.repeticao = repeticao;
        this.carga = carga;
        this.diaSemana = diaSemana;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getExercicio() {
        return exercicio;
    }

    public void setExercicio(String exercicio) {
        this.exercicio = exercicio;
    }

    public String getRepeticao() {
        return repeticao;
    }

    public void setRepeticao(String repeticao) {
        this.repeticao = repeticao;
    }

    public String getCarga() {
        return carga;
    }

    public void setCarga(String carga) {
        this.carga = carga;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }
}
