/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocolecciones1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo
 * String. El programa pedirá una raza de perro en un bucle, el mismo se
 * guardará en la lista y después se le preguntará al usuario si quiere guardar
 * otro perro o si quiere salir. Si decide salir, se mostrará todos los perros
 * guardados en el ArrayList.
 */
public class EjercicioColecciones1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\\n");
        ArrayList<String> lista = new ArrayList();
        System.out.println("Ingrese una raza de perro: ");
        String raza = leer.next();
        lista.add(raza);
        System.out.println("¿Desea ingresar otra raza de perro?(NO/SI)");
        String opcion = leer.next();
        while (opcion.equalsIgnoreCase("si")) {
            System.out.println("Ingrese una raza de perro: ");
            raza = leer.next();
            lista.add(raza);
            System.out.println("¿Desea ingresar otra raza de perro?(NO/SI)");
            opcion = leer.next();
        }

        for (String var : lista) {
            System.out.println("Raza de perro: " + var);
        }

    }

}
