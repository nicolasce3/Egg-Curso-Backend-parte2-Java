/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import servicio.ServicioPelicula;

/**
 *
 * @author Discoxz01
 */
public class mainEjercicioColecciones4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioPelicula servicio = new ServicioPelicula();
        servicio.cargarPelicula();
        servicio.mostrarPeliculas();
        servicio.mostrarPeliculasMasDeUnaHora();
        servicio.ordenarPeliculaDuracionMayorAMenor();
        servicio.ordenarPeliculaDuracionMenorAMayor();
        servicio.ordenarPeliculaTitulo();
        servicio.ordenarPeliculaDirector();
    }
    
}
