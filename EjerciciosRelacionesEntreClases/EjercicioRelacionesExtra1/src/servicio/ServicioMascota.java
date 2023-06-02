/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.Adoptantes;
import entidades.Perro;
import entidades.PerroSinAdoptar;
import entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Discoxz01
 */
public class ServicioMascota {

    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

    public void menuAdoptar() {
        int opcion = 0;
        Adoptantes adoptantes = new Adoptantes();
        ArrayList<Persona> listaAdoptantes = adoptantes.getListaPersonas();
        PerroSinAdoptar perroSinAdoptar = new PerroSinAdoptar();
        ArrayList<Perro> perrera = perroSinAdoptar.getListaPerros();
        do {
            System.out.println("Aplicación para adoptar perros.");
            System.out.println("");
            System.out.println("Ingrese una opción");
            System.out.println("1 - Cargar personas en la lista de adoptantes.");
            System.out.println("2 - Cargar perros en la perrera.");
            System.out.println("3 - Gestión de adopción");
            System.out.println("4 - Mostrar dueños y mascotas");
            System.out.println("5 - Mostrar dueños sin mascota");
            System.out.println("6 - Mostrar perros adoptados");
            System.out.println("7 - Mostrar perros sin adoptar");
            System.out.println("8 - Salir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    crearPersona(listaAdoptantes);
                    break;
                case 2:
                    crearPerro(perrera);
                    break;
                case 3:
                    gestionDeAdopcion(listaAdoptantes, perrera);
                    break;
                case 4:
                    mostrarPersonasConMascota(listaAdoptantes);
                    break;
                case 5:
                    mostrarPersonasSinMascota(listaAdoptantes);
                    break;
                case 6:
                    mostrarPerrosAdoptados(listaAdoptantes);
                    break;
                case 7:
                    mostrarPerrosSinAdoptar(perrera);
                    break;
                case 8:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción inválida.");

            }

        } while (opcion != 8);

    }

    public void crearPersona(ArrayList<Persona> listaAdoptantes) {

        Persona persona = new Persona("Juan", "Perez", 26, 362304, null);
        Persona persona1 = new Persona("Nicolas", "Cepeda", 30, 352023, null);
        Persona persona2 = new Persona("Ariel", "Trod", 27, 342364, null);
        Persona persona3 = new Persona("Damian", "Ceballos", 25, 3323640, null);
        Adoptantes adoptantes = new Adoptantes();

        listaAdoptantes.add(persona);
        listaAdoptantes.add(persona1);
        listaAdoptantes.add(persona2);
        listaAdoptantes.add(persona3);

    }

    public void crearPerro(ArrayList<Perro> perrera) {

        Perro perro = new Perro("Chiquito", "Ovejero", 8, "mediano");
        Perro perro1 = new Perro("Cachita", "Boxer", 12, "chico");
        Perro perro2 = new Perro("Lara", "Doberman", 7, "grande");
        Perro perro3 = new Perro("Lobo", "Siberiano", 5, "mediano");
        Perro perro4 = new Perro("Angie", "Dalmata", 6, "grande");
        PerroSinAdoptar perrosSinAdoptar = new PerroSinAdoptar();

        perrera.add(perro);
        perrera.add(perro1);
        perrera.add(perro2);
        perrera.add(perro3);
        perrera.add(perro4);

    }

    public void gestionDeAdopcion(ArrayList<Persona> listaAdoptantes, ArrayList<Perro> perrosSinAdoptar) {
        if (listaAdoptanteLlena(listaAdoptantes) == false) {
            if (!perrosSinAdoptar.isEmpty()) {

                System.out.println("Lista de adoptantes:");
                for (Persona listaAdoptante : listaAdoptantes) {
                    System.out.println(listaAdoptante.getApellido() + " " + listaAdoptante.getDni());
                }

                boolean adopcionCorrecta;

                do {
                    System.out.println("\nIngrese el dni del adoptante");
                    int dni = leer.nextInt();
                    int contador = 0;
                    adopcionCorrecta = false;
//                int contadorAdoptanteConPerro = 0;
                    int contadorAdoptanteInexistente = 0;
                    for (Persona listaAdoptante : listaAdoptantes) {

                        if (listaAdoptante.getDni() == dni) {
                            if (listaAdoptante.getPerro() == null) {
                                mostrarPerrosSinAdoptar(perrosSinAdoptar);
                                adoptarPerro(listaAdoptantes.get(contador), perrosSinAdoptar);
                                adopcionCorrecta = true;
                                break;
                            } else {
//                            contadorAdoptanteConPerro++;
                            }
                        } else {
                            contadorAdoptanteInexistente++;
                        }
                        contador++;

                    }
                    if (adopcionCorrecta == true) {
                        System.out.println("La persona ha adoptado un perro correctamente.");
                    } else if (contadorAdoptanteInexistente == listaAdoptantes.size()) {
                        System.out.println("La persona no está en la lista.");
                    } else {
                        System.out.println("La persona ya tiene perro.");
                    }

                } while (adopcionCorrecta == false);

            } else {
                System.out.println("No hay perros para adoptar. Vuelva otro día.");
            }
        }else{
            System.out.println("Todas las personas cargadas en el sistema ya tienen un perro.");
        }
    
}

public void adoptarPerro(Persona persona, ArrayList<Perro> perrera) {
        String nombre = "";
        boolean bandera = false;
        do {
            System.out.println("");
            System.out.println("Ingrese el nombre del perro que desea adoptar:");
            nombre = leer.next();
            for (Perro perro : perrera) {
                if (nombre.equalsIgnoreCase(perro.getNombre())) {
                    persona.setPerro(perro);
                    perrera.remove(perro);
                    bandera = true;
                    break;
                }
            }
            if (bandera == false) {
                System.out.println("El perro no está en la lista.");
            }

        } while (!bandera);

    }

    public void mostrarPersonasConMascota(ArrayList<Persona> listaPersonas) {
        boolean bandera = false;

        for (Persona listaPersona : listaPersonas) {
            if (listaPersona.getPerro() != null) {
                if (bandera == false) {
                    System.out.println("Personas que adoptaron un perro:");
                    bandera = true;
                }
                System.out.println(listaPersona.mostrarNombreYApellido());
            }
        }

        if (bandera == false) {
            System.out.println("La lista de personas con mascota está vacía.");
        }
    }

    public void mostrarPersonasSinMascota(ArrayList<Persona> listaPersonas) {
        boolean bandera = false;
        for (Persona listaPersona : listaPersonas) {

            if (listaPersona.getPerro() == null) {
                if (bandera == false) {
                    System.out.println("Lista de perros que no adoptaron un perro:");
                    bandera = true;
                }
                System.out.println(listaPersona.mostrarNombreYApellido());
            }

        }

        if (bandera == false) {
            System.out.println("La lista de personas sin mascota está vacía.");
        }

    }

    public void mostrarPerrosAdoptados(ArrayList<Persona> listaPersonas) {
        boolean bandera = false;
        for (Persona listaPersona : listaPersonas) {
            if (listaPersona.getPerro() != null) {
                if (bandera == false) {
                    System.out.println("Lista de perros adoptados:");
                    bandera = true;
                }

                System.out.println(listaPersona.getPerro());
            }

        }
        if (bandera == false) {
            System.out.println("La lista de perros adoptados está vacía.");
        }
    }

    public void mostrarPerrosSinAdoptar(ArrayList<Perro> perrera) {
        if (!perrera.isEmpty()) {
            System.out.println("Lista de perros que no fueron adoptados:");
            for (Perro perro : perrera) {
                System.out.println(perro);
            }
        } else {
            System.out.println("No hay perros para adoptar.");
        }

    }

    public boolean listaAdoptanteLlena(ArrayList<Persona> listapersonas) {
        for (Persona listapersona : listapersonas) {
            if (listapersona.getPerro() == null) {
                return false;
            }
        }

        return true;
    }
}
