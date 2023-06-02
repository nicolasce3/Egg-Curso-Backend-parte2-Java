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
public class PerroSinAdoptar {
    private ArrayList <Perro> listaPerros;

    public PerroSinAdoptar(ArrayList<Perro> listaPerros) {
        this.listaPerros = listaPerros;
    }

    public ArrayList<Perro> getListaPerros() {
        return listaPerros;
    }

    public void setListaPerros(ArrayList<Perro> listaPerros) {
        this.listaPerros = listaPerros;
    }

    
    
    public PerroSinAdoptar(){
        listaPerros = new ArrayList();
    }
    
}
