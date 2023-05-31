/* .Se dispone de un conjunto de N familias, cada una de las cuales tiene
una M cantidad de hijos. Escriba un programa que pida la cantidad de
familias y para cada familia la cantidad de hijos para averiguar la media
de edad de los hijos de todas las familias.

 */
package guia3ejercicio1;

import java.util.Scanner;

public class Guia3extra14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de familias: ");
        int numFamilias = leer.nextInt();

        int totalHijos = 0;
        for (int i = 1; i <= numFamilias; i++) {
            System.out.print("Ingrese la cantidad de hijos de la familia " + i + ": ");
            int numHijos = leer.nextInt();
            totalHijos += numHijos;

            for (int j = 1; j <= numHijos; j++) {
                System.out.print("Ingrese la edad del hijo " + j + " de la familia " + i + ": ");
                int edadHijo = leer.nextInt();
            }
        }

        double mediaEdadHijos = (double) totalHijos / numFamilias;
        System.out.println("La media de edad de los hijos de todas las familias es: " + mediaEdadHijos);

    }

}
    
    

