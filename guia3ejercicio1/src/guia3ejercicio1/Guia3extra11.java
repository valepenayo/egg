/*Escribir un programa que lea un número entero y devuelva el número de
dígitos que componen ese número. Por ejemplo, si introducimos el
número 12345, el programa deberá devolver 5. Calcular la cantidad de
dígitos matemáticamente utilizando el operador de división. Nota:
recordar que las variables de tipo entero truncan los números o
resultados

 */
package guia3ejercicio1;

import java.util.Scanner;

/**
 *
 * @author vale
 */
public class Guia3extra11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numero = leer.nextInt();
        int digitos = 0;
        while (numero != 0) {
            numero /= 10;
            digitos++;
        }

        System.out.println("El número de dígitos del número ingresado es: " + digitos);
       
    }
}
   
    

