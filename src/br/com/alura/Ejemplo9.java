package br.com.alura;

import br.com.alura.model.Alumno;

import java.util.*;

public class Ejemplo9 {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Leonel Girett", "001");
        Alumno alumno2 = new Alumno("Belen Gonzalez", "002");
        Alumno alumno3 = new Alumno("Milena Ramirez", "003");

        Collection<Alumno> listaAlumnos = new HashSet<>();

        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);

        Alumno alumnoNuevo = new Alumno("Leonel Girett","001");
        System.out.println(alumno1.equals(alumnoNuevo));
        System.out.println(listaAlumnos.contains(alumnoNuevo));

    }
}
