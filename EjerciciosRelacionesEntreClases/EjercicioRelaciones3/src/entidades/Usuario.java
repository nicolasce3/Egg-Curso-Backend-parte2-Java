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
public class Usuario {
    private ArrayList <Carta> usuario = new ArrayList();
    
    public Usuario() {
        usuario = new ArrayList<Carta>(); // Inicializar el objeto usuario
    }

    public ArrayList<Carta> getUsuario() {
        return usuario;
    }

    public void setUsuario(ArrayList<Carta> usuario) {
        this.usuario = usuario;
    }

    
}
