/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Discoxz01
 */
public class ServicioPelicula {

    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\\n");
    private ArrayList<Pelicula> listaPeliculas;

    public ServicioPelicula() {
        this.listaPeliculas = new ArrayList();
    }

    public void cargarPelicula() {
        String opcion;
        do {
            System.out.println("Ingrese el título de la película: ");
            String titulo = leer.next();
            System.out.println("Ingrese el nombre del director: ");
            String director = leer.next();
            System.out.println("Ingrese la duración de la película: ");
            int duracion = leer.nextInt();
            while (duracion > 21 || duracion < 0) {
                System.out.println("Duración inválida. Por favor, ingrese una duración de entre 0 y 21 horas: ");
                duracion = leer.nextInt();
            }

            Pelicula pelicula = new Pelicula(titulo, director, duracion);
            listaPeliculas.add(pelicula);

            System.out.println("¿Desea agregar otra película?(si/no)");
            opcion = leer.next();
            while (!opcion.equalsIgnoreCase("si") && !opcion.equalsIgnoreCase("no")) {
                System.out.println("Opción inválida. Por favor, ingrese 'si' o 'no'.");
                opcion = leer.next();
            }

        } while (opcion.equalsIgnoreCase("si"));

    }

    public void mostrarPeliculas() {
        System.out.println("");
        System.out.println("Lista de películas: ");
        for (Pelicula pelicula : listaPeliculas) {
            System.out.println(pelicula);
        }
    }

    public void mostrarPeliculasMasDeUnaHora() {
        System.out.println("");

        System.out.println("Lista de películas que duran más de una hora: ");
        for (Pelicula pelicula : listaPeliculas) {
            if (pelicula.getDuracion() > 1) {
                System.out.println(pelicula);
            }
        }

    }

    public void ordenarPeliculaDuracionMayorAMenor() {
        System.out.println("");

        System.out.println("Lista de películas ordenadas por duración de mayor a menor:");

        listaPeliculas.sort(Pelicula.ordenarDuracion);
        for (Pelicula listaPelicula : listaPeliculas) {
            System.out.println(listaPelicula);
        }

    }

    public void ordenarPeliculaDuracionMenorAMayor() {
        System.out.println("");

        System.out.println("Lista de películas ordenadas por duración de menor a mayor:");

        listaPeliculas.sort(Pelicula.ordenarDuracionMenor);
        for (Pelicula listaPelicula : listaPeliculas) {
            System.out.println(listaPelicula);
        }

    }

    public void ordenarPeliculaTitulo() {
        System.out.println("");

        System.out.println("Lista de películas ordenadas alfabéticamente por título:");

        listaPeliculas.sort(Pelicula.ordenarTitulo);
        for (Pelicula listaPelicula : listaPeliculas) {
            System.out.println(listaPelicula);
        }

    }

    public void ordenarPeliculaDirector() {
        System.out.println("");

        System.out.println("Lista de películas ordenadas alfabéticamente por director:");

        listaPeliculas.sort(Pelicula.ordenarDirector);
        for (Pelicula listaPelicula : listaPeliculas) {
            System.out.println(listaPelicula);
        }

    }
}
