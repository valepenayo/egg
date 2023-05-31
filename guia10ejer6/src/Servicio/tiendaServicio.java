//Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos 
//productos que venderemos y el precio que tendrán. Además, se necesita que la 
//aplicación cuente con las funciones básicas. 
package Servicio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class tiendaServicio {
   Scanner leer= new Scanner(System.in); 
   
   public void crearTienda(HashMap<String, Double >tienda) {
       //HashMap<Double, String>tienda= new HashMap();
       boolean salir= true;
        do{
       System.out.println("Ingrese el nombre del producto");
       String produ= leer.next();
            System.out.println("ingrese el precio del producto");
            Double precio= leer.nextDouble();
            tienda.put(produ, precio);
           System.out.println("¡Desea ingresar otro producto? S/N");
          if (leer.next().equalsIgnoreCase("n")) {
            salir=false;
   }
   } while(salir);
       }
   
       

       public void eliminarproducto(HashMap<String, Double>tienda) {
           System.out.println("ingrese el producto que desea remover ");
           String eliminar= leer.next();
           if (tienda.containsKey(eliminar)) {
               tienda.remove(eliminar);
           } else
               System.out.println("el producto no se encuentra en la lista");
}
       public void modificarProducto(HashMap<String,Double >tienda){
           System.out.println("ingrese el producto a modificar");
           if(tienda.containsKey(leer.nextDouble())) {
             tienda.putAll(tienda);
           }
               
       }
          public void mostrar(HashMap<String, Double >tienda) {
              for (Map.Entry<String, Double> entry : tienda.entrySet()) {
                  String key = entry.getKey();
                  Double value = entry.getValue();
                  System.out.println("El producto es " + key + "y el precio es" + value);
                  
              }
}
}

//Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio, 
//eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar 
//Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio. 
//Realizar un menú para lograr todas las acciones previamente mencionadas.