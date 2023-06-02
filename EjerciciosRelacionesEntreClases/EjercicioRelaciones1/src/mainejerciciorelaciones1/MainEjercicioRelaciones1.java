/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainejerciciorelaciones1;

import entidades.Perro;
import entidades.Persona;
import java.util.Scanner;

/**
 *
 * Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a
 * contar de dos clases. Perro, que tendrá como atributos: nombre, raza, edad y
 * tamaño; y la clase Persona con atributos: nombre, apellido, edad, documento y
 * Perro. Ahora deberemos en el main crear dos Personas y dos Perros. Después,
 * vamos a tener que pensar la lógica necesaria para asignarle a cada Persona un
 * Perro y por ultimo, mostrar desde la clase Persona, la información del Perro
 * y de la Persona.
 */
public class MainEjercicioRelaciones1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\\n");

        System.out.println("Cargando datos de perros.");
        Perro perro1 = null;
        Perro perro2 = null;
        for (int i = 0; i < 2; i++) {
            System.out.println("Ingrese el nombre del perro " + (i + 1));
            String nombre = leer.next();
            System.out.println("Ingrese la raza del perro " + (i + 1));
            String raza = leer.next();
            System.out.println("Ingrese la edad del perro " + (i + 1));
            int edad = leer.nextInt();
            System.out.println("Ingrese el tamaño (en centímetros) del perro " + (i + 1));
            int tamaño = leer.nextInt();
            if (i == 0) {
                perro1 = new Perro(nombre, raza, edad, tamaño);
            } else {
                perro2 = new Perro(nombre, raza, edad, tamaño);
            }

        }

        boolean perro1Lleno = false;
         
        Persona persona1 = null;
        Persona persona2 = null;
        
        for (int i = 0; i < 2; i++) {
            System.out.println("Ingrese el nombre de la persona " + (i + 1));
            String nombre = leer.next();
            System.out.println("Ingrese el apellido de la persona  " + (i + 1));
            String apellido = leer.next();
            System.out.println("Ingrese la edad de la persona " + (i + 1));
            int edad = leer.nextInt();
            System.out.println("Ingrese el documento de la persona " + (i + 1));
            int documento = leer.nextInt();
            String raza;
            if (i == 0) {
                do {
                    System.out.println("Ingrese que raza de perro quiere.");
                    System.out.println("Razas disponibles: ");
                    System.out.println(perro1.getRaza());
                    System.out.println(perro2.getRaza());
                    raza = leer.next();
                    if (raza.equalsIgnoreCase(perro1.getRaza())) {
                         persona1 = new Persona(nombre, apellido, edad, documento, perro1);
                        perro1Lleno = true;
                    } else if (raza.equalsIgnoreCase(perro2.getRaza())) {
                        persona1 = new Persona(nombre, apellido, edad, documento, perro2);
                    } else {
                        System.out.println("La raza no existe.");
                    }

                } while (!raza.equalsIgnoreCase(perro1.getRaza()) && !raza.equalsIgnoreCase(perro2.getRaza()));

            }else{
                if( perro1Lleno == true){
                     persona2 = new Persona(nombre, apellido, edad,documento, perro2);
                }else{
                     persona2 = new Persona(nombre, apellido, edad,documento, perro1);
                }
            }

        }
   
    persona1.mostrarPersona(persona1);
    persona2.mostrarPersona(persona2);
    }

}
