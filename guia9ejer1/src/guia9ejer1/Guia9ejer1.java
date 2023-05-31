
package guia9ejer1;

import Entidades.Cadena;
import Servicios.CadenaServicios;
import java.util.Scanner;

public class Guia9ejer1 {

    public static void main(String[] args) {
     Scanner leer= new Scanner(System.in);
     
     Cadena c= new Cadena();
     CadenaServicios cs= new CadenaServicios();
     cs.mostrarVocales(c);
        System.out.println("que desea hacer? \n 1. Invertir la frase \n 2. Las veces que se encuentra repetida una letra \n 3. Comparar la longitud de una frase \n 4. Unir frase \n 5. Reemplazar \n 6. Contiene ");
       int  menu= leer.nextInt();
     switch (menu){
         case 1:
    cs.invertirFrase(c);
     break;
         case 2:
     cs.vecesRepetido(c);
     break;
         case 3:
       cs.compararLongitud(c);
     break;
         case 4:
     cs.unirFrase(c);
     break;
         case 5:
    cs.reemplazar(c);
     break;
         case 6:
      if (cs.contiene(c)) {
         System.out.println("La letra buscada si se encuentra en la frase");
     } else 
            System.out.println("La letra NO se encuentra en la frase");
     break;
   
    }
    
}
}
