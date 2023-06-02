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
public class Juego {

    
    private ArrayList<Jugador> jugadores;
    private RevolverDeAgua revolver;

    public Juego(ArrayList<Jugador> jugadores, RevolverDeAgua revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public Juego() {
    }

 

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public RevolverDeAgua getRevolver() {
        return revolver;
    }

    public void setRevolver(RevolverDeAgua revolver) {
        this.revolver = revolver;
    }

    public void llenarJuego(ArrayList<Jugador> jugadores2, RevolverDeAgua revolver2) {

        jugadores = jugadores2;
        revolver = revolver2;
    }

    public boolean ronda(int i) {
        boolean juegoSigue = true;
        jugadores.get(i).disparo(revolver);
       
        if (jugadores.get(i).isMojado()) {
            juegoSigue = false;
        }
        return juegoSigue;
    }

    @Override
    public String toString() {
        return "Juego{" + "r=" + revolver + ", j=" + jugadores + '}';
    }
}
