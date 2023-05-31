/*Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N, con los valores ingresados por el usuario.
 */
package guia5ejercicio1;

import java.util.Scanner;

public class Guia5extra1 {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("ingrese el tamaño del vector");
          int n= leer.nextInt();
        int[] vector = new int [n];
       
        for (int i = 0; i < vector.length; i++) {
            System.out.println("ingrese los numeros del vector");
            int num = leer.nextInt();
                vector[i] = num;
                int suma = num;
                suma = num + num;
              System.out.println("la suma del vector es: [" + suma + "]");        
           
           }
        //System.out.println("la suma del vector es: [" + suma + "]");
        System.out.println("el vector original es:");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("[" + vector[i] + "]");  
           
          	 
       
           System.out.println("");
        }
    }
    
}
