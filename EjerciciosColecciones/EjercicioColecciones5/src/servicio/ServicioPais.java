/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Discoxz01
 */
public class ServicioPais {

    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\\n");
    private HashSet<String> paises;

    public ServicioPais() {
        this.paises = new HashSet();
    }

    public void menuPaises() {
        int opcion;
        do {

            System.out.println("Menú para cargar países: ");
            System.out.println("");
            System.out.println("Ingrese una opción: ");

            System.out.println("    1 - Agregar país al conjunto.");
            System.out.println("    2 - Mostrar conjunto de países.");
            System.out.println("    3 - Ordenar alfabéticamente los países y mostrarlos.");
            System.out.println("    4 - Borrar un país del conjunto.");
            System.out.println("    5 - Salir.");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    cargarPaises();
                case 2:
                    mostrarPaises();
                case 3:
                    ordenarAlfabeticamente();
                case 4:
                    buscarPais();
                case 5:
                    System.out.println("Saliendo del programa.");
            }

        } while (opcion < 5);

    }

    public void cargarPaises() {
        String respuesta;

        do {

            System.out.println("Ingrese un país: ");
            String nombrePais = leer.next();
            paises.add(nombrePais);
            System.out.println("¿Desea agregar otro país?");
            respuesta = leer.next();

        } while (!respuesta.equalsIgnoreCase("no"));

    }

    public void mostrarPaises() {
        for (String paise : paises) {
            System.out.println(paise);
        }
    }

    public void ordenarAlfabeticamente() {

        ArrayList<String> paisesOrdenados = new ArrayList(paises);
        Collections.sort(paisesOrdenados);

        System.out.println("Mostrar países ordenados alfabéticamente: ");

        for (String var : paisesOrdenados) {
            System.out.println(var);
        }

    }

    public void buscarPais() {
        System.out.println("Ingrese un país para buscarlo en la lista: ");
        String buscarPais = leer.next();

        int contador = 0;

        Iterator<String> it = paises.iterator();

        while (it.hasNext()) {
            if (it.next().equals(buscarPais)) {
                it.remove();
                contador += 1;
            }
        }

        if (contador > 0) {
            System.out.println("El país buscado estaba en la lista y se ha borrado con éxito.");
            System.out.println(paises);
        } else {
            System.out.println("El país buscado no estaba en la lista.");
            System.out.println(paises);
        }

    }

}
