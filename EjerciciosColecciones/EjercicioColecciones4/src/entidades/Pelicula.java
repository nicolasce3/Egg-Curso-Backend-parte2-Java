/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Comparator;

/**
 * Un cine necesita implementar un sistema en el que se puedan cargar peliculas.
 * Para esto, tendremos una clase Pelicula con el título, director y duración de
 * la película (en horas). Implemente las clases y métodos necesarios para esta
 * situación, teniendo en cuenta lo que se pide a continuación:
 *
 * • Mostrar en pantalla todas las películas. 
 * 
 * • Mostrar en pantalla todas las películas con una duración mayor a 1 hora.  
 * 
 * • Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla. 
 * 
 * • Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en pantalla. 
 * 
 * • Ordenar las películas por título, alfabéticamente y mostrarlo en
 *   pantalla. 
 * 
 * • Ordenar las películas por director, alfabéticamente y mostrarlo
 *   en pantalla.
 *
 */
public class Pelicula {

    private String titulo;
    private String director;
    private int duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, int duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + '}';
    }

    public static Comparator<Pelicula> ordenarDuracion = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return Integer.valueOf(p2.getDuracion()).compareTo(p1.getDuracion());
        }
    };

    public static Comparator<Pelicula> ordenarDuracionMenor = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return Integer.valueOf(p1.getDuracion()).compareTo(p2.getDuracion());
        }
    };
    
    public static Comparator<Pelicula> ordenarTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return (p1.getTitulo()).compareTo(p2.getTitulo());
        }
    };
    
    public static Comparator<Pelicula> ordenarDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return (p1.getDirector()).compareTo(p2.getDirector());
        }
    };
}
