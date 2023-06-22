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
public class EdificioDeOficinas extends Edificio{
    private int numeroDeOficinas;
    private int cantidadDePersonas;
    private int numeroDePisos;

    public EdificioDeOficinas(int numeroDeOficinas, int cantidadDePersonas, int numeroDePisos, int ancho, int alto, int largo) {
        super(ancho, alto, largo);
        this.numeroDeOficinas = numeroDeOficinas;
        this.cantidadDePersonas = cantidadDePersonas;
        this.numeroDePisos = this.numeroDeOficinas;
    }

    public int getNumeroDeOficinas() {
        return numeroDeOficinas;
    }

    public void setNumeroDeOficinas(int numeroDeOficinas) {
        this.numeroDeOficinas = numeroDeOficinas;
    }

    public int getCantidadDePersonas() {
        return cantidadDePersonas;
    }

    public void setCantidadDePersonas(int cantidadDePersonas) {
        this.cantidadDePersonas = cantidadDePersonas;
    }

    public int getNumeroDePisos() {
        return numeroDePisos;
    }

    public void setNumeroDePisos(int numeroDePisos) {
        this.numeroDePisos = numeroDePisos;
    }



    @Override
    public int calcularSuperficie() {
       return super.largo * super.ancho;
    }

    @Override
    public int calcularVolumen() {
        return super.alto*super.largo*super.ancho;
    }
    
    
    
    public void cantPersona(){
        
        int personaPorEdificio = this.cantidadDePersonas*this.numeroDePisos;
        System.out.println("La cantidad de personas que entran en el edificio es de: " + personaPorEdificio);
    }
    
}
