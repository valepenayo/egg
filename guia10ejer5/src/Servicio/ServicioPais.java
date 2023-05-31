package Servicio;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class ServicioPais {

    Scanner leer = new Scanner(System.in);
//Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos 
//usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el 
//conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir, 
//si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer 
//los servicios en la clase correspondiente)
    public void llenarHash(HashSet<String> paises) {
        boolean salir = true;
        do {
            System.out.println("Ingrese un pais");
            paises.add(leer.next());
            System.out.println("¿Desea ingresar otro pais? S/N");
            if (leer.next().equalsIgnoreCase("n")){
                salir = false;
            }
        } while (salir);
        System.out.println("la lista de paises es :");
        for (String aux: paises)
        System.out.println(aux);
      
    } 
//Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar 
//cómo se ordena un conjunto
    public void ordenar (HashSet<String> paises) {
        TreeSet<String> paisesOrdenados= new TreeSet(paises);
        System.out.println("La lista de paises ordenados es: ");
          for (String paisOrdenado :  paisesOrdenados) {
              System.out.println(paisOrdenado); 
          }
    }
//    Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se 
//buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el 
//usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará 
//al usuario.
     public void eliminarPais (HashSet<String> paises) {
      boolean noEncontrado= true;
      Iterator  it= paises.iterator();
         System.out.println("ingrese el pais a eliminar");
         String eliminar= leer.next();
         while(it.hasNext()) {
             if (it.next().equals(eliminar)) {
                it.remove();
                noEncontrado = false;
                 System.out.println("la lista actualizada es : ");
                         for (String aux: paises) {
                          System.out.println(aux);
                         }
                
              break;
            } 
        
            if (noEncontrado) {
            System.out.println("El pais ingresado no se encuentra");
        }
        System.out.println("la lista de paises es :");
        for (String aux: paises) {
        System.out.println(aux);

        }
      
      
}}
}
      


