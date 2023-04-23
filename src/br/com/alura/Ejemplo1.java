package br.com.alura;

import java.util.ArrayList;

public class Ejemplo1 {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        String variable1 = "Ejemplo 1";
        String variable2 = "Ejemplo 2";
        String variable3 = "Ejemplo 3";

        ArrayList <String> lista = new ArrayList<>();
        lista.add(variable1);
        lista.add(variable2);
        lista.add(variable3);

        System.out.println(lista.size());

        ///

        /*
        for (int i=0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
        */
        /*
        for (String li: lista){
            System.out.println(li);
        }
        */
        lista.forEach(li ->{
            System.out.println(li);
        });
    }
}
