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
public class Cine {

    private Asiento sala[][];
    private ArrayList<String> asientosLibres;
    private Pelicula pelicula;
    private Integer precio;

    
   public Cine() {
        this.sala = new Asiento[8][6];
    }

    public Cine(Asiento[][] sala, ArrayList<String> asientosLibres, Pelicula pelicula, Integer precio) {
        this.sala = sala;
        this.asientosLibres = asientosLibres;
        this.pelicula = pelicula;
        this.precio = precio;
    }

    public Asiento[][] getSala() {
        return sala;
    }

    public void setSala(Asiento[][] sala) {
        this.sala = sala;
    }

    public ArrayList<String> getAsientosLibres() {
        return asientosLibres;
    }

    public void setAsientosLibres(ArrayList<String> asientosLibres) {
        this.asientosLibres = asientosLibres;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Cine{" + "sala=" + sala + ", asientosLibres=" + asientosLibres + ", pelicula=" + pelicula + ", precio=" + precio + '}';
    }

}
