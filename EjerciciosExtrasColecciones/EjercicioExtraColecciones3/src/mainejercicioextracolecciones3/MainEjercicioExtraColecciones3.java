/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainejercicioextracolecciones3;

import servicio.ServicioLibreria;
import entidades.Libro;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * . Implemente un programa para una Librería haciendo uso de un HashSet para
 * evitar datos repetidos. Para ello, se debe crear una clase llamada Libro que
 * guarde la información de cada uno de los libros de una Biblioteca. La clase
 * Libro debe guardar el título del libro, autor, número de ejemplares y número
 * de ejemplares prestados. También se creará en el main un HashSet de tipo
 * Libro que guardará todos los libros creados. En el main tendremos un bucle
 * que crea un objeto Libro pidiéndole al usuario todos sus datos y los
 * seteandolos en el Libro. Despues, ese Libro se guarda en el conjunto y se le
 * pregunta al usuario si quiere crear otro Libro o no. La clase Librería
 * contendrá además los siguientes métodos: • Constructor por defecto. •
 * Constructor con parámetros. • Métodos Setters/getters • Método prestamo(): El
 * usuario ingresa el titulo del libro que quiere prestar y se lo busca en el
 * conjunto. Si está en el conjunto, se llama con ese objeto Libro al método. El
 * método se incrementa de a uno, como un carrito de compras, el atributo
 * ejemplares prestados, del libro que ingresó el usuario. Esto sucederá cada
 * vez que se realice un préstamo del libro. No se podrán prestar libros de los
 * que no queden ejemplares disponibles para prestar. Devuelve true si se ha
 * podido realizar la operación y false en caso contrario. • Método
 * devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se
 * lo busca en el conjunto. Si está en el conjunto, se llama con ese objeto al
 * método. El método decrementa de a uno, como un carrito de compras, el
 * atributo ejemplares prestados, del libro seleccionado por el usuario. Esto
 * sucederá cada vez que se produzca la devolución de un libro. No se podrán
 * devolver libros donde que no tengan ejemplares prestados. Devuelve true si se
 * ha podido realizar la operación y false en caso contrario.
 */
public class MainEjercicioExtraColecciones3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        HashSet<Libro> listaLibros = new HashSet<>();
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\\n");

        String opcion;

        do {

            System.out.println("Ingrese el título del libro que desea agregar: ");
            String titulo = leer.next();
            System.out.println("Ingrese el nombre del autor: ");
            String autor = leer.next();
            System.out.println("Ingrese la cantidad de ejemplares disponibles: ");
            int ejemplares = leer.nextInt();

            Libro libro = new Libro(titulo, autor, ejemplares, 0);
            listaLibros.add(libro);

            System.out.println("¿Desea ingresar otro libro?(SI/NO)");

            opcion = leer.next();

            while (!opcion.equalsIgnoreCase("si") && !opcion.equalsIgnoreCase("no")) {
                System.out.println("Opción inválida");
                System.out.println("¿Desea ingresar otro libro?(SI/NO)");
                opcion = leer.next();

            }

        } while (opcion.equalsIgnoreCase("si"));

        ServicioLibreria servicio = new ServicioLibreria(listaLibros);
        servicio.menu();
        
        
        
        
    }
}
