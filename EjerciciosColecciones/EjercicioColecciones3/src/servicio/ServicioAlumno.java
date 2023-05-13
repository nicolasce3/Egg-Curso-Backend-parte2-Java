/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.Alumnos;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Discoxz01
 */
public class ServicioAlumno {

    ;
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\\n");

    public ArrayList<Alumnos> crearAlumno() {
        ArrayList<Alumnos> listaAlumnos = new ArrayList();
        String respuesta;
        int contador = 1;

        do {
            System.out.print("Ingrese el nombre del alumno " + contador + ":");
            String nombre = leer.next();

            ArrayList<Integer> notas = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                System.out.print("Ingrese la nota " + (i + 1) + ": ");
                int nota = leer.nextInt();
                notas.add(nota);
            }

            Alumnos alumno = new Alumnos(nombre, notas);
            listaAlumnos.add(alumno);

            System.out.print("¿Desea crear otro alumno? (si/no): ");
            respuesta = leer.next();
            contador++;
        } while (respuesta.equalsIgnoreCase("si"));
        return listaAlumnos;
    }

    public Alumnos buscarAlumno(ArrayList<Alumnos> listaAlumn) {
        System.out.println("Ingrese el nombre del alumno que desea buscar en la lista: ");
        String buscarAlumno = leer.next();
        for (Alumnos alumno : listaAlumn) {
            if (alumno.getNombre().equalsIgnoreCase(buscarAlumno)) {
                return alumno; // retorna el objeto Alumnos correspondiente al alumno encontrado
            }
        }

        return null; // retorna null si el alumno no se encuentra en la lista
    }

    public double calcularPromedioAlumno(Alumnos alumno) {
        ArrayList<Integer> notas = alumno.getNotas();
        double suma = 0;
        for (Integer var : notas) {
            suma += var;
        }
        return suma / notas.size();
    }
}
//        Iterator<Alumnos> it = listaAlumn.iterator();
//        while (it.hasNext()) {
//            if (it.next().equals(buscarAlumno)) {
//                System.out.println("Estoy acá.");
//                return true;
//            }
//        }
//        for (Alumnos var : listaAlumn) {
//            if (var.getNombre().equalsIgnoreCase(buscarAlumno)) {
//                return true;
//            }
//        }
