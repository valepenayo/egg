/*Dado un tiempo en minutos, calcular su equivalente en días y horas. 
Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas

 */
package guia3extra1;

import java.util.Scanner;

public class Guia3extra1 {

    public static void main(String[] args) {
        System.out.println("ingrese la cantidad de minutos");
        Scanner leer= new Scanner(System.in);
        int min= leer.nextInt();
        
        System.out.println("el equivalente en horas es de: " + (min/60));
        System.out.println("el equivalente en dias es de: " + (min/1440));
        
       
    }
    
}
