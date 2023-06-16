/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainejercicioextraherencia1;

import entidades.Alquiler;
import entidades.BarcoLujo;
import entidades.BarcoMotor;
import entidades.BarcoVelero;
import servicio.ServicioAlquiler;

/**
 *
 * En un puerto se alquilan amarres para barcos de distinto tipo. Para cada
 * Alquiler se guarda: el nombre, documento del cliente, la fecha de alquiler,
 * fecha de devolución, la posición del amarre y el barco que lo ocupará. Un
 * Barco se caracteriza por: su matrícula, su eslora en metros y año de
 * fabricación. Sin embargo, se pretende diferenciar la información de algunos
 * tipos de barcos especiales: • Número de mástiles para veleros. • Potencia en
 * CV para barcos a motor. • Potencia en CV y número de camarotes para yates de
 * lujo. Un alquiler se calcula multiplicando el número de días de ocupación
 * (calculado con la fecha de alquiler y devolución), por un valor módulo de
 * cada barco (obtenido simplemente multiplicando por 10 los metros de eslora).
 * En los barcos de tipo especial el módulo de cada barco se calcula sacando el
 * módulo normal y sumándole el atributo particular de cada barco. En los
 * veleros se suma el número de mástiles, en los barcos a motor se le suma la
 * potencia en CV y en los yates se suma la potencia en CV y el número de
 * camarotes. Utilizando la herencia de forma apropiada, deberemos programar en
 * Java, las clases y los métodos necesarios que permitan al usuario elegir el
 * barco que quiera alquilar y mostrarle el precio final de su alquiler.
 */
public class MainEjercicioExtraHerencia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioAlquiler servicio = new ServicioAlquiler();
        Alquiler alquiler = servicio.crearAlquiler();
        
        
        
        // calcular días de ocupación
        long diferenciaMiliSegundos = alquiler.getFechaDeDevolucion().getTime() - alquiler.getFechaDeAlquiler().getTime();
        long diferenciaDias = diferenciaMiliSegundos / (1000 * 60 * 60 * 24);

        // calcular alquiler
        int alquilerNormal = (int) diferenciaDias * (10 * alquiler.getBarco().getEslora());
        int alquilerEspecial = 0;
        if (alquiler.getBarco() instanceof BarcoVelero) {
            BarcoVelero velero = (BarcoVelero) alquiler.getBarco();
            alquilerEspecial = alquilerNormal + velero.getNumeroMastiles();
        } else if (alquiler.getBarco() instanceof BarcoMotor) {
            BarcoMotor barcoMotor = (BarcoMotor) alquiler.getBarco();
            alquilerEspecial = alquilerNormal + barcoMotor.getPotenciaCv();
        } else if (alquiler.getBarco() instanceof BarcoLujo){
            BarcoLujo barcoLujo = (BarcoLujo) alquiler.getBarco();
            alquilerEspecial = alquilerNormal + barcoLujo.getNumeroCamarotes() +barcoLujo.getPotenciaCv();
        }
        System.out.println("Dias: " + diferenciaDias);
        System.out.println("");
        System.out.println("El valor total del alquiler es: " + alquilerEspecial);
        System.out.println("");
        System.out.println("Datos del barco: ");
        System.out.println(alquiler);
    }

}
