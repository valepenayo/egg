/*Diseñe una función que pida el nombre y la edad de N personas e imprima los 
datos de las personas ingresadas por teclado e indique si 
son mayores o menores de edad. Después de cada persona, el programa debe 
preguntarle al usuario si quiere seguir mostrando personas 
y frenar cuando el usuario ingrese la palabra “No”.
 */
package guia4_ej11_teoria;

import java.util.Scanner;

public class guia4ejer2 {

    public static void main(String[] args) {
       Scanner leer= new Scanner(System.in);
        System.out.println("ingrese la cantidad de nombres a ingresar");
        int cant=leer.nextInt();
        String nombre;
        int edad;       
    }
     public static completar(String nombre, int cant, int edad) {
         for (int i = 0; i < cant; i++) {
             System.out.println("ingrese el nombre " + i);  
         }
     }
}
