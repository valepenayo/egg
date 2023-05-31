/*Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos por parámetro para que nos indique si es o no un número primo, 
debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo, 
ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
*/

package guia4_ej11_teoria;

import java.util.Scanner;

public class Guia4ejercicio4 {

    public static void main(String[] args) {
      
Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int numero = scanner.nextInt();
        boolean esPrimo = esPrimo(numero);
        if (esPrimo) {
            System.out.println(numero + " es un número primo");
        } else {
            System.out.println(numero + " no es un número primo");
        }
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}







