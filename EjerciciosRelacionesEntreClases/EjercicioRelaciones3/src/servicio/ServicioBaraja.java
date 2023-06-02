/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.Baraja;
import entidades.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Discoxz01
 */
public class ServicioBaraja {

    public void crearBaraja(Baraja baraja) {

        ArrayList<Carta> listaCartas = baraja.getCartas();

        String[] palos = {"espadas", "oro", "copas", "bastos"};

        for (String palo : palos) {
            for (int i = 0; i < 12; i++) {
                if (i + 1 != 8 && i + 1 != 9) {
                    Integer numero = i + 1;
                    Carta carta = new Carta(numero, palo);
                    listaCartas.add(carta);
                }
            }
        }

    }

    public void menu(ArrayList<Carta> baraja, ArrayList<Carta> usuario) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\\n");
        int opcion;
        do {

            System.out.println("Baraja de cartas españolas");
            System.out.println("Elija una opcion");
            System.out.println("1-Ordenar aleatoriamente.");
            System.out.println("2-Dar siguiente carta");
            System.out.println("3-Mostrar número de cartas disponibles");
            System.out.println("4-Dar cartas");
            System.out.println("5-Mostrar cartas que salieron de la baraja");
            System.out.println("6-Mostrar baraja");
            System.out.println("7-Salir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ordenando la baraja.");
                    barajar(baraja);
                    break;
                case 2:

                    siguienteCarta(baraja, usuario);
                    break;
                case 3:
                    cartasDisponibles(baraja);
                    break;
                case 4:
                    darCartas(baraja, usuario);
                    break;
                case 5:

                    cartasMonton(usuario);
                    break;
                case 6:

                    mostrarBaraja(baraja);
                    break;
                case 7:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Ingrese una opción válida");

            }

        } while (opcion != 7);

    }

    public void mostrarBaraja(ArrayList<Carta> baraja) {
        if (!baraja.isEmpty()) {
            System.out.println("Mostrando el maso: ");
            for (Carta carta : baraja) {
                System.out.println(carta);
            }
        } else {
            System.out.println("La baraja está vacía ya que se repartieron todas las cartas.");
        }

    }

    public void barajar(ArrayList<Carta> baraja) {
        Collections.shuffle(baraja);
    }

    public void siguienteCarta(ArrayList<Carta> baraja, ArrayList<Carta> usuario) {
        if (!baraja.isEmpty()) {
            System.out.println("Dando la siguiente carta.");
            usuario.add(baraja.get(0));
            baraja.remove(0);
        } else {
            System.out.println("No quedan más cartas en la baraja.");
        }

    }

    public void cartasDisponibles(ArrayList<Carta> baraja) {
        System.out.println("Quedan " + baraja.size() + " cartas en la baraja.");
    }

    public void darCartas(ArrayList<Carta> baraja, ArrayList<Carta> usuario) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\\n");
        System.out.println("Ingrese el número de cartas que va a repartir.");
        int cantidad = leer.nextInt();
        if (cantidad <= baraja.size()) {
            System.out.println("Repartiendo cartas.");
            for (int i = 0; i < cantidad; i++) {
                usuario.add(baraja.get(0));
                baraja.remove(0);
            }
        } else {
            System.out.println("No se han podido entregar las cartas.");
        }
    }

    public void cartasMonton(ArrayList<Carta> barajaUsuario) {
        if (!barajaUsuario.isEmpty()) {
            System.out.println("Mostrando cartas repartidas:");
            for (Carta carta : barajaUsuario) {
                System.out.println(carta);
            }
        } else {
            System.out.println("Todavía no se ha repartido ninguna carta.");
        }
    }
}
