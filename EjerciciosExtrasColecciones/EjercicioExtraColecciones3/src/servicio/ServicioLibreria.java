/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.Libro;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Discoxz01
 */
public class ServicioLibreria {

    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\\n");
    private HashSet<Libro> listaLibros;

    public ServicioLibreria(HashSet<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public void menu() {
        int opcion;

        do {
            System.out.println("");
            System.out.println("Librería");
            System.out.println("");
            System.out.println("Ingrese una opción: ");
            System.out.println("1 - Prestamo de libro.");
            System.out.println("2 - Devolver libro.");
            System.out.println("3 - Mostrar libros. ");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:

                case 2:

                case 3:
                    mostrarLibros();
                    break;
                case 4:
                    System.out.println("Fin del programa");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (opcion
                != 4);

    }

    public void mostrarLibros() {
        for (Libro listaLibro : listaLibros) {
            System.out.println(listaLibro);

        }
    }

    public void prestamo() {

    }
}
