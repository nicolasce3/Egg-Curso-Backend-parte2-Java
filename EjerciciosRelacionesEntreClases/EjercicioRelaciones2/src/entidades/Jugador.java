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
public class Jugador {

    RevolverDeAgua revolver = new RevolverDeAgua();

    private Integer id;
    private String nombre;
    private boolean mojado;

    public Jugador() {
    }

    public Jugador(Integer id) {
        // solo necesito pasar id por parámetro, ya lo que demás se define inicialmente en el constructor
        this.id = id;
        String ids = id.toString();
        ids = "Jugador ".concat(ids);
        this.nombre = ids;
        this.mojado = false;
    }


    public RevolverDeAgua getRevolver() {
        return revolver;
    }

    public void setRevolver(RevolverDeAgua revolver) {
        this.revolver = revolver;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
//        En Java, es una convención de nomenclatura utilizar el prefijo "is" en los nombres de los
//        métodos de acceso (getter) para las propiedades booleanas. Esto se hace para indicar que el
//        método devuelve un valor booleano que representa el estado de una propiedad.
   return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    public boolean disparo(RevolverDeAgua revolver) {
//     el método, recibe el revolver de agua y llama a los métodos de  
//     mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el 
//     revolver tira el agua, el jugador se moja. El atributo mojado pasa a true y el método 
//     devuelve true, sino false.  
        
        if (revolver.mojar()) {
            mojado = true;
            System.out.println("El jugador se mojó.");
            return true;
        } else {
            revolver.siguienteChorro();
            return false;
        }

        
    }

}
