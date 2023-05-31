/*Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’.
Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
imprimir “INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
 
 */
package guia3ejercicio1;

import java.util.Scanner;


public class Guia3ejercicio4 {

    public static void main(String[] args) {
        System.out.println("ingrese una frase o palabra");
        Scanner leer = new Scanner(System.in);
        String frase = leer.nextLine();
        String primeraletra = frase.substring(0,1);
         
        if (primeraletra.equals("a"))
            System.out.println("correcto");
        else
            System.out.println("incorrecto");
    }
       
    
}
