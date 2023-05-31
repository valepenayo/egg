package Servicios;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaServicios {

    Scanner leer = new Scanner(System.in);
      Persona p1= new Persona();
// Método crearPersona que pida al usuario Nombre y fecha de
//nacimiento de la persona a crear. Retornar el objeto Persona creado.
    public Persona crearPersona() {
        System.out.println("ingrese el nombre ");
        String nombre = leer.nextLine();
        p1.setNombre(nombre);
        System.out.println("ingrese el dia de nacimiento de " + p1.getNombre());
        int dia = leer.nextInt();
        System.out.println("ingrese el mes de nacimiento de " + p1.getNombre());
        int mes = leer.nextInt();
        System.out.println("ingrese el año de nacimiento de " + p1.getNombre());
        int anio = leer.nextInt();
        Date fechaN = new Date(anio - 1900, mes - 1, dia);
        p1.setFecha(fechaN);
        return p1;
    }
// Método calcularEdad que calcule la edad del usuario utilizando el
//atributo de fecha de nacimiento y la fecha actual.
//

    public int Calcular() {
        //Date fechaNac = p1.getFecha();
        Date fechaActual = new Date();
        Date fechaNac = p1.getFecha();
        int edad = fechaActual.getYear() - fechaNac.getYear();

        return edad;
    }
//Método menorQue recibe como parámetro una Persona y una edad.
//Retorna true si la persona es menor que la edad consultada o false
//en caso contrario.

    public boolean menorQue() {
        System.out.println("ingrese la edad a comparar");
        int edad= leer.nextInt();
        int edadP = Calcular();
        return edad > edadP;


    }
// Método mostrarPersona que muestra la información de la persona
//deseada.

    public void mostrarPersona() {
        System.out.println("El nombre de la persona es " + p1.getNombre() + ", la fecha de nacimiento es " + p1.getFecha() + " y la edad es " + Calcular());
    }
}
