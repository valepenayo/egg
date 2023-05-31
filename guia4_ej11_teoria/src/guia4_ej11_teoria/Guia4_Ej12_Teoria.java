
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4_ej11_teoria;

import java.util.Scanner;

/**
 *
 * @author skolln
 */
public class Guia4_Ej12_Teoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, 
        validando que el primer número múltiplo del segundo e imprima
        si el primer número es múltiplo del segundo,
        sino informe que no lo son.

        */
        
        Scanner leer = new Scanner(System.in);
        
        int num1,num2;
        
        System.out.println("Ingrese el primer numero");
        num1=leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2=leer.nextInt();
        
        System.out.println("");
        esMultiplo(num1,num2);
        
        
        
    }
    
    public static void esMultiplo (int a, int b) {
        
        
        
          if (a%b==0){
            System.out.println("Es Multiplo");}
          else{
              System.out.println("No es Multiplo");}
       
    }

    
}
/*package encuentro7_8;

import java.util.Scanner;

public class problemas12 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1,num2;
        System.out.println("ingrese el primer numero");
        num1 = leer.nextInt();
        System.out.println("ingrese el primer numero");
        num2 = leer.nextInt();
        
        if (EsMultiplo(num1, num2)) {
            System.out.println(num1 + " es múltiplo de " + num2);
        } else {
            System.out.println(num1 + " no es múltiplo de " + num2);
        }
    }

    public static boolean EsMultiplo(int num1, int num2) {
        return num1 % num2 == 0;
    }
}*/