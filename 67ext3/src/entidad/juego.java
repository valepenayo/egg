/*Crea una clase "Juego" que tenga un método "iniciar_juego" que permita
a dos jugadores jugar un juego de adivinanza de números. El primer
jugador elige un número y el segundo jugador intenta adivinarlo. El
segundo jugador tiene un número limitado de intentos y recibe una pista
de "más alto" o "más bajo" después de cada intento. El juego termina
cuando el segundo jugador adivina el número o se queda sin intentos.
Registra el número de intentos necesarios para adivinar el número y el
número de veces que cada jugador ha ganado.

 */
package entidad;

import java.util.Scanner;

public class juego {
    
    private int jugador1Gana = 0;
    private int jugador2Gana = 0;
    
    public void iniciar_juego() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("¡Bienvenidos al juego de adivinanza de números!");
        System.out.println("Jugador 1: Por favor, elige un número entre 1 y 100.");
        int numero = input.nextInt();
        int intentosMaximos = 10;
        int intentos = 0;
        boolean adivinado = false;
        
       while (intentos < intentosMaximos && !adivinado) {
            System.out.println("Jugador 2: Adivina el número (entre 1 y 100).");
            int adivinanza = input.nextInt();
            intentos++;
            
            if (adivinanza == numero) {
                System.out.println("¡Felicidades! Adivinaste el número en " + intentos + " intentos.");
                jugador2Gana++;
                adivinado = true;
            } else if (adivinanza < numero) {
                System.out.println("El número es más alto.");
            } else {
                System.out.println("El número es más bajo.");
            }
        }
        
        if (!adivinado) {
            System.out.println("¡Lo siento! Te quedaste sin intentos. El número era " + numero + ".");
            jugador1Gana++;
        }
        
        System.out.println("Estadísticas:");
        System.out.println("Jugador 1 ha ganado " + jugador1Gana + " veces.");
        System.out.println("Jugador 2 ha ganado " + jugador2Gana + " veces.");
    }
}