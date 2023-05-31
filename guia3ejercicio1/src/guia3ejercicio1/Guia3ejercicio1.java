//Crear un programa que dado un número determine si es par o impar.
package guia3ejercicio1;

import java.util.Scanner;

public class Guia3ejercicio1 {

    public static void main(String[] args) {
        System.out.println("ingrese un numero");
        Scanner leer = new Scanner (System.in);
        int num = leer.nextInt();
        if (num%2==0)
            System.out.println("el numero ingresado es par");
        else
            System.out.println("el numero ingresado es impar");
        
    }
    
}
