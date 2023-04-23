package br.com.alura;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Ejemplo8 {
    public static void main(String[] args) {
    String alumno1 = "Luis Miguel";
    String alumno2 = "Leonel Girett";
    String alumno3 = "Belen Gonzalez";

        Set<String> listaAlumnos = new HashSet<>();

        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        for( String alumno: listaAlumnos){
            System.out.println(alumno);
        }

        //METODO ADICIONALES DE SET
        boolean valida = listaAlumnos.contains("Leonel Girett");
        String max = listaAlumnos.stream().max(Comparator.comparingInt(String::length)).get();
        //Removiendo alumno
        listaAlumnos.removeIf(alumno -> "Leonel Girett".equalsIgnoreCase(alumno));
        for( String alumno: listaAlumnos){
            System.out.println(alumno);
        }

        //Buscando alumno
        System.out.println(listaAlumnos.stream().filter(alumno -> alumno.equalsIgnoreCase("Luis Miguel")).findFirst().orElse("No Existe"));

        System.out.println(valida);
        System.out.println(max);
        System.out.println(max.length());

    }
}
