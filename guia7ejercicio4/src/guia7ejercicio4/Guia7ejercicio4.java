/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicio4;

import entidad.rectangulo;
import java.util.Scanner;

/**
 *
 * @author vale
 */
public class Guia7ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
         rectangulo r1= new rectangulo(leer.nextDouble(), leer.nextDouble());
         
       
        System.out.println("el perimetro del rectangulo es "+ r1.perimetro() + " La superficie del rectangulo es " + r1.superficie());
        r1.dibujar();
    }
    
}
