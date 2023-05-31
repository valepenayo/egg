/*Escriba un programa que averigüe si dos vectores de N enteros son iguales 
(la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).
 */
package guia5ejercicio1;

import java.util.Scanner;

public class Guia5extra2 {

    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        System.out.println("ingrese el tamaño de los vectores");
        int n= leer.nextInt();
        int [] vector = new int [n];
        int [] vector1 = new int [n];
        
         for (int i = 0; i < vector.length; i++) {
             vector[i] = (int) (Math.random() *9 +1);
             System.out.print("[" + vector[i] + "]");  
           
          	 
       
           System.out.println("");
    }
         System.out.println("_______");
          for (int i = 0; i < vector1.length; i++) {
             vector[i] = (int) (Math.random() *9 +1);
             System.out.print("[" + vector1[i] + "]");  
           
          	 
       
           System.out.println("");
    }
          if (vector==vector1)
              System.out.println("los vectores son iguales");
          else
              System.out.println("los vectores son diferentes");
}
}