/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainejercicioextracolecciones2;

import entidades.CantanteFamoso;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos
 * y tendrá como atributos el nombre y discoConMasVentas. Se debe, además, en el
 * main, crear una lista de tipo CantanteFamoso y agregar 5 objetos de tipo
 * CantanteFamoso a la lista. Luego, se debe mostrar los nombres de cada
 * cantante y su disco con más ventas por pantalla. Una vez agregado los 5, en
 * otro bucle, crear un menú que le de la opción al usuario de agregar un
 * cantante más, mostrar todos los cantantes, eliminar un cantante que el
 * usuario elija o de salir del programa. Al final se deberá mostrar la lista
 * con todos los cambios.
 */
public class MainEjercicioExtraColecciones2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashSet<CantanteFamoso> listaCantantes = new HashSet();
        // si quiero agregar un objeto a una lista se declara con el nombre de la clase 
        // con la cual creo el objeto.

        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\\n");
        int contador = 1;
        do {
            System.out.println("Ingrese el nombre completo del cantante" + contador + ":");
            String nombre = leer.next();
            System.out.println("Ingrese su disco más vendido");
            String disco = leer.next();
            contador++;
            CantanteFamoso cantante = new CantanteFamoso(nombre, disco);
            listaCantantes.add(cantante);

        } while (listaCantantes.size() < 5);

        for (CantanteFamoso listaCantante : listaCantantes) {
            System.out.println(listaCantante);
        }
        int opcion;

        do {

            System.out.println("");
            System.out.println("---Carga de cantantes ---");
            System.out.println("¿Qué desea hacer?");
            System.out.println("1- Agregar Cantante y disco.");
            System.out.println("2- Mostrar la lista de cantantes y su disco más vendido.");
            System.out.println("3- Eliminar cantante de la lista.");
            System.out.println("4- Salir.");
            System.out.println("");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre completo del cantante que desea agregar a la lista:");
                    String nombre = leer.next();
                    System.out.println("Ingrese su disco más vendido");
                    String disco = leer.next();

                    CantanteFamoso cantante = new CantanteFamoso(nombre, disco);
                    listaCantantes.add(cantante);
                    System.out.println("Información cargada exitosamente.");
                    break;

                case 2:
                    for (CantanteFamoso listaCantante : listaCantantes) {
                        System.out.println(listaCantante);
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del cantante que desea eliminar: ");
                    String nombreEliminar = leer.next();
//                    System.out.println("Ingrese su disco más vendido.");
//                    String discoEliminar = leer.next();
//                    CantanteFamoso cantanteAux = new CantanteFamoso(nombreEliminar,discoEliminar);
                    boolean bandera = false;
                    
                    
                    Iterator<CantanteFamoso> it = listaCantantes.iterator();
                    while (it.hasNext()) {
                        CantanteFamoso cantanteAux = it.next();
                        
                        if (cantanteAux.getNombreCantante().equalsIgnoreCase(nombreEliminar)) {
                            it.remove();
                            System.out.println("Cantante eliminado.");
                            bandera = true;
                            break;
                        }
                    }

                    if (bandera == false){
                        System.out.println("Cantante no encontrado.");
                    }
                    
                    break;
                case 4:
                    System.out.println("Fin del programa.");
                    break;

                default:
                    System.out.println("ERROR. Opción no valida");
            }

        } while (opcion != 4);

    }

}
