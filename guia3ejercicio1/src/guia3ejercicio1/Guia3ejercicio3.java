/* Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo.
Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, 
en caso contrario, se deberá imprimir “INCORRECTO”. 
Nota: investigar la funcion Lenght() en Java.

 */
package guia3ejercicio1;

import java.util.Scanner;

public class Guia3ejercicio3 {

    public static void main(String[] args) {
        
        System.out.println("introducir una frase");
        Scanner leer = new Scanner (System.in);
        String frase = leer.nextLine();
        
        
        if (frase.length()==8)
            System.out.println("CORRECTO");
        else
            System.out.println("incorrecto");
    }
    
}
