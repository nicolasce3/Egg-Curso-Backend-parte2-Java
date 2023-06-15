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
public interface CalculosFormas {
        double PI = Math.PI;
//        en las interfaces de Java, todas las variables se consideran automáticamente como public, static y
//        final. Por lo tanto, la constante PI será pública, estática y final por defecto. 
        
        double calcularArea();
        double calcularPerimetro();
}
