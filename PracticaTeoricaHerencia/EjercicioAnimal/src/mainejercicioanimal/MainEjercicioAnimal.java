/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainejercicioanimal;

import java.util.ArrayList;

/**
 *
 * Vamos a crear una clase Animal que tenga un método hacerRuido() que devuelva
 * un saludo “Hola”. Luego haremos clase Perro y clase Gato que extiendan de
 * Animal y sobreescriban el método hacerRuido() con el ruido que corresponda a
 * cada uno. Luego, en el main vamos a crear un ArrayList de animales y los
 * siguientes animales
 *
 * Animal a = new Animal(); Animal b = new Perro(); Animal c = new Gato();
 *
 * Agregaremos a la lista a cada uno y luego, con un for each, recorreremos la
 * lista llamando al método hacerRuido() de cada ítem.
 */
public class MainEjercicioAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Perro();
        Animal c = new Gato();

        ArrayList<Animal> listaAnimales = new ArrayList();
        listaAnimales.add(a);
        listaAnimales.add(b);
        listaAnimales.add(c);

        for (Animal listaAnimale : listaAnimales) {
            listaAnimale.hacerRuido();
        }

    }

}
