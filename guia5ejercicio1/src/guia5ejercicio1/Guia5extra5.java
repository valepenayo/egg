/*Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios y muestre la suma de sus elementos.

 */
package guia5ejercicio1;

import java.util.Scanner;

public class Guia5extra5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese las filas y las columnas");
        int n= leer.nextInt();
         int m= leer.nextInt();
        int [][]matriz= new int[n][m];
        
        for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            matriz[i][j] = (int) (Math.random()*9+1);
            System.out.print("[" + matriz[i][j] + "]");
            
        }
            System.out.println("");
       }
        //la suma de los elementos
        int total=0;
        for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            int suma= matriz[i][j];
            total= suma+total;
            
        }
    } System.out.println("la suma de la matriz es " + total);
    
}}
