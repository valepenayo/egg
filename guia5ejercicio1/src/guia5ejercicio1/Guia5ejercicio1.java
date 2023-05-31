/*Realizar un algoritmo que llene un vector con los 100 primeros números enteros y los muestre por pantalla en orden descendente.
 */
package guia5ejercicio1;

public class Guia5ejercicio1 {

    public static void main(String[] args) {
    int[] vec = new int[100];

        for (int i = 0; i < vec.length; i++) {

            vec[i] = (100) - i;
        }
        for (int i = 0; i < vec.length; i++) {
            System.out.print(vec[i] + " - ");

        }
    }
}
//vector [i]= (int) (Math.random()*9+1) llenado con numeros aleatorios