/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainejercicioteoricorelaciones1;

import entidades.DNI;
import entidades.Persona;

/**
 *
 * Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un 
 * objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba 
 * acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main. 
 */
public class MainEjercicioTeoricoRelaciones1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DNI dni = new DNI();
        dni.setSerie('A');
        dni.setNumero(3039215);
        Persona persona = new Persona();
        persona.setDni(dni);
        persona.setNombre("Nicolas");
        persona.setApellido("Trod");
        System.out.println(persona);
    }
    
}
