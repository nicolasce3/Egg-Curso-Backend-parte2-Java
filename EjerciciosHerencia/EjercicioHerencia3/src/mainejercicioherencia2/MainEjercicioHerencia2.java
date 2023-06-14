/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainejercicioherencia2;

import Servicio.ServicioLavadora;
import Servicio.ServicioTelevisor;
import entidades.Lavadora;
import entidades.Televisor;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * Crear una superclase llamada Electrodoméstico con los siguientes atributos:
 * precio, color, consumo energético (letras entre A y F) y peso. Los
 * constructores que se deben implementar son los siguientes: • Un constructor
 * vacío. • Un constructor con todos los atributos pasados por parámetro. Los
 * métodos a implementar son: • Métodos getters y setters de todos los
 * atributos. • Método comprobarConsumoEnergetico(char letra): comprueba que la
 * letra es correcta, sino es correcta usara la letra F por defecto. Este método
 * se debe invocar al crear el objeto y no será visible. • Método
 * comprobarColor(String color): comprueba que el color es correcto, y si no lo
 * es, usa el color blanco por defecto. Los colores disponibles para los
 * electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el
 * nombre está en mayúsculas o en minúsculas. Este método se invocará al crear
 * el objeto y no será visible. Metodo crearElectrodomestico(): le pide la
 * información al usuario y llena el electrodoméstico, también llama los métodos
 * para comprobar el color y el consumo. Al precio se le da un valor base de
 * $1000. • Método precioFinal(): según el consumo energético y su tamaño,
 * aumentará el valor del precio. Esta es la lista de precios: *
 *
 *
 *
 * LETRA PRECIO A $1000 B $800 C $600 D $500 E $300 F $100 * PESO PRECIO Entre 1
 * y 19 kg $100 Entre 20 y 49 kg $500 Entre 50 y 79 kg $800 Mayor que 80 kg
 * $1000
 *
 * A continuación, se debe crear una subclase llamada Lavadora, con el atributo
 * carga, además de los atributos heredados. Los constructores que se
 * implementarán serán: • Un constructor vacío. • Un constructor con la carga y
 * el resto de los atributos heredados. Recuerda que debes llamar al constructor
 * de la clase padre. Los métodos que se implementara serán: • Método get y set
 * del atributo carga. • Método crearLavadora (): este método llama a
 * crearElectrodomestico() de la clase padre, lo utilizamos para llenar los
 * atributos heredados del padre y después llenamos el atributo propio de la
 * lavadora. • Método precioFinal(): este método será heredado y se le sumará la
 * siguiente funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el
 * precio en $500, si la carga es menor o igual, no se incrementará el precio.
 * Este método debe llamar al método padre y añadir el código necesario.
 * Recuerda que las condiciones que hemos visto en la clase Electrodoméstico
 * también deben afectar al precio. Se debe crear también una subclase llamada
 * Televisor con los siguientes atributos: resolución (en pulgadas) y
 * sintonizador TDT (booleano), además de los atributos heredados. Los
 * constructores que se implementarán serán: • Un constructor vacío. • Un
 * constructor con la resolución, sintonizador TDT y el resto de los atributos
 * heredados. Recuerda que debes llamar al constructor de la clase padre. * Los
 * métodos que se implementara serán: • Método get y set de los atributos
 * resolución y sintonizador TDT. • Método crearTelevisor(): este método llama a
 * crearElectrodomestico() de la clase padre, lo utilizamos para llenar los
 * atributos heredados del padre y después llenamos los atributos del televisor.
 * • Método precioFinal(): este método será heredado y se le sumará la siguiente
 * funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
 * incrementará el precio un 30% y si tiene un sintonizador TDT incorporado,
 * aumentará $500. Recuerda que las condiciones que hemos visto en la clase
 * Electrodomestico también deben afectar al precio. Finalmente, en el main
 * debemos realizar lo siguiente: Vamos a crear una Lavadora y un Televisor y
 * llamar a los métodos necesarios para mostrar el precio final de los dos
 * electrodomésticos.
 *
 *
 *
 *
 *
 */
public class MainEjercicioHerencia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\\n");
        ServicioLavadora servicio = new ServicioLavadora();
        ServicioTelevisor servicioTele = new ServicioTelevisor();

        ArrayList<Object> listaElectrodomestico = new ArrayList();

        int opcion;
        int contadorLavadora = 1;
        int contadorTele = 1;
        System.out.println("Vamos a crear cuatro electrodomesticos: ");

        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese una opción: ");
            System.out.println("1 - Crear una lavadora");
            System.out.println("2 - Crear un televisor");
            opcion = leer.nextInt();
            if (opcion == 1) {
                System.out.println("Ingrese los datos de la lavadora " + contadorLavadora + " : \n");
                Lavadora lavadora = servicio.crearLavadora();
                listaElectrodomestico.add(lavadora);
                contadorLavadora++;
                System.out.println("Lavadora creada.");
            } else if (opcion == 2) {
                System.out.println("Ingrese los datos del televisor " + contadorTele + " : \n");
                Televisor televisor = servicioTele.crearTelevisor();
                listaElectrodomestico.add(televisor);
                contadorTele++;
                System.out.println("Televisor creado.");
            }

        }
         contadorLavadora = 1;
         contadorTele = 1;
         double precioTotal = 0;
        for (Object electrodomestico : listaElectrodomestico) {
            if (electrodomestico instanceof Lavadora) {
                Lavadora lavadora = (Lavadora) electrodomestico;
                servicio.precioFinal(lavadora);
                System.out.println("Precio de la lavadora " + contadorLavadora +  ": " +  lavadora.getPrecio() + "\n");
                contadorLavadora++;
                precioTotal = precioTotal + lavadora.getPrecio();
            } else if (electrodomestico instanceof Televisor) {
                Televisor televisor = (Televisor) electrodomestico;
                servicioTele.precioFinal(televisor);
                System.out.println("Precio del televisor " + contadorTele + ": " +  televisor.getPrecio());
                contadorTele++;
                precioTotal = precioTotal + televisor.getPrecio();
            }

        }
        System.out.println("El precio de todos los productos es: " + precioTotal);
       
    }

}
