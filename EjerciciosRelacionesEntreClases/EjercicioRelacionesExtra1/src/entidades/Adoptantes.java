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
public class Adoptantes {
    private ArrayList<Persona> listaPersonas;
    
    public Adoptantes(){
        listaPersonas = new ArrayList();
    }

    public Adoptantes(ArrayList<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    @Override
    public String toString() {
        return "Adoptantes{" + "listaPersonas=" + listaPersonas + '}';
    }
    
    
}
