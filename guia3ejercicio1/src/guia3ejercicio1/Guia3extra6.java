
package guia3ejercicio1;

import java.util.Scanner;

/**
 *
 * @author vale
 */
public class Guia3extra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer= new Scanner(System.in);
       
            System.out.println("Ingrese la cantidad de personas");
        int n = leer.nextInt();
        double enanos= 0;
        double metro;
        double promediogeneral = 0;
        double promedioenanos = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese una altura");
            metro = leer.nextDouble();
            if (metro < 1.60 ) {
                enanos ++;
                promedioenanos= promedioenanos + metro;
               }
            promediogeneral= promediogeneral + metro;
        }
       System.out.println("El promedio general es: " + (promediogeneral/n));
       System.out.println("El promedio enanos es: " + (promedioenanos/enanos) );
    }

}
        
    