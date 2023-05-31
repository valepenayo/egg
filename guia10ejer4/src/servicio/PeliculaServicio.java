
package servicio;

import entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class PeliculaServicio {
    Scanner leer= new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    ArrayList<Pelicula> pelis= new ArrayList();
  
    
    public ArrayList<Pelicula> CrearPelicula() {
      
        boolean salir= true;
       do {
           Pelicula p= new Pelicula();
           System.out.println("Ingrese el nombre de la pelicula ");
           p.setTitulo(leer.next());
           System.out.println("Ingrese el director de la pelicula ");
           p.setDirector(leer.next());
           System.out.println("Ingrese la duracion de la pelicula ");
           p.setDuracionPelicula(leer.nextDouble());
           pelis.add(p);
           System.out.println("¿Desea ingresar otra pelicula? S/N");
           String resp= leer.next();
           if (resp.equalsIgnoreCase("N")) {
                         // o if(leer.next.equalsIgnoreCase("N") se puede utilizar sin crear la variable respuesta.
               salir= false;
           }
       } while (salir);
       return pelis;
        
    }
    public void mostrarPeliculas(ArrayList<Pelicula> pelis) {  
        System.out.println("Las peliculas guardadas en la lista son: ");
        for (Pelicula p : pelis) {
            System.out.println(p.getTitulo());// si no anda llamar a p;
            
        }
    }
        public void mostrarDuracion (ArrayList<Pelicula> pelis){
           for (Pelicula p: pelis) {
            if (p.getDuracionPelicula()>1)
                   System.out.println(p);
               
        }
        }
           public void duracionOrdenadaMenor (ArrayList <Pelicula> pelis) {
                System.out.println("-------------->ordenadas por duracion de menor a mayor");
               pelis.sort(Pelicula.compararDuracion);
                mostrarPeliculas(pelis);
             
           }
           public void mpstrarPelisMayor(ArrayList <Pelicula> pelis) {
               System.out.println("------------->ordenadas por duracion de mayor a menor");
              pelis.sort(Pelicula.compararDuracion);
              Collections.reverse(pelis); 
               mostrarPeliculas(pelis);
              
           }
            public void compararTitulos(ArrayList <Pelicula> pelis) {
                 System.out.println("------------------>ordenadas por titulo");
                pelis.sort(Pelicula.compararTitulo);
              Collections.reverse(pelis); 
               mostrarPeliculas(pelis);
               
           }
             public void compararDirector(ArrayList <Pelicula> pelis) {
                  System.out.println("--------------------->Ordenadas por director");
                 pelis.sort(Pelicula.compararAutor);
              Collections.reverse(pelis); 
               mostrarPeliculas(pelis);
           } 
    }
    

