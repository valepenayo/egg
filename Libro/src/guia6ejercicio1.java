/*Crear una clase llamada Libro que contenga los siguientes atributos:
ISBN, Título, Autor, Número de páginas, y un constructor con todos los
atributos pasados por parámetro y un constructor vacío. Crear un
método para cargar un libro pidiendo los datos al usuario y luego
informar mediante otro método el número de ISBN, el título, el autor del
libro y el número de páginas.
*/
import entidad.Libro;
import java.util.Scanner;


public class guia6ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Libro l1= new Libro(leer.nextLine(), leer.nextLine(), leer.nextLine(), leer.nextInt());
        System.out.println(l1.autor+ " " + l1.isbn+ " "+ l1.titulo+ " " + l1.numPaginas);
    }
    
}
