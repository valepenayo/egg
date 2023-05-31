/*Crea un vector llamado ‘Equipo’ 
cuya dimensión sea la cantidad de compañeros de equipo y define su tipo de dato 
de tal manera que te permita alojar sus nombres más adelante.
 */
//Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros de equipo
package guia5ejercicio1;

import java.util.Scanner;

public class Guia5teoria1 {

   
    public static void main(String[] args) {
        String [] equipo = new String [10];
       for (int i = 0; i < equipo.length; i++) {
           System.out.println("ingrese los nombres");
           Scanner leer = new Scanner(System.in);
           equipo[i]=leer.nextLine();
           System.out.println(equipo[i]);
           
       }
             
    }
    
}
