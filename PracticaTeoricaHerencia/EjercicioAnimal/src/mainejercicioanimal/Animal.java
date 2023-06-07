/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainejercicioanimal;

/**
 *
 * @author Discoxz01
 */
public class Animal {

    public void hacerRuido() {
        System.out.println("Hola");
    }

}

class Gato extends Animal {

    @Override
    public void hacerRuido() {
        System.out.println("Miau");
    }
}

class Perro extends Animal {

    @Override
    public void hacerRuido() {
        System.out.println("Guau");
    }
}
