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
public class Barco {
    protected Integer matricula;
    protected Integer eslora;
    protected Integer anioDeFabricacion;

    public Barco() {
    }

    public Barco(Integer matricula, Integer eslora, Integer anioDeFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioDeFabricacion = anioDeFabricacion;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Integer getEslora() {
        return eslora;
    }

    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }

    public Integer getAnioDeFabricacion() {
        return anioDeFabricacion;
    }

    public void setAnioDeFabricacion(Integer anioDeFabricacion) {
        this.anioDeFabricacion = anioDeFabricacion;
    }
}
