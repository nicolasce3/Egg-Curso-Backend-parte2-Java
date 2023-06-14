/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainejercicioherencia1;

import entidades.Animal;
import entidades.Caballo;
import entidades.Gato;
import entidades.Perro;
import enumerador.Alimento;

/**
 *
 * Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato,
 * Caballo. La clase Animal tendrá como atributos el nombre, alimento, edad y
 * raza del Animal. Crear un método en la clase Animal a través del cual cada
 * clase hija deberá mostrar luego un mensaje por pantalla informando de que se
 * alimenta. Generar una clase Main que realice lo siguiente:
 */
public class MainEjercicioHerencia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Declaración del objeto Perro
       Animal perro1 = new Perro("Stich",Alimento.CARNE.getValor(),15,"Ovejero");
       perro1.alimentarse();
       
       // Declaración del otro objeto Perro
       Animal perro2 = new Perro("Teddy", Alimento.CROQUETAS.getValor(),10,"Siberiano");
       perro2.alimentarse();
       
        // Declaración del objeto Gato
        Animal gato1 = new Gato( "Pelusa",Alimento.GALLETAS.getValor(),15,"Siamés");
       gato1.alimentarse();
        
        // Declaración del objeto Caballo
        Animal caballo1 = new Caballo("Spark",Alimento.HENO.getValor(),25, "Fino");
        caballo1.alimentarse();
    }

}
