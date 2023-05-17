/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicacolecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

/**
 *
 * @author Discoxz01
 */
public class PracticaColecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // LISTAS
        ArrayList<Integer> numerosA = new ArrayList();
        Integer x = 20;
        int z = 12;
        int a = 10;
        int b = 15;
        Integer c = 30;
        // es importante declararlo Integer
        numerosA.add(x);
        numerosA.add(z);
        numerosA.add(c);
        numerosA.add(b);
        numerosA.add(a);

        System.out.println("LISTAS:");
        System.out.println(numerosA);
        System.out.println("Lista impresa con un For Each");
        for (Integer integer : numerosA) {
            System.out.println(integer);
        }

        numerosA.remove(4);
        numerosA.remove(3);
//        numerosA.remove(c);
        numerosA.remove(2);
        numerosA.remove(1);
        numerosA.remove(x);

//// después de borrar un elemento
        System.out.println("Listas después de borrar: ");
        System.out.println(numerosA);
        System.out.println("");

// CONJUNTOS
        HashSet<Integer> listadoB = new HashSet();
        Integer e = 20;
        listadoB.add(c);
        listadoB.add(26);
        listadoB.add(b);
        listadoB.add(27 + 55);

        System.out.println("CONJUNTOS: ");
        System.out.println(listadoB);
        System.out.println("Conjuntos impresos con un For Each: ");
        for (Integer integer : listadoB) {
            System.out.println(integer);
        }
        listadoB.remove(c);
        listadoB.remove(26);
        listadoB.remove(b);
        listadoB.remove(82);
        System.out.println("CONJUNTOS DESPUÉS DE BORRAR: ");
        System.out.println(listadoB);
// MAPAS
        HashMap<Integer, String> alumnos = new HashMap();

        Integer dni = 34576189;
        Integer dni2 = 36923067;

        Integer dni5 = 16487984;
        String nombreAlumno = "Pepe";
        alumnos.put(dni, nombreAlumno);
        alumnos.put(dni2, nombreAlumno + "Bostero");
        alumnos.put(121542 * 2, "Pepito Grillo"); // agregamos la llave y el valor
        alumnos.put(dni5, "Pepo");
        alumnos.put(dni5, "Pipi");
        System.out.println("");
        System.out.println("MAPAS: ");
        System.out.println(alumnos);
        System.out.println("Mapas impresos con un Map Entry o un For Each para cada parte: ");
        for (Map.Entry<Integer, String> entry : alumnos.entrySet()) {
            System.out.println("documento=" + entry.getKey() + ",nombre=" + entry.getValue());
        }
        System.out.println("");
        //Sin Map.Entry
        for (Integer dniOficial : alumnos.keySet()) {
            System.out.println("Documento: " + dni);
        }
        for (String nombre : alumnos.values()) {
            System.out.println("Nombre: " + nombre);
        }

        System.out.println("MAPAS DESPUÉS DE BORRAR: ");
        alumnos.remove(dni);
        alumnos.remove(36923067);
        alumnos.remove(121542 * 2);
        alumnos.remove(dni5);
        System.out.println(alumnos);

//                
//        HashSet<String> set = new HashSet<>();
//        set.add("Elemento 1");
//        set.add("Elemento 2");
//        set.add("Elemento 3");
//
//        System.out.println("HashSet antes de eliminar un elemento: " + set);
//
//        // Elemento que deseamos eliminar
//        String elementoEliminar = "Elemento 2";
//
//        // Eliminar el elemento si existe en el HashSet
//        boolean eliminado = set.remove(elementoEliminar);
//
//        if (eliminado) {
//            System.out.println("Elemento eliminado: " + elementoEliminar);
//        } else {
//            System.out.println("Elemento no encontrado en el HashSet.");
//        }
//
//        System.out.println("HashSet después de eliminar un elemento: " + set);
        /// MANOS A LA OBRA: CORRIGE ESTE CÓDIGO: 
        HashMap<Integer, String> personas = new HashMap();
        String n1 = "Albus";
        String n2 = "Severus";
        personas.put(55, n1);
        personas.put(65, n2);

        // MANOS A LA OBRA iterator- DETECCIÓN DE ERRORES 
        ArrayList<String> bebidas = new ArrayList();
        bebidas.add("café");
        bebidas.add("té");
        Iterator<String> it = bebidas.iterator();
        System.out.println("Elementos de la lista recorridos con el Iterator: ");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        while (it.hasNext()) {
            if (it.next().equals("café")) {
                it.remove();
            }
        }



    }

}
