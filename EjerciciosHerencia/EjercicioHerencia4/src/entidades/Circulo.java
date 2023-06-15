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
public class Circulo implements CalculosFormas {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo() {
      
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

   

    @Override
    public double calcularArea() {
        return PI * Math.pow(this.radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return PI * (this.radio * 2);
    }

}
