/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumerador;

/**
 *
 * @author Discoxz01
 */
public enum Alimento {
    CARNE(1, "Carne"), PESCADO(2, "Pescado"), HENO(3, "Heno"), PASTO(4, "Pasto"), CROQUETAS(5, "Croquetas"),
    GALLETAS(6, "Galletas");

    private Integer codigo;
    private String valor;

    private Alimento(Integer codigo, String valor) {
        this.codigo = codigo;
        this.valor = valor;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

}
