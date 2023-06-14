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
public class Lavadora extends Electrodomestico {
    private int carga;

    public Lavadora() {
        
    }

    public Lavadora(double precio, String color, char consumoEnergetico, Integer peso,int carga) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Lavadora{ precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + ", carga=" + carga + '}';
    }

   
   
}
