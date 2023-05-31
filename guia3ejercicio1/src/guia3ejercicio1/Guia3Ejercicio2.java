/* Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar la función equals() en Java.
 */
package guia3ejercicio1;

import java.util.Scanner;

public class Guia3Ejercicio2 {

   
    public static void main(String[] args) {
        System.out.println("ingrese una frase");
        Scanner leer= new Scanner (System.in);
        String frase = leer.nextLine();
   
        
        if (frase.equals("eureka"))
          System.out.println("CORRECTO");
        else
        System.out.println("Incorrecto");
    }
    
}
