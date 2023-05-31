/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3ejercicio1;

import java.util.Scanner;

/**
 *
 * @author vale
 */
public class Guia3extra72 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int valorMax, valorMin, nro, limite, cont;
      valorMax = 0;
      valorMin = 0;
      cont = 0;
        System.out.println("Ingrese el límite de números: ");
        limite = s.nextInt();
        while(cont < limite){
            System.out.println("Ingrese un número: ");
            nro = s.nextInt();
            cont++;
            if(cont == 1){
                valorMin = nro;
            }
                
            if (valorMax < nro){
                valorMax = nro;
            }
            
            if (nro < valorMin){
                valorMin = nro;
            }
        }
        System.out.println("El Valor Máximo es: " + valorMax);
        System.out.println("El valor Mínimo es: " + valorMin);
    }
        
    }
    

