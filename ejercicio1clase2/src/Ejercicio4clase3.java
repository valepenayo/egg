/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */


import java.util.Scanner;

public class Ejercicio4clase3 {

  
    public static void main(String[] args) {
        System.out.println ("ingrese una cantidad de grados");
        //el scanner cumple la funcion de leer
        Scanner leer = new Scanner(System.in);
        //int lo guarda para luego mostrarlo por pantalla 
        float num1 = leer.nextFloat();
        //se guarda una variable f para luego mostrar los grados Fahrenheit
        float f = (9* num1 / 5) + 32;
        System.out.println ("su equivalente a grados fahrenheit es" + f);
       
    }
    
}