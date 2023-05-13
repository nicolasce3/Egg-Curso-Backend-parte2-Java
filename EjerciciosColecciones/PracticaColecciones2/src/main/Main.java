/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidades.Libro;
import java.util.ArrayList;

/**
 *
 *
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Libro> listaLibros = new ArrayList();
        Libro libro = new Libro("Samanta Schweblin", "Pájaros en la Boca");
        Libro libro2 = new Libro("Franz Kafka", "La metamorfosis");
        Libro libro3 = new Libro("César Aira", "El llanto");
        Libro libro4 = new Libro("Juan José Saer", "La pesquisa");
        Libro libro5 = new Libro("Mariana Enriquez", "Los peligros de fumar en la cama");

        listaLibros.add(libro);
        listaLibros.add(libro2);
        listaLibros.add(libro3);
        listaLibros.add(libro4);
        listaLibros.add(libro5);
        for (Libro var : listaLibros) {
            System.out.println(var);
        }
        
    }

}
//        String libro = "Pájaros en la boca";
//        String libro2 = "La metamorfosis";
//        String libro3 = "El llanto";
//        String libro4 = "Los peligros de fumar en la cama";
//        String libro5 = "La pesquisa";
        