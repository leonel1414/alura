package br.com.alura;

import br.com.alura.model.Curso;

import java.util.ArrayList;

public class Ejemplo3 {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Geometria", 30);
        Curso curso2 = new Curso("Fisica", 35);

        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);

        System.out.println(cursos);
    }
}
