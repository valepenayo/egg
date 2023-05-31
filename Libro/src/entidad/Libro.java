
    
package entidad;

import java.util.Scanner;

public class Libro {
    public String isbn;
    public String titulo;
    public String autor;
    public int numPaginas;

    public Libro() {
        // Constructor vacío
    }

    public Libro(String isbn, String titulo, String autor, int numPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }
     public void cargarLibro() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Introduce el número de ISBN del libro: ");
        this.isbn = leer.nextLine();
        System.out.print("Introduce el título del libro: ");
        this.titulo = leer.nextLine();
        System.out.print("Introduce el nombre del autor del libro: ");
        this.autor = leer.nextLine();
        System.out.print("Introduce el número de páginas del libro: ");
        this.numPaginas = leer.nextInt();
    }

     public void informarLibro() {
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Número de páginas: " + this.numPaginas);
    }
}


