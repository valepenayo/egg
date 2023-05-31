/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10ejer4;

import entidad.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;
import servicio.PeliculaServicio;

public class Guia10ejer4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       PeliculaServicio ps= new PeliculaServicio();
       ArrayList <Pelicula> pelis = ps.CrearPelicula();
        System.out.println("¿Que desea hacer? \n 1.Mostrar peliculas\n 2.Mostrar duracion \n 3. Mostrar peliculas de mayor a menor duracion \n 4. Mostrar peliculas de menor a mayor duracion \n 5. Mostrar peliculas ordenadas alfabeticamente \n 6. Mostrar directores ordenados alfabeticamente ");
       int menu= leer.nextInt();
       boolean salir= true;
       do {
        switch(menu){
           case 1:
       ps.mostrarPeliculas(pelis);
       break;
           case 2:
       ps.mostrarDuracion(pelis);
       break;
           case 3:
       ps.mpstrarPelisMayor(pelis);
       break;
           case 4:
       ps.duracionOrdenadaMenor(pelis);
       break;
           case 5:
       ps.compararTitulos(pelis);
       break;
           case 6:
       ps.compararDirector(pelis);
       break;
           case 7: 
               System.out.println("gracias por elegirnos");
         salir = false; 
    }
       } while (salir);
       
}
}
