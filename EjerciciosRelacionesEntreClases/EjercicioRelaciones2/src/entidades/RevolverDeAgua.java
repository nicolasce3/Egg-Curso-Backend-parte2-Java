/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Random;

/**
 *
 * @author Discoxz01
 */
public class RevolverDeAgua {

    Random random = new Random();

    private int posicionActual;
    private int posicionAgua;

    public RevolverDeAgua() {
    }

    public RevolverDeAgua(int posicionActual, int posicionagua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionagua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionagua() {
        return posicionAgua;
    }

    public void setPosicionagua(int posicionagua) {
        this.posicionAgua = posicionagua;
    }

    public void llenarRevolver() {
     // le pone los valores a posición actual y posición del agua. Los valores 
     // se generan de manera aleatoria con Math.random.
        posicionActual = (int) (Math.random() * 6 + 1);
        posicionAgua = (int) (Math.random() * 6 + 1);
      
    }

    public boolean mojar() {
      // devuelve true si la posición del agua coincide con la posición actual 
        
        if (posicionActual == posicionAgua){
          return true;
      }else{
          return false;
      }
 
      
    }

    public void siguienteChorro(){
        // cambia a la siguiente posición del tambor 
        // si la posicion está en la última posición se vuelve a la posición 1
        if (posicionActual == 6){
           posicionActual = 1;
        }else{
            posicionActual = posicionActual +1;
        }
        
        
    }

    @Override
    public String toString() {
        return "RevolverDeAgua{" +  "posicionActual =" + posicionActual + ", posicionAgua =" + posicionAgua + '}';
    }
    
}


