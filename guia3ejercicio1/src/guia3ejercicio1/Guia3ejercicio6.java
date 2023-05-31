/* Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla el siguiente menú:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla y luego volver al menú.
El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, 
en vez de salir del programa directamente, se debe mostrar el siguiente mensaje de confirmación: 
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, 
caso contrario se vuelve a mostrar el menú.

 */
package guia3ejercicio1;

import java.util.Scanner;


public class Guia3ejercicio6 {

 public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese dos numeros");
                
        float num1= leer.nextFloat();
        float num2= leer.nextFloat();
        System.out.println("ingrese un numero para el menu");
        int menu = leer.nextInt();
        String letra = leer.nextLine();
        
        switch(menu) {
         case (1):
             System.out.println("la suma de los numeros ingresados es : " + (num1+num2));
           break;
           case (2):
             System.out.println("la resta de los numeros ingresados es: " + (num1-num2));
           break;
          case (3):
             System.out.println("la multiplicacion de los numeros ingresados es: " + (num1*num2));
           break;
           case (4):
             System.out.println("la division de los numeros ingresados es: " + (num1/num2));
           break;
           case (5):
             System.out.println("desea salir? S7N");
              letra = leer.nextLine();
             if (letra.equals("S"))
                   System.out.println("hasta la proxima");
             else 
                
           break;
           default:
           System.out.println("la opcion ingresada no es valida");
        
        
                
    }
    
}
}