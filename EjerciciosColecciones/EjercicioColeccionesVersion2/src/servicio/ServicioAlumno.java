/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Discoxz01
 */
public class ServicioAlumno {

    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\\n");
    private ArrayList<Alumno> listaAlumnos;

    public ServicioAlumno() {
        this.listaAlumnos = new ArrayList();
     // usar un constructor te brinda más flexibilidad y control durante la inicialización del 
     // objeto, mientras que la inicialización en línea: 
     // {private ArrayList<Alumno> listaAlumnos = new ArrayList();} es una forma más concisa y directa de 
     // establecer valores predeterminados en los atributos. La elección entre ellos 
     // depende del contexto y de tus preferencias personales.
    }

    public void crearAlumno() {

        String opcion;
        do {
            ArrayList<Integer> nota = new ArrayList(); // Nueva instancia de la lista de notas
            //importante declarar esto dentro del do while para que no se cargue todo en la misma lista "nota"
            System.out.println("Ingrese el nombre del alumno: ");
            String nombre = leer.next();
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese la nota número " + (i + 1) + ":");
                nota.add(leer.nextInt());
            }
            System.out.println("¿Desea ingresar otro alumno?");
            opcion = leer.next();
            Alumno alumno = new Alumno(nombre, nota);
            //le pasa por parámetro el nombre y la lista con las tres notas al objeto "alumno"
            // es decir, le pasa los dos atributos cargados
            listaAlumnos.add(alumno);
            // guarda el objeto alumno en una posición de la lista "listaAlumnos"
            
        } while (opcion.equalsIgnoreCase("si"));

    }

    public void buscarAlumno() {
        System.out.println("Ingrese el nombre del alumno que desea buscar: ");
        String nombre = leer.next();
        boolean encontrado = false;
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Alumno encontrado:");

                System.out.println("Nombre: " + alumno.getNombre());
                System.out.println("Notas: " + alumno.getNotas());
                double promedio = calcularPromedio(alumno);
//     Aquí se llama al método calcularPromedio y se pasa un objeto Alumno específico 
//     como argumento. El cálculo del promedio se realiza solo para ese objeto Alumno individual.
                
                System.out.println("El promedio es: " + promedio);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("El alumno no está en la lista.");
        }
    }

    public double calcularPromedio(Alumno alumno) {
        // el objeto alumno que se reciba acá depende de lo enviado,
        // puede ser un objeto individual de una lista, como también todos los objetos de una lista
        
        ArrayList<Integer> notas = alumno.getNotas();
        double suma = 0;
        for (Integer var : notas) {
            suma += var;
        }
        return suma / notas.size();
    }
}
