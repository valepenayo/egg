//Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
//Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
package guia3ejercicio1;

import java.util.Scanner;

public class Guia3extra3 {
       public static void main(String[] args) {
        System.out.println("ingrese una letra");
        Scanner leer= new Scanner (System.in);
        String letra = leer.nextLine();
   
        
        if (letra.equals("a")||letra.equals("e")||letra.equals("i")||letra.equals("o")||letra.equals("u"))
          System.out.println("la letra ingresada es una vocal");
        else
        System.out.println("la letra ingresada NO es una vocal");
             
    }
    
}