/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import entidades.Electrodomestico;
import entidades.Televisor;

/**
 *
 * @author Discoxz01
 */
public class ServicioTelevisor extends ServicioElectrodomestico {
    
    public Televisor crearTelevisor(){
        Electrodomestico elec = crearElectrodomestico();
        System.out.println("Ingrese la cantidad de pulgadas de su televisor");
        int pulgadas = leer.nextInt();
        System.out.println("¿Tiene sintonizador TDT?");
        String opcion = leer.next();
        boolean sintonizador = false;
        if(opcion.equalsIgnoreCase("si")){
             sintonizador = true;
        }
        return new Televisor(elec.getPrecio(), elec.getColor(), elec.getConsumoEnergetico(), elec.getPeso(), pulgadas, sintonizador);
    }
    
    
    public void precioFinal(Televisor televisor){
        super.precioFinal(televisor);
        if(televisor.getResolucion()>40){
            double aumento = televisor.getPrecio()*0.30;
            televisor.setPrecio(aumento+televisor.getPrecio());
        }
        
        if(televisor.isSintonizador()){
            televisor.setPrecio(televisor.getPrecio()+500);
        }
        
    }
}
