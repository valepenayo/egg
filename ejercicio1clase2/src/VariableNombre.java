//Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.

import java.util.Scanner;

public class VariableNombre
{
    public static void main(String[] args)
    {
       //mostrar por pantalla
        System.out.print("Introduzca su nombre: ");
        //texto introducido por teclado
        Scanner teclado = new Scanner(System.in);
        //variable que guarda texto
        String nombre = teclado.nextLine();
        //imprimir por pantalla lo introducido por teclado
        System.out.println (nombre);
    }
}
