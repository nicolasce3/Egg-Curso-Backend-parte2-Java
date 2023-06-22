/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.EdificioDeOficinas;
import java.util.Scanner;

/**
 *
 * @author Discoxz01
 */
public class ServicioEdificioDeOficinas {
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\\n");
    public EdificioDeOficinas crearEdificioDeOficinas() {
        System.out.println("Ingrese el ancho del edificio: ");
        int ancho = leer.nextInt();
        System.out.println("Ingrese el alto del edificio: ");
        int alto = leer.nextInt();
        System.out.println("Ingrese el largo del edificio: ");
        int largo = leer.nextInt();
        System.out.println("Ingrese el número de oficinas: ");
        int numOficinas = leer.nextInt();
        System.out.println("Ingrese la cantidad de personas que entran por oficina: ");
        int personasPorOficina = leer.nextInt();
        int pisos = numOficinas;
        
        return new EdificioDeOficinas(numOficinas,personasPorOficina, pisos, ancho,alto,largo);
        
    }
}
