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
public class BarcoMotor extends Barco {
    protected Integer potenciaCv;



    public BarcoMotor(Integer matricula, Integer eslora, Integer anioDeFabricacion, Integer potenciaCv) {
        super(matricula, eslora, anioDeFabricacion);
        this.potenciaCv = potenciaCv;
    }

    public BarcoMotor() {
    }

    public Integer getPotenciaCv() {
        return potenciaCv;
    }

    public void setPotenciaCv(Integer potenciaCv) {
        this.potenciaCv = potenciaCv;
    }

    @Override
    public String toString() {
        return "BarcoMotor{" + "matricula=" + matricula + ", eslora=" + eslora + ", anioDeFabricacion=" + anioDeFabricacion + ", potenciaCv=" + potenciaCv + '}';
    }
    
}
