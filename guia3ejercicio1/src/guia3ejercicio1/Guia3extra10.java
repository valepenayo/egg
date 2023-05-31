   /*.Realice un programa para que el usuario adivine el resultado de una
multiplicación entre dos números generados aleatoriamente entre 0 y 10.
El programa debe indicar al usuario si su respuesta es o no correcta. En
caso que la respuesta sea incorrecta se debe permitir al usuario ingresar
su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
package guia3extra10;
*/
package guia3ejercicio1;

import java.util.Scanner;
public class Guia3extra10 {
    
 public static void main(String[] args) {
        int num1 = (int)(Math.random() * 11);
        int num2 = (int)(Math.random() * 11);
        
        int resultado = num1 * num2;
        
         int respuesta = -1;
        
        Scanner leer = new Scanner(System.in);
        
        while (respuesta != resultado) {
            // Pedir al usuario que ingrese su respuesta
            System.out.print("¿Cuál es el resultado de " + num1 + " x " + num2 + "? ");
            respuesta = leer.nextInt();
            
            // Comprobar si la respuesta es correcta
            if (respuesta == resultado) {
                System.out.println("¡Correcto!");
            } else {
                System.out.println("Respuesta incorrecta. Por favor, inténtelo de nuevo.");
            }
        }
    }
}
    
    
