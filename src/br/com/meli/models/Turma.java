package br.com.meli.models;

import java.util.Arrays;

public class Turma {
    private Integer serie;
    private Integer codigo;
    private Disciplina[] disciplinas;
    private Estudante[] estudantes;

    public Turma(Integer serie, Integer codigo, Disciplina[] disciplinas, Estudante[] estudantes) {
        this.serie = serie;
        this.codigo = codigo;
        this.disciplinas = disciplinas;
        this.estudantes = estudantes;
    }

    public Turma() {
    }

    @Override
    public String toString() {
        return "Turma{" +
                "serie='" + serie + '\'' +
                ", codigo=" + codigo + "\n" +
                ", disciplinas=" + Arrays.toString(disciplinas) + "\n" +
                ", estudantes=" + Arrays.toString(estudantes) + 
                '}';
    }

    public Integer getSerie() {
        return serie;
    }

    public void setSerie(Integer serie) {
        this.serie = serie;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Disciplina[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(Disciplina[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    public Estudante[] getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(Estudante[] estudantes) {
        this.estudantes = estudantes;
    }
}
