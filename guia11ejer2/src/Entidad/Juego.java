/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;
import java.util.Scanner;

public class Juego {
Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    private ArrayList<Jugador> jugadores;
    private Revolver r = new Revolver();

    public Juego() {
    }

    public Juego(ArrayList<Jugador> jugadores, Revolver r) {
        this.jugadores = jugadores;
        this.r = r;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getR() {
        return r;
    }

    public void setR(Revolver r) {
        this.r = r;
    }
    
    public void llenarJuego(ArrayList<Jugador> jugadores){
        
        System.out.println("Ingrese la cantidad de jugadores: ");
        int cant = leer.nextInt();
        
        if (cant < 1) {
            cant = 1;
        } else if (cant > 6){
            cant = 6;
        }
        
        for (int i = 0; i < cant; i++) {
            
            System.out.println("Ingrese el nombre del Jugador Nº " + (i+1));
            Jugador jug = new Jugador(i,leer.next(),false);
            jugadores.add(jug);
            
        }
       
        
    }
    
    public boolean ronda(ArrayList<Jugador> jugadores){
        
        r.llenarRevolver();
        boolean terminar = true;
        System.out.println("\t |Progreso|");
        System.out.println("--------------------------------");
        
        while (terminar) {
            for (Jugador jugador : jugadores) {
                System.out.println(jugador.getNombre() + " " + r.toString());
                if (jugador.disparo(r)) {
                    System.out.println(jugador.getNombre() + " (jugador Nº " + jugador.getId() + ") se mojó. Se terminó la partida.");
                    terminar = false;
                    break;
                }
            }
        }
        System.out.println("--------------------------------");
        return terminar;
    }
    
    
}

