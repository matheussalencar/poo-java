package br.com.meli.models;

public class Disciplina {
    private String nome;
    private Integer carga_horaria;

    public Disciplina(String nome, Integer carga_horaria) {
        this.nome = nome;
        this.carga_horaria = carga_horaria;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "nome='" + nome + '\'' +
                ", carga_horaria=" + carga_horaria +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCarga_horaria() {
        return carga_horaria;
    }

    public void setCarga_horaria(Integer carga_horaria) {
        this.carga_horaria = carga_horaria;
    }
}
