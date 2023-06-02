/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainejercicioteoricorelaciones2;

import entidades.Equipo;
import entidades.Jugador;
import java.util.Scanner;

/**
 *
 * @author Discoxz01
 */
public class MainEjercicioTeoricoRelaciones2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\\n");
       

        Equipo equipo = new Equipo();
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese nombre del jugador: ");
            String nombre = leer.nextLine();
            System.out.println("Ingrese apellido del jugador: ");
            String apellido = leer.nextLine();
            System.out.println("Ingrese posición del jugador: ");
            String posicion = leer.nextLine();
            System.out.println("Ingrese número del jugador: ");
            int numero = leer.nextInt();
           
            Jugador jugador = new Jugador(nombre, apellido, posicion, numero);
            equipo.getJugador().add(jugador);
        }

        for (Jugador jugador : equipo.getJugador()) {
            System.out.println(jugador);
        }

    }

}
