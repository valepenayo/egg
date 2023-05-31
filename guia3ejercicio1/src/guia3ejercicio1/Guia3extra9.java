
package guia3ejercicio1;

import java.util.Scanner;

public class Guia3extra9 {

    public static void main(String[] args) {
              Scanner s = new Scanner(System.in);
       int resto, dividendo, divisor, nro, cociente;
       cociente = 0;
       resto = 0;
        System.out.println("Ingrese el dividendo: ");
        dividendo = s.nextInt();//50
        System.out.println("Ingrese el divisor: ");
        divisor = s.nextInt();//13
        while(dividendo > divisor){
            resto = dividendo - divisor;
            System.out.println(dividendo + " - " + divisor + " = " + resto);
            dividendo = resto;
            cociente++;
        }
    }
    
}
