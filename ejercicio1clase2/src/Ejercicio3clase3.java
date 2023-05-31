/*Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */


import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;



/**
 *
 * @author vale
 */
public class Ejercicio3clase3 {

  
    public static void main(String[] args) {
        
        System.out.println("ingrese una frase");
        Scanner teclado = new Scanner(System.in);
        //alamacena la frase 
        String frase;
        //ingresa la frase por teclado
        frase = teclado.nextLine();
        //muestra la frase en mayuscula
        System.out.println (toUpperCase(frase));
        //muestra la frase en minuscula
        System.out.println (toLowerCase(frase));
    }
    
}
