/*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).

*/
package guia5ejercicio1;

import java.util.Scanner;


public class Guia5ejercicio3 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la cantidad de enteros");
        int enteros= leer.nextInt();
        int []vector = new int[enteros];
        
        for (int i = 0; i < vector.length; i++) {
             vector[i] = (int) (Math.random() *5000 +1);
        
    }
        
     for (int i = 0; i < vector.length; i++) {
        String digitos = Integer.toString(vector[i]);
        
     }
}
}