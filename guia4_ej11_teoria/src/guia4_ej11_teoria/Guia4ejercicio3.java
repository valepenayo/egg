/*Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros, la cantidad de euros y la moneda a convertir que será una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €


 */
package guia4_ej11_teoria;

import java.util.Scanner;

public class Guia4ejercicio3 {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("ingrese los euros a convertir");
        double eu =leer.nextDouble();
        System.out.println("el cambio de moneda es " +  cambio(eu));
    }
    public static double cambio (double eu) {
       double libras = eu*0.86;
       double pesos = eu* 1.28611;
       double yenes = eu*129.852;
       System.out.println("El cambio en libras es de " + libras + "\n El cambio en pesos es de " + pesos + "\n El cambio en yeens es de " + yenes);
       return 0;      
    
    }
    
}

