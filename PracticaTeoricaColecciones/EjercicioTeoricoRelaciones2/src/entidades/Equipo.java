/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Discoxz01
 */
public class Equipo {
    private ArrayList<Jugador> jugador;

    public Equipo() {
        jugador = new ArrayList<>();
    }
    public Equipo(ArrayList<Jugador> jugador) {
        this.jugador = jugador;
    }

    public List<Jugador> getJugador() {
        return jugador;
    }

    public void setJugador(ArrayList<Jugador> jugador) {
        this.jugador = jugador;
    }

    @Override
    public String toString() {
        return "Equipo{" + "jugador=" + jugador + '}';
    }

   
}
