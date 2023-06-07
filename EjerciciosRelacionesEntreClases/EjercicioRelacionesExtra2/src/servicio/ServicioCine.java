/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.Asiento;
import entidades.Cine;
import entidades.Espectador;
import entidades.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Discoxz01
 */
public class ServicioCine {

    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\\n");

    public void menu() {
        Cine cine = new Cine();
        int opcion;
        do {
            System.out.println("\nMenú del sistema de CineMark\n");
            System.out.println("Elija una opción:");
            System.out.println("1- Crear nueva sala");
            System.out.println("2- Cargar película");
            System.out.println("3- Asignar espectadores a la sala");
            System.out.println("4- Ver estado de la sala");
            System.out.println("5- Ver información de un asiento de la sala");
            System.out.println("");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Creando sala.");
                    crearSala(cine);
                    System.out.println("Sala creada.");
                    break;
                case 2:
                    System.out.println("Cargando pelicula");
                    cargarPelicula(cine);
                    System.out.println("Película cargada");
                    break;
                case 3:

                    asignarEspectadores(cine);

                    break;
                case 4:
                    System.out.println("Estado de la sala:\n");
                    mostrarSala(cine);
                    break;
                case 5:
                    mostrarDatosAsiento(cine);
                    break;
                case 6:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 6);

    }

    public void cargarPelicula(Cine cine) {

        System.out.println("Ingrese el título de la pelicula");
        String titulo = leer.next();

        System.out.println("Ingrese la duración de la película en minutos:");
        Integer duracion = leer.nextInt();
        System.out.println("Ingrese la edad mínima para ver la película: ");
        Integer edad = leer.nextInt();
        System.out.println("Ingrese el nombre del director de la película:");
        String director = leer.next();
        Pelicula pelicula = new Pelicula(titulo, duracion, edad, director);
        cine.setPelicula(pelicula);
        System.out.println("Indique el precio de la entrada");
        cine.setPrecio(leer.nextInt());
        System.out.println(pelicula);
    }

    public void asignarEspectadores(Cine cine) {
        if (cine.getSala() != null) {
            System.out.println("Asignando espectadores");
            int cantidadEspectadores = (int) (Math.random() * (100 - 30 + 1) + 30);
            System.out.println("Cantidad de espectadores: " + cantidadEspectadores);
            int fila, columna;
            int contadorEspectadoresValidados = 0;
            int contadorEspectadoresRechazados = 0;
            int cantidadDeEspectadores = (int) (Math.random() * (80 - 10 + 1) + 10);

            for (int i = 0; i < cantidadDeEspectadores; i++) {
                Espectador espectador;
                espectador = crearEspectador(i);

                do {
                    fila = (int) (Math.random() * 8);
                    columna = (int) (Math.random() * 6);

                } while (cine.getSala()[fila][columna].getUbicacion().contains("X"));

                if (espectador.getDinero() >= cine.getPrecio() && espectador.getEdad() > cine.getPelicula().getEdadMinima()) {

                    cine.getSala()[fila][columna].setUbicacion(cine.getSala()[fila][columna].getUbicacion() + "X");
                    cine.getSala()[fila][columna].setEspectador(espectador);
                    contadorEspectadoresValidados++;

                }

            }
            System.out.println("Espectadores asignados a la sala");
            System.out.println("Espectadors validados: " + contadorEspectadoresValidados);
            System.out.println("Espectadores rechazados: " + (cantidadEspectadores - contadorEspectadoresValidados));
        } else {
            System.out.println("No hay ninguna sala de cine creada.");
        }

    }

    public Espectador crearEspectador(int i) {
        String nombre = "Persona " + i;
        int edad = (int) (Math.random() * (70 - 6 + 1) + 6);
        int dinero = (int) (Math.random() * (2000 - 500 + 1) + 500);

        Espectador espectador = new Espectador(nombre, edad, dinero);
        return espectador;
    }

    public void crearSala(Cine cine) {

        String[] letras = {"F", "E", "D", "C", "B", "A"};

        for (int i = 8; i > 0; i--) {

            for (int j = 6; j > 0; j--) {

                Asiento asiento = new Asiento(i + letras[j - 1], null);
                cine.getSala()[i - 1][j - 1] = asiento;
            }

        }
        System.out.println("****");
    }

    public void mostrarSala(Cine cine) {

        for (int i = 8; i > 0; i--) {

            for (int j = 6; j > 0; j--) {

                System.out.print(cine.getSala()[i - 1][j - 1].getUbicacion() + " | ");
            }
            System.out.println("");

        }
    }

    public void mostrarDatosAsiento(Cine cine) {

        String asiento;

        boolean asientoEsta = false;
        do {
            System.out.println("Ingrese el asiento del cual quiere ver sus datos: \n");
            mostrarSala(cine);
            System.out.println("");
            asiento = leer.next();
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 6; j++) {
                    if (cine.getSala()[i][j].getUbicacion().contains(asiento)) {
                        System.out.println(cine.getSala()[i][j]);
                        asientoEsta = true;
                    }
                }
            }
            if (asientoEsta == false) {
                System.out.println("No hay ningún asiento con ese código.");
            }
        } while (!asientoEsta);

    }
}
