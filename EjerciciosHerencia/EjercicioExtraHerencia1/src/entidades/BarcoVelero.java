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
public class BarcoVelero extends Barco{
    private Integer numeroMastiles;

    public BarcoVelero() {
    }

  

    public BarcoVelero(Integer matricula, Integer eslora, Integer anioDeFabricacion, Integer numeroMastiles) {
        super(matricula, eslora, anioDeFabricacion);
        this.numeroMastiles = numeroMastiles;
    }

    public Integer getNumeroMastiles() {
        return numeroMastiles;
    }

    public void setNumeroMastiles(Integer numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }

    @Override
    public String toString() {
        return "BarcoVelero{" + "matricula=" + matricula + ", eslora=" + eslora + ", anioDeFabricacion=" + anioDeFabricacion + ", numeroMastiles=" + numeroMastiles + '}';
    }
    
    
    
}
