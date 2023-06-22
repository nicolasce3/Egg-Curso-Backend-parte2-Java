/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainejercicioextraherencia2;

import entidades.Edificio;
import entidades.EdificioDeOficinas;
import entidades.Polideportivo;
import java.util.ArrayList;
import servicio.ServicioEdificioDeOficinas;
import servicio.ServicioPolideportivo;

/**
 *
 * Crear una superclase llamada Edificio con los siguientes atributos: ancho,
 * alto y largo. La clase edificio tendrá como métodos: • Método
 * calcularSuperficie(): calcula la superficie del edificio. • Método
 * calcularVolumen(): calcula el volumen del edifico. Estos métodos serán
 * abstractos y los implementarán las siguientes clases: • Clase Polideportivo
 * con su nombre y tipo de instalación que puede ser Techado o Abierto, esta
 * clase implementará los dos métodos abstractos y los atributos del padre. •
 * Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de
 * personas por oficina y número de pisos. Esta clase implementará los dos
 * métodos abstractos y los atributos del padre. De esta clase nos interesa
 * saber cuántas personas pueden trabajar en todo el edificio, el usuario dirá
 * cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
 * (suponiendo que en cada piso hay una oficina). Crear el método
 * cantPersonas(), que muestre cuantas personas entrarían en un piso y cuantas
 * en todo el edificio. Por último, en el main vamos a crear un ArrayList de
 * tipo Edificio. El ArrayList debe contener dos polideportivos y dos edificios
 * de oficinas. Luego, recorrer este array y ejecutar los métodos
 * calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
 * superficie y el volumen de cada edificio. Además de esto, para la clase
 * Polideportivo nos interesa saber cuántos polideportivos son techados y
 * cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al
 * método cantPersonas() y mostrar los resultados de cada edificio de oficinas.
 */
public class MainEjercicioExtraHerencia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Edificio> edificios = new ArrayList();
        ServicioEdificioDeOficinas servicioOficina = new ServicioEdificioDeOficinas();
        ServicioPolideportivo servicioPolideportivo = new ServicioPolideportivo();
        for (int i = 0; i < 2; i++) {
            System.out.println("Ingrese los datos del polideportivo " + (i + 1));
            Polideportivo polideportivo = servicioPolideportivo.crearPolideportivo();
            edificios.add(polideportivo);
        }
        System.out.println(""); // espacio
        
        for (int i = 0; i < 2; i++) {
            System.out.println("Ingrese los datos del edificio de oficinas " + (i + 1));
            EdificioDeOficinas edificioOficinas = servicioOficina.crearEdificioDeOficinas();
            edificios.add(edificioOficinas);

        }

        int contadorPol = 1;
        int contadorOficina = 1;
        int contadorTechado = 0;
        int contadorAbierto = 0;

        for (Edificio edificio : edificios) {
            if (edificio instanceof EdificioDeOficinas) {
                
                System.out.println("El volumen del edificio de oficinas " + contadorPol + " es:" + edificio.calcularVolumen());
                System.out.println("La superficie del edificio de oficinas " + contadorPol + " es:" + edificio.calcularSuperficie());
                
                EdificioDeOficinas edificioDeOficinas = (EdificioDeOficinas) edificio;
                edificioDeOficinas.cantPersona();
                
                
                contadorPol++;
            } else if (edificio instanceof Polideportivo) {
                System.out.println("El volumen del polideportivo " + contadorOficina + " es:" + edificio.calcularVolumen());
                System.out.println("La superficie del polideportivo " + contadorOficina + " es:" + edificio.calcularSuperficie());
                
                Polideportivo polideportivo1 = (Polideportivo) edificio;
                
                if (polideportivo1.getTipoDeInstalacion().equalsIgnoreCase("techado")){
                    contadorTechado++;
                }else{
                    contadorAbierto++;
                }
                
                contadorOficina++;
            }
            System.out.println("\n "); //espacio
        }

        System.out.println("Cantidad de polideportivos techados: " + contadorTechado);
        System.out.println("Cantidad de polideportivos abiertos: " + contadorAbierto);
        
    }
}
