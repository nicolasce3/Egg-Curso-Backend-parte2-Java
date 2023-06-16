/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.Barco;
import entidades.BarcoLujo;
import entidades.BarcoMotor;
import entidades.BarcoVelero;
import java.util.Scanner;

/**
 *
 * @author Discoxz01
 */
public class ServicioBarcos {

    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\\n");

    public Barco crearBarcoNormal() {

        System.out.println("Ingrese el número de matrícula: ");
        int matricula = leer.nextInt();
        System.out.println("Ingrese el número de esloras en metros: ");
        int eslora = leer.nextInt();
        System.out.println("Ingrese el año de fabricación: ");
        int anioFabricacion = leer.nextInt();
        
        return new Barco(matricula, eslora, anioFabricacion);
    }

    public BarcoVelero crearBarcoVelero() {

        Barco barco = crearBarcoNormal();

        System.out.println("Ingrese el número de mástiles del velero: ");
        int mastiles = leer.nextInt();

        return new BarcoVelero(barco.getMatricula(), barco.getEslora(), barco.getAnioDeFabricacion(), mastiles);
    }

    public BarcoMotor crearBarcoMotor(){
        Barco barco = crearBarcoNormal();
        
        System.out.println("Ingrese la potencia en CV: ");
        int potenciaCv = leer.nextInt();
        
        
        return new BarcoMotor(barco.getMatricula(), barco.getEslora(), barco.getAnioDeFabricacion(), potenciaCv);
    }
    
    public BarcoLujo crearBarcoLujo(){
        BarcoMotor barcoMotor = crearBarcoMotor();
        
        System.out.println("Ingrese el número de camarotes");
        int camarotes = leer.nextInt();
        
        return new BarcoLujo(barcoMotor.getMatricula(),barcoMotor.getEslora(),barcoMotor.getAnioDeFabricacion(),barcoMotor.getPotenciaCv(),camarotes);
        
        
    }
    
    
}
