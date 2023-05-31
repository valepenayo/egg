//Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada en punto,
//y luego codifique la palabra o frase ingresada de la siguiente manera: 
//cada vocal se reemplaza por el carácter que se indica en la tabla y el resto de los caracteres
//(incluyendo a las vocales acentuadas) se mantienen sin cambios.

package guia4_ej11_teoria;

import java.util.Scanner;


public class Guia4ejer1 {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        String frase = leer.next();
    }
    
    public static void cambiarLetras(String frase   ) {
       
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

