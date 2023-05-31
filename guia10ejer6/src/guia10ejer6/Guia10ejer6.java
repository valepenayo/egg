
package guia10ejer6;

import Servicio.tiendaServicio;
import java.util.HashMap;
import java.util.Scanner;

public class Guia10ejer6 {

   
    public static void main(String[] args) {
        tiendaServicio ts= new tiendaServicio();
        Scanner leer= new Scanner(System.in);
       HashMap<String, Double> tienda = new HashMap();
       ts.crearTienda(tienda);
       
        System.out.println("Que desea hacer? \n 1. Mostrar los productos \n 2. Eliminar un producto \n 3. Modificar un producto \n 4. salir");
        int menu= leer.nextInt();
         do {
             switch (menu) {
                 case 1:
                     ts.eliminarproducto(tienda);
                     break;
                 case 2:
                     ts.modificarProducto(tienda);
                     break;
                 case 3:
                     ts.mostrar(tienda);
                     break;
                 default:
                     System.out.println("la opcion ingresada es incorrecta");
                     break;
    }
    }while (menu !=4);
    
}
}
