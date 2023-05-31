/*Escriba un programa en el cual se ingrese un valor límite positivo,
y a continuación solicite números al usuario hasta que la suma de los números introducidos supere el límite inicial.

 */
package guia3ejercicio1;

import java.util.Scanner;

public class Guia3ejercicio5 {

    public static void main(String[] args) {
        System.out.println("ingrese un numero limite");
        Scanner leer = new Scanner(System.in);
        int numlimit = leer.nextInt();
        System.out.println("ingrese nros");
        int n = leer.nextInt();
       
        
        do {
            System.out.println("ingrese un numero");
             n = n + leer.nextInt();
        }
         while (n <= numlimit);
          System.out.println(" usted ha superado el limite por: " + (n - numlimit) + "num");
        
             
    
        
    }
    
}
