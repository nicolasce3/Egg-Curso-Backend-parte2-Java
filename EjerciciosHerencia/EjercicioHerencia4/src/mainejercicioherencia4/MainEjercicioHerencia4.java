/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainejercicioherencia4;

import entidades.Circulo;
import entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * Se plantea desarrollar un programa que nos permita calcular el área y el
 * perímetro de formas geométricas, en este caso un círculo y un rectángulo. Ya
 * que este cálculo se va a repetir en las dos formas geométricas, vamos a crear
 * una Interfaz, llamada calculosFormas que tendrá, los dos métodos para
 * calcular el área, el perímetro y el valor de PI como constante. Desarrollar
 * el ejercicio para que las formas implementen los métodos de la interfaz y se
 * calcule el área y el perímetro de los dos. En el main se crearán las formas y
 * se mostrará el resultado final. 
 * Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro. 
 *
 * Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 */
public class MainEjercicioHerencia4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\\n");
        Circulo circulo = new Circulo();
        System.out.println("Ingrese el radio del círculo: ");
        circulo.setRadio(leer.nextDouble());
        
        double perimetroCirculo = circulo.calcularPerimetro();
        double areaCirculo = circulo.calcularArea();
        
        System.out.println("El perímetro del círculo es:" + perimetroCirculo);
        System.out.println("El área del círculo es: " + areaCirculo);
        
        Rectangulo rectangulo = new Rectangulo();
        System.out.println("\nIngrese la base del rectángulo");
        rectangulo.setBase(leer.nextDouble());
        System.out.println("Ingrese la altura del rectángulo: ");
        rectangulo.setAltura(leer.nextDouble());
        
        double perimetroRectangulo = rectangulo.calcularPerimetro();
        double areaRectangulo = rectangulo.calcularArea();
        
        System.out.println("\nEl perímetro del réctangulo es: " + perimetroRectangulo);
        System.out.println("El área del rectángulo es: " + areaRectangulo);
        
        
    }

}
