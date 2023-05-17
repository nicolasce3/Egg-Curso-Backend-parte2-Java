/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Discoxz01
 */
public class ServicioTienda {

    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\\n");
    private HashMap<String, Integer> productos;

    public ServicioTienda() {
        this.productos = new HashMap();
    }

    public void menu() {

        int opcion = 0;

        do {
            System.out.println("");
            System.out.println("---Kiosco ---");
            System.out.println("¿Qué desea hacer?");
            System.out.println("1- Agregar productos.");
            System.out.println("2- Ver todos los productos disponibles.");
            System.out.println("3- Modificar precios");
            System.out.println("4- Eliminar un producto de la lista.");
            System.out.println("5- Salir");
            System.out.println("");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    agregarProducto();
                    break;

                case 2:
                    mostrarProductos();
                    break;
                case 3:
                    modificarPrecio();
                    break;
                case 4:
                    eliminarProducto();
                    break;
                case 5:
                    System.out.println("Fin del programa");
                    break;
                default:
                    System.out.println("ERROR. Opción no valida");
            }
        } while (opcion < 5);

    }

    public void agregarProducto() {
        String respuesta;
        do {
            System.out.println("Ingrese el producto que desea agregar a la tienda: ");
            String nombreProducto = leer.next();
            System.out.println("Ingrese el precio del producto: ");
            int precio = leer.nextInt();
            productos.put(nombreProducto, precio);
            System.out.println("¿Desea agregar otro producto?");
            respuesta = leer.next();
        } while (!respuesta.equalsIgnoreCase("no"));

    }

    public void mostrarProductos() {
        for (Map.Entry<String, Integer> entry : productos.entrySet()) {
            System.out.println("Producto =" + entry.getKey() + ", Precio =" + entry.getValue());
        }

    }

    public void modificarPrecio() {
        System.out.println("Ingrese el nombre del producto que desea modificar: ");
        String modificar = leer.next();
        for (Map.Entry<String, Integer> entry : productos.entrySet()) {
            if (entry.getKey().equalsIgnoreCase(modificar)) {
                System.out.println("Ingrese el nuevo precio: ");
                int nuevoPrecio = leer.nextInt();
                productos.put(modificar, nuevoPrecio);
            }
        }
    }

    public void eliminarProducto() {

        boolean bandera = false;
        do {
            System.out.println("Ingrese el producto que desea eliminar: ");
            String productoEliminar = leer.next();
       // el containsKey diferencia entre mayúsculas y minúsculas
            if (productos.containsKey(productoEliminar)) {
                productos.remove(productoEliminar);
                bandera = true;
            } else {
                // La clave "productoEliminar" no existe en el mapa
                System.out.println("El producto ingresado no está en el sistema.");
            }
        } while (bandera == false);

    }
}
