/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainejerciciorelacionesextra2;

import entidades.Cine;
import entidades.Pelicula;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import servicio.ServicioCine;

/**
 *
 * @author Discoxz01
 */
public class MainEjercicioRelacionesExtra2 {

    /**
     * Nos piden hacer un programa sobre un Cine, que tiene una sala con un
     * conjunto de asientos (8 filas por 6 columnas). De Cine nos interesa
     * conocer la película que se está reproduciendo, la sala con los
     * espectadores y el precio de la entrada. Luego, de las películas nos
     * interesa saber el título, duración, edad mínima y director. Por último,
     * del espectador, nos interesa saber su nombre, edad y el dinero que tiene
     * disponible. Para representar la sala con los espectadores vamos a
     * utilizar una matriz. Los asientos son etiquetados por una letra y un
     * número la fila A1 empieza al final del mapa como se muestra en la tabla.
     * También deberemos saber si el asiento está ocupado por un espectador o
     * no, si esta ocupado se muestra una X, sino un espacio vacío.
     */
    public static void main(String[] args) {

        ServicioCine servicio = new ServicioCine();
        servicio.menu();

    }
}
