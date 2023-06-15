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

  

    public BarcoVelero(Integer numeroMastiles, Integer matricula, Integer eslora, Integer anioDeFabricacion) {
        super(matricula, eslora, anioDeFabricacion);
        this.numeroMastiles = numeroMastiles;
    }

    public Integer getNumeroMastiles() {
        return numeroMastiles;
    }

    public void setNumeroMastiles(Integer numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }
    
    
    
}
