/*

 */
package guia5ejercicio1;

import java.util.Scanner;

public class Guia5ejercicio2 {

public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int tamano = leer.nextInt();
        int[] vector = new int[tamano];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() *9+1); 
        }
        System.out.println("¿Que numero desea buscar?");
        int buscar = leer.nextInt();
        for (int i = 0; i < vector.length; i++) {
             if (vector[i] == buscar) {
                 System.out.println("Se encontro el valor en la posicion "+i);
            }
        }
        
    }
    
}
