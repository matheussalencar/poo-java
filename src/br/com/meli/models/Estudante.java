package br.com.meli.models;

import java.time.LocalDate;

public class Estudante {
    private String nome;
    private LocalDate dt_nascimento;
    private String matricula;
    private Integer serie;

    public Estudante(String nome, LocalDate dt_nascimento, String matricula, Integer serie) {
        this.nome = nome;
        this.dt_nascimento = dt_nascimento;
        this.matricula = matricula;
        this.serie = serie;
    }

    public Estudante() {
    }

    @Override
    public String toString() {
        return "Estudante{" +
                "nome='" + nome + '\'' +
                ", dt_nascimento=" + dt_nascimento +
                ", matricula='" + matricula + '\'' +
                ", serie='" + serie + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDt_nascimento() {
        return dt_nascimento;
    }

    public void setDt_nascimento(LocalDate dt_nascimento) {
        this.dt_nascimento = dt_nascimento;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getSerie() {
        return serie;
    }

    public void setSerie(Integer serie) {
        this.serie = serie;
    }


}
