/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.Alquiler;
import entidades.Barco;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Discoxz01
 */
public class ServicioAlquiler {
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\\n");
    
    public Alquiler crearAlquiler(){
        System.out.println("Ingrese el nombre del cliente: ");
        String nombre = leer.next();
        System.out.println("Ingrese el número de documento del cliente: ");
        Integer documento = leer.nextInt();
        
        System.out.println("Ingresando fecha de alquiler.");
        System.out.println("\nIngrese el día: ");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes: ");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año: ");
        int año = leer.nextInt();
        Date fechaAlquiler = new Date(año - 1900, mes -1 , dia);
        
        System.out.println("Ingresando la fecha de devolución.");
        System.out.println("\nIngrese el día: ");
         dia = leer.nextInt();
        System.out.println("Ingrese el mes: ");
         mes = leer.nextInt();
        System.out.println("Ingrese el año: ");
         año = leer.nextInt();
        Date fechaDevolucion = new Date(año - 1900, mes - 1, dia);
        
        System.out.println("Ingrese la posición del amarre: ");
        int posicionAmarre = leer.nextInt();
        
        System.out.println("\nIngrese qué tipo de barco quiere alquilar:");
        System.out.println("1 - Barco normal.\n2 - Barco Velero.\n3 - Barco Motor.\n4 - Barco de Lujo.");
        int opcion = leer.nextInt();
        Barco barco = new Barco();
        ServicioBarcos servicio = new ServicioBarcos();
        if(opcion == 1){
             barco  = servicio.crearBarcoNormal();
        }else if (opcion == 2 ){
             barco = servicio.crearBarcoVelero();
        }else if (opcion == 3){
             barco = servicio.crearBarcoMotor();
        }else if (opcion == 4){
             barco = servicio.crearBarcoLujo();
        }
        
        return new Alquiler(nombre, documento,fechaAlquiler,fechaDevolucion, posicionAmarre, barco);
    }
}
