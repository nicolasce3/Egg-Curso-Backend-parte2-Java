/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.Polideportivo;
import java.util.Scanner;

/**
 *
 * @author Discoxz01
 */
public class ServicioPolideportivo {
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\\n");
    public Polideportivo crearPolideportivo() {
        System.out.println("Ingrese el ancho del edificio: ");
        int ancho = leer.nextInt();
        System.out.println("Ingrese el alto del edificio: ");
        int alto = leer.nextInt();
        System.out.println("Ingrese el largo del edificio: ");
        int largo = leer.nextInt();
        System.out.println("Ingrese el nombre del polideportivo: ");
        String nombre = leer.next();
        System.out.println("Ingrese una de las opciones: ");
        System.out.println("1 - Techado");
        System.out.println("2 - Abierto");
        String techo = "";
        int opcion = leer.nextInt();
        if (opcion == 1){
            techo = "techado";
        }else if(opcion == 2){
            techo = "abierto";
        }
        
        return new Polideportivo(nombre,techo,ancho,alto,largo);
    }
}
