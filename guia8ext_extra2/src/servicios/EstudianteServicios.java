package servicios;

import entidades.Estudiante;
import java.util.Scanner;

public class EstudianteServicios {

    Scanner leer = new Scanner(System.in);

    public Estudiante crearEstudiante(Estudiante e) {
        System.out.println("ingrese el nombre del estudiante");
        String nombre = leer.nextLine();
        e.setNombre(nombre);

        System.out.println("ingrese la edad del estudiante " + e.getNombre());
        int edad = leer.nextInt();
        e.setEdad(edad);

        System.out.println("ingrese la nota media de el estudiante " + e.getNombre());
        double notaMedia = leer.nextDouble();
        e.setNotaMedia(notaMedia);
        return e;
    }

    public void mostrar(Estudiante e) {
        System.out.println (e.toString());
    }

    public void mostrarAoD(Estudiante e) {
        if (e.getNotaMedia() > 6) {
            System.out.println(e.getNombre() + " ha aprobado la materia");
        } else {
            System.out.println("El estudiante " + e.getNombre() + " ha desaprobado la materia");
        }
    }
}
