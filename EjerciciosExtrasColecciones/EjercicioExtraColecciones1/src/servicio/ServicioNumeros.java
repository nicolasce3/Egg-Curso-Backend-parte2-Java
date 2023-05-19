/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Discoxz01
 */
public class ServicioNumeros {

    private ArrayList<Integer> listaNumero = new ArrayList();
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\\n");

    public void cargarNumeros() {
        int num = 0;
        do {
            System.out.println("Ingrese un número a la lista distinto de -99");
            num = leer.nextInt();
            if (num != -99) {
                listaNumero.add(num);
            }
            if (num == -99) {
                System.out.println("Error.");
            }

        } while (num == -99);

        while (num != -99) {
            System.out.println("Ingrese otro número: ");
            num = leer.nextInt();
            if (num != -99) {
                listaNumero.add(num);
            }

        }
    }

    public void operacionesMatematicas() {
        int suma = 0;
        for (Integer integer : listaNumero) {
            suma += integer;
        }

        double promedio = suma / listaNumero.size();

        System.out.println("La suma es " + suma);
        System.out.println("El promedio es " + promedio);

    }

}
