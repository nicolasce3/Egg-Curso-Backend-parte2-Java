/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainejercicioteoricoherencia2;

import entidades.Gato;
import entidades.Gecko;
import entidades.Vaca;


/**
 *
 * @author Discoxz01
 */
public class MainEjercicioTeoricoHerencia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gato gato = new Gato();
        Vaca vaca = new Vaca(); 
        Gecko gecko = new Gecko();
        gato.sonidoAnimal();
        vaca.sonidoAnimal();
        gecko.sonidoAnimal();
        
        
    }
}
