/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.Scanner;
import entidades.Electrodomestico;

/**
 *
 * @author Discoxz01
 */
public class ServicioElectrodomestico {

    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\\n");

    public char comprobarConsumoEnergetico(char letra) {
        letra = Character.toUpperCase(letra);
        if (letra >= 'A' && letra <= 'F') {
            return letra;
        } else {
            // Asignar un valor predeterminado en caso de que el consumo energético no esté en el rango A-F
            return 'F';
        }
    }

    public String comprobarColor(String color) {
        if (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris")) {
            return color;
        } else {
            return "blanco";
        }
    }

    public Electrodomestico crearElectrodomestico() {

        System.out.println("Ingrese el precio del electrodoméstico: ");
        double precio = leer.nextDouble() + 1000;
        System.out.println("Ingrese el color del electrodoméstico: ");
        String colorElegido = comprobarColor(leer.next());

        System.out.println("Ingrese la letra que representa el consumo energético del electrodoméstico: ");
        char letraConsumo = comprobarConsumoEnergetico(leer.next().charAt(0));

        System.out.println("Ingrese el peso del electrodoméstico: ");
        Integer peso = leer.nextInt();
        return new Electrodomestico(precio, colorElegido, letraConsumo, peso);
    }

    public void precioFinal(Electrodomestico electrodomestico) {
        switch (electrodomestico.getConsumoEnergetico()) {
            case 'A':
                electrodomestico.setPrecio(electrodomestico.getPrecio() + 1000);
                
                break;
            case 'B':
                electrodomestico.setPrecio(electrodomestico.getPrecio() + 800);
                break;
            case 'C':
                electrodomestico.setPrecio(electrodomestico.getPrecio() + 600);
                break;
            case 'D':
                electrodomestico.setPrecio(electrodomestico.getPrecio() + 500);
                break;
            case 'E':
                electrodomestico.setPrecio(electrodomestico.getPrecio() + 300);
                break;
            case 'F':
                electrodomestico.setPrecio(electrodomestico.getPrecio() + 100);
                break;
                

        }
       
       
        if (electrodomestico.getPeso() >= 1 && electrodomestico.getPeso() <= 19) {
            electrodomestico.setPrecio(electrodomestico.getPrecio() + 100);
        } else if (electrodomestico.getPeso() >= 20 && electrodomestico.getPeso() <= 49) {
            electrodomestico.setPrecio(electrodomestico.getPrecio() + 500);
        } else if (electrodomestico.getPeso() >= 50 && electrodomestico.getPeso() <= 79) {
            
            electrodomestico.setPrecio(electrodomestico.getPrecio() + 800);
        } else {
            
            electrodomestico.setPrecio(electrodomestico.getPrecio() + 1000);
        }
    }

}
