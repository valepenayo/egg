/*
 */
package opera;

import java.util.Scanner;
import operaciones.entidad.Operaciones;

public class Opera {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        Operaciones o1= new Operaciones(leer.nextDouble(), leer.nextDouble());
        
       
        System.out.println("la suma de los numeros es \n" + o1.sumar()+" La resta de los numeros es \n"+ o1.restar() + " la multiplicacion de los numeros es \n" + o1.multi() + " La division es "+ o1.divi());
    }
    
}
