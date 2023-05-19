/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Discoxz01
 */
public class CantanteFamoso {
    private String nombreCantante;
    private String discoConMasVentas;

    public CantanteFamoso() {
    }

    public CantanteFamoso(String nombreCantante, String discoConMasVentas) {
        this.nombreCantante = nombreCantante;
        this.discoConMasVentas = discoConMasVentas;
    }

    public String getNombreCantante() {
        return nombreCantante;
    }

    public void setNombreCantante(String nombreCantante) {
        this.nombreCantante = nombreCantante;
    }

    public String getDiscoConMasVentas() {
        return discoConMasVentas;
    }

    public void setDiscoConMasVentas(String discoConMasVentas) {
        this.discoConMasVentas = discoConMasVentas;
    }

    @Override
    public String toString() {
        return  "Nombre del cantante = " + nombreCantante + ", Disco con más ventas = " + discoConMasVentas;
    }
    
    
    
    
    
}
