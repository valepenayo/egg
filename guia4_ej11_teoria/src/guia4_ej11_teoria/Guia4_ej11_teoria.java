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
public class Guia4_ej11_teoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Ejercicio 11
        Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada en punto, 
        y luego codifique la palabra o frase ingresada de la siguiente manera: 
        cada vocal se reemplaza por el carácter que se indica en la tabla
        y el resto de los caracteres (incluyendo a las vocales acentuadas) se mantienen sin cambios.
            
        a e i o u
        @ # $ % *

        */
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase que termine en punto");
        String frase = leer.nextLine();
       

        cambiaLetras(frase);
        
        
        
        
    }
    public static void cambiaLetras(String frase   ) {
       
        String letra = "";
        for (int i = 0; i < frase.length(); i++) {
            switch (frase.substring(i, i + 1)) {
                case "a":
                case "A":
                    letra = letra.concat("@");
                    break;
                case "e":
                case "E":
                    letra = letra.concat("#");
                    break;
                case "i":
                case "I":
                    letra = letra.concat("$");
                    break;
                case "o":
                case "O":
                    letra = letra.concat("%");
                    break;
                case "u":
                case "U":
                    letra = letra.concat("*");
                    break;
                default:
                   letra = letra.concat(frase.substring(i, i + 1));
            }
        }
        System.out.println("La palabra cambiada es: " + letra);
    }
    
    
}
