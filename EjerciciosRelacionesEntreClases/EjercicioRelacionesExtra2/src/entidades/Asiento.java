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
public class Asiento {
    private String ubicacion;
    private Espectador espectador;

    public Asiento(String ubicacion, Espectador espectador) {
        this.ubicacion = ubicacion;
        this.espectador = espectador;
    }

    public Asiento() {
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Espectador getEspectador() {
        return espectador;
    }

    public void setEspectador(Espectador espectador) {
        this.espectador = espectador;
    }

    @Override
    public String toString() {
        return "Asiento{" + "ubicacion=" + ubicacion + "," + espectador + '}';
    }
}
