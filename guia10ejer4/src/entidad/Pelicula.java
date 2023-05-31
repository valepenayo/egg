/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Comparator;

/**
 *
 * @author vale
 */
public class Pelicula {

    private String titulo;
    private String director;
    private Double duracionPelicula;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Double duracionPelicula) {
        this.titulo = titulo;
        this.director = director;
        this.duracionPelicula = duracionPelicula;
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

    public Double getDuracionPelicula() {
        return duracionPelicula;
    }

    public void setDuracionPelicula(Double duracionPelicula) {
        this.duracionPelicula = duracionPelicula;
    }

    @Override
    public String toString() {
        return "El nombre de la pelicula es : {" + "titulo=\n" + titulo + "El  director de la pelicula es =" + director + "\n La duracion de la pelicula es=" + duracionPelicula + '}';
    }
    public static Comparator<Pelicula> compararDuracion = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getDuracionPelicula().compareTo(p2.getDuracionPelicula());
        }

    };
 public static Comparator<Pelicula> compararTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getTitulo().compareTo(p2.getTitulo());
        }

    };
  public static Comparator<Pelicula> compararAutor = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getDirector().compareTo(p2.getDirector());
        }

    };
}

