
package circun;


import circunferencia.entidad.circunferencia;
import java.util.Scanner;



public class circun {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        circunferencia c1 = new circunferencia(leer.nextDouble());
        
        
        System.out.println(" El area es: \n" + c1.area() + " El perimetro es: \n " + c1.perimetro());
    }
    
}
