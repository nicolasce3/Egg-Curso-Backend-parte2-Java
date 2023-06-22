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
public class Polideportivo extends Edificio {

    private String nombre;
    private String tipoDeInstalacion;

    public Polideportivo(String nombre, String tipoDeInstalacion, int ancho, int alto, int largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoDeInstalacion = tipoDeInstalacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDeInstalacion() {
        return tipoDeInstalacion;
    }

    public void setTipoDeInstalacion(String tipoDeInstalacion) {
        this.tipoDeInstalacion = tipoDeInstalacion;
    }
    
    
    @Override
    public int calcularSuperficie() {
          return super.largo * super.ancho;
    }

    @Override
    public int calcularVolumen() {
        return super.alto*super.largo*super.ancho;
    }
    
}
