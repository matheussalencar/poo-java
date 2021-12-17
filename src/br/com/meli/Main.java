package br.com.meli;

import br.com.meli.models.Disciplina;
import br.com.meli.models.Estudante;
import br.com.meli.models.Turma;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        LocalDate localDateMath = LocalDate.of(1999, 07, 24);
        Estudante matheus = new Estudante("Matheus", localDateMath,"abcd23442", 8 );

        LocalDate localDateFulano = LocalDate.of(1999, 02, 15);
        Estudante fulano = new Estudante("Fulano", localDateFulano,"abe2d2e442", 8 );


        LocalDate localDateBeltrano = LocalDate.of(1999, 5, 07);
        Estudante beltrano = new Estudante("Matheus", localDateBeltrano,"abc444562", 8 );

        Estudante[] estudantes = new Estudante[3];
        estudantes[0] = matheus;
        estudantes[1] = fulano;
        estudantes[2] = beltrano;


        Disciplina matematica = new Disciplina("Matematica", 360);
        Disciplina portugues = new Disciplina("Portgues", 80);
        Disciplina historia = new Disciplina("Historia", 95);

        Disciplina[] disciplinas = new Disciplina[3];
        disciplinas[0] = matematica;
        disciplinas[1] = portugues;
        disciplinas[2] = historia;

        Turma turmaA = new Turma();

        turmaA.setSerie(8);
        turmaA.setCodigo(36);
        turmaA.setDisciplinas(disciplinas);
        turmaA.setEstudantes(estudantes);

        System.out.println( turmaA.toString());

    }
}
