/*Escriba un programa que lea números enteros. Si el número es múltiplo
de cinco debe detener la lectura y mostrar la cantidad de números
leídos, la cantidad de números pares y la cantidad de números impares.
Al igual que en el ejercicio anterior los números negativos no deben
sumarse. Nota: recordar el uso de la sentencia break
 */
package guia3ejercicio1;

import java.util.Scanner;

public class Guia3extra8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cont = 0;
        int conteoPar = 0;
        int conteoImpar = 0;

        while (true) {
            System.out.print("Introduce un número entero (0 para salir): ");
            int num = sc.nextInt();

            if (num == 0) {
                break;
            }

            if (num < 0) {
                continue;
            }

            if (num % 5 == 0) {
                break;
            }cont++;

            if (num % 2 == 0) {
                conteoPar++;
            } else {
                conteoImpar++;
            }
        }

        System.out.println("Cantidad de números leídos: " + cont);
        System.out.println("Cantidad de números pares: " + conteoPar);
        System.out.println("Cantidad de números impares: " + conteoImpar);
    }
}
    
    

