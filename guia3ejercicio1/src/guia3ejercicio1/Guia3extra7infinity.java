/*Realice un programa que calcule y visualice el valor máximo, el valor
mínimo y el promedio de n números (n>0). El valor de n se solicitará al
principio del programa y los números serán introducidos por el usuario.
Realice dos versiones del programa, una usando el bucle “while” y otra
con el bucle “do - while”
 */
package guia3ejercicio1;

import java.util.Scanner;

public class Guia3extra7infinity {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);

        System.out.print("Introduce la cantidad de números a procesar: ");
        int n = leer.nextInt();

        double sum = 0;
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;

        int i = 0;
        while (i < n) {
            System.out.print("Introduce un número: ");
            double num = leer.nextDouble();

            if (num < min) {
                min = num;
            }

            if (num > max) {
                max = num;
            }

            sum += num;
            i++;
        }

        double prom = sum / n;

        System.out.println("El valor mínimo es: " + min);
        System.out.println("El valor máximo es: " + max);
        System.out.println("El promedio es: " + prom);
    }
}
 
    

