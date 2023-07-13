/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11ejer2;

import Entidad.Juego;
import Entidad.Jugador;
import Entidad.Revolver;
import java.util.ArrayList;

/**
 *
 * @author vale
 */
public class Guia11ejer2 {

/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Jugador> jugadores = new ArrayList();
        Juego j = new Juego();
        Revolver r= new Revolver();
        
        System.out.println("\t|Ruleta Rusa|");
        System.out.println("--------------------------------");
        j.llenarJuego(jugadores);
        
        System.out.println("\t|Lista de Jugadores|");
        System.out.println("--------------------------------");
        
        for (Jugador jugador : jugadores) {
            System.out.println(jugador.toString());
        }
        
        System.out.println("--------------------------------");
        j.ronda(jugadores);
                    
    }
   
}
