package guia9ejer5;

import Entidad.Persona;
import Servicios.PersonaServicios;
import java.util.Scanner;

public class Guia9ejer5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Persona p1 = new Persona();
        PersonaServicios ps = new PersonaServicios();

        ps.crearPersona();
        ps.Calcular();
        System.out.println("¿La persona es menor que la edad consultada? "+ ps.menorQue());
        ps.mostrarPersona();

    }

}
