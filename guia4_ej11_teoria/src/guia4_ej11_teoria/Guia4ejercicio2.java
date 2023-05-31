/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los 
datos de las personas ingresadas por teclado e indique si 
son mayores o menores de edad. Después de cada persona, el programa debe 
preguntarle al usuario si quiere seguir mostrando personas 
y frenar cuando el usuario ingrese la palabra “No”.
 */
package guia4_ej11_teoria;

import java.util.Scanner;


public class Guia4ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la cantidad de nombres a ingresar");
        int cantNombre =leer.nextInt();
     	
        
        for (int i = 1; i < cantNombre; i++) {
        System.out.println("ingrese el nombre " + i + " :");
          String nombre = leer.nextLine();
                  
        }
        
        for (int j = 1; j < cantNombre; j++) {
            System.out.println("ingrese la edad de " + j + " es " + j);
            int edad= leer.nextInt();
          }
    	
 }
    public static int mayores (int edad, int cant) {
      for (int i = 0; i < cant; i++)  {
        if (edad>=18) {
              System.out.println("es mayor de edad");
              return +18;
            } 
             else {
              System.out.println("no es mayor de edad");
              return -18;
            
             }
             }
    }  

}





