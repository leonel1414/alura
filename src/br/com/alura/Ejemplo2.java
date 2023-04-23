package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class Ejemplo2 {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        String curso1 = "Geometria";
        String curso2 = "Fisica";
        String curso3 = "Quimica";
        String curso4 = "Historia";

        ArrayList <String> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);

        //mostramos los cursos
        System.out.println(cursos);

        //colecciones
        Collections.sort(cursos);
        //Collections.sort(cursos,Collections.reverseOrder());
        System.out.println(cursos);

    }
}
