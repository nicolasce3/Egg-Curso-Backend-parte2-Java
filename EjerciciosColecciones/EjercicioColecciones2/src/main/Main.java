/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * Continuando el ejercicio anterior, después de mostrar los perros, al usuario
 * se le pedirá un perro y se recorrerá la lista con un Iterator, se buscará el
 * perro en la lista. Si el perro está en la lista, se eliminará el perro que
 * ingresó el usuario y se mostrará la lista ordenada. Si el perro no se
 * encuentra en la lista, se le informará al usuario y se mostrará la lista
 * ordenada.
 */
public class Main {

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
        Iterator<String> it = lista.iterator();
        System.out.println("Ingrese una raza de perro para buscar en la lista: ");
        String buscarRaza = leer.next();

        if (!lista.contains(buscarRaza)) {

            System.out.println("La raza de perro no se encontró en la lista.");
        }

        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(buscarRaza)) {
                it.remove();
                
            }

        }
        System.out.println("");

        System.out.println("Razas de perros ordenadas");
        Collections.sort(lista);
        for (String var2 : lista) {
            System.out.println("Raza de perro: " + var2);
        }

    }
}
