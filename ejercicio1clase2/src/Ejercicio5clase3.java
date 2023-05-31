/*Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
 */


import java.util.Scanner;



public class Ejercicio5clase3 {

    public static void main(String[] args) {
        System.out.println("escribir un numero");
        Scanner leer = new Scanner (System.in);
       //int se utiliza para numeros
        int num = leer.nextInt();
        System.out.println (" el doble es: "+ (num * 2) + " " + " el triple es: " + (num * 3) + " " + " la raiz cuadrada es: " + (Math.sqrt(num)));
       
        
    }
    
}
