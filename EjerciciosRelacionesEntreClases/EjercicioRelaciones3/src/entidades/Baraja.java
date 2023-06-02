/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author Discoxz01
 */
public class Baraja {

    private ArrayList<Carta> cartas;

    public Baraja() {
        cartas = new ArrayList<Carta>(); // Inicializar el objeto cartas
    }

 

    public Baraja(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }

    @Override
    public String toString() {
        return "Baraja{" + "cartas=" + cartas + '}';
    }

    public void crearBaraja() {

        for (int i = 0; i < 12; i++) {
            if (i + 1 != 8 && i + 1 != 9) {
                Integer numero = i + 1;
                String palo = "espadas";

                Carta carta = new Carta(numero, palo);
                System.out.println(carta);
                cartas.add(carta);
            }
        }

        for (int i = 0; i < 12; i++) {
            if (i + 1 != 8 && i + 1 != 9) {
                Integer numero = i + 1;
                String palo = "bastos";

                Carta carta = new Carta(numero, palo);
                cartas.add(carta);
            }
        }

        for (int i = 0; i < 12; i++) {
            if (i + 1 != 8 && i + 1 != 9) {
                Integer numero = i + 1;
                String palo = "oros";

                Carta carta = new Carta(numero, palo);
                cartas.add(carta);
            }
        }

        for (int i = 0; i < 12; i++) {
            if (i + 1 != 8 && i + 1 != 9) {
                Integer numero = i + 1;
                String palo = "copas";

                Carta carta = new Carta(numero, palo);
                cartas.add(carta);
            }
        }

        for (Carta carta : cartas) {
            System.out.println(carta);
        }
    }

    public void mostrarBaraja() {
        for (Carta carta : cartas) {
            System.out.println(carta);
        }
    }

}
