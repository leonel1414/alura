package br.com.alura;

import br.com.alura.model.Curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ejemplo4 {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Java", 30);
        Curso curso2 = new Curso("C#", 25);
        Curso curso3 = new Curso("PHP", 15);

        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);

        System.out.println(cursos);
        Collections.sort(cursos);

        //ordenar nuestra lista por nombre descendentemente de cursos excluyendo PHP
        List<Curso> cursoList = cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("PHP")).sorted(Comparator.comparing(Curso::getNombre).reversed()).collect(Collectors.toList());
        System.out.println(cursoList);
    }
}
