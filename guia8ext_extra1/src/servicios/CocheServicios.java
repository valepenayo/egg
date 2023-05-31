
package servicios;

import entidades.coche;
import java.util.Scanner;

public class CocheServicios {
    Scanner leer= new Scanner(System.in);
    
    public coche ingresarCoche( coche c) {
        System.out.println("ingrese la marca del coche");
        String marca= leer.nextLine();
        c.setMarca(marca);
        
        System.out.println("ingrese el modelo del coche");
        String modelo= leer.nextLine();
        c.setModelo(modelo);
        
        System.out.println("ingrese el precio");
        double precio= leer.nextDouble();
        c.setPrecio(precio);
        
        return c;
    }
     public void mostrarCoche(coche c) {
         System.out.println("el modelo del auto es " + c.getModelo() + " ,la marca del auto es " + c.getMarca() + " y el precio del mismo es " + c.getPrecio() + "u$d");
     }
}
   
