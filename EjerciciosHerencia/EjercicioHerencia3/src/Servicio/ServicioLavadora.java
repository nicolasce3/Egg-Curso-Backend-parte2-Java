/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import entidades.Electrodomestico;
import entidades.Lavadora;

/**
 *
 * @author Discoxz01
 */
public class ServicioLavadora extends ServicioElectrodomestico {

    public Lavadora crearLavadora() {
        Electrodomestico elec = crearElectrodomestico();

        System.out.println("Ingrese la carga de la lavadora");
        int carga = leer.nextInt();
       
        return new Lavadora(elec.getPrecio(), elec.getColor(), elec.getConsumoEnergetico(), elec.getPeso(), carga);
    }

    public void precioFinal(Lavadora lavadora) {
        super.precioFinal(lavadora);
        if(lavadora.getCarga()> 30){
            lavadora.setPrecio(lavadora.getPrecio()+500);
        }
    }
}
