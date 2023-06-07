/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Date;

/**
 *
 * @author Discoxz01
 */
public class Poliza {
    private Cliente cliente;
    private Vehiculo vehiculo;
    private Integer numeroDePoliza;
    private Date fechaDeInicio;
    private Date fechaDeFin;
    private Integer cantidadCuotas;
    private String formaDePago;
    private Integer montoTotalAsegurado;
    private boolean incluyeGranizo;
    private Integer montoMaximoGranizo;
    private String tipoDeCobertura;
}
