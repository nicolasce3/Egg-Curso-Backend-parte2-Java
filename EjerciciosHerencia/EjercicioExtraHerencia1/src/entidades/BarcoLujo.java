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
public class BarcoLujo extends BarcoMotor {
    private Integer numeroCamarotes;

    public BarcoLujo() {
    }

    public BarcoLujo( Integer matricula, Integer eslora, Integer anioDeFabricacion, Integer potenciaCv, Integer numeroCamarotes) {
        super(matricula, eslora, anioDeFabricacion,potenciaCv);
        this.numeroCamarotes = numeroCamarotes;
    }

    public Integer getNumeroCamarotes() {
        return numeroCamarotes;
    }

    public void setNumeroCamarotes(Integer numeroCamarotes) {
        this.numeroCamarotes = numeroCamarotes;
    }

    @Override
    public String toString() {
        return "BarcoLujo{" + "matricula=" + matricula + ", eslora=" + eslora + ", anioDeFabricacion=" + anioDeFabricacion + ", potenciaCv=" + potenciaCv + ", numeroCamarotes=" + numeroCamarotes + '}';
    }

    
    
}
