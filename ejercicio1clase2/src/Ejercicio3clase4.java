/* Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
 */


import java.util.Scanner;


public class Ejercicio3clase4 {

   
    public static void main(String[] args) {
        System.out.println("ingrese la nota");
        Scanner leer =new Scanner (System.in);
        int nota = leer.nextInt();
        
        while (nota >=0 && nota <= 10);
        System.out.println("ingrese la nota nuevamente");
        nota = leer.nextInt();
      
        
    }

  
    }
    

