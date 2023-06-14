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
public class Gecko implements Interfaz {
    public void saludo(){
        System.out.println("Hola");
    }
    @Override
    public void sonidoAnimal() {
        System.out.println("Geckk");
        saludo();
    }
}
