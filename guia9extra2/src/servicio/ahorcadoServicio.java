
package servicio;

import entidad.ahorcado;
import java.util.Scanner;

public class ahorcadoServicio {

    Scanner leer = new Scanner(System.in);
    ahorcado a = new ahorcado();
//    Metodo crearJuego(): le pide la palabra al usuario y cantidad de
//jugadas máxima. Con la palabra del usuario, pone la longitud de la
//palabra, como la longitud del vector. Después ingresa la palabra en el
//vector, letra por letra, quedando cada letra de la palabra en un índice
//del vector. Y también, guarda la cantidad de jugadas máximas y el
//valor que ingresó el usuario.

    public ahorcado crearJuego() {
        System.out.println("ingrese la palabra");
        a.setFrase(leer.next());
        System.out.println("ingrese la cantidad de jugadas maximas");
        a.setCantJugadasMax(leer.nextInt());
        int cantLetras = a.getFrase().length();
        String vaux[] = new String[cantLetras];

        for (int i = 0; i < a.getFrase().length(); i++) {
            vaux[i] = a.getFrase().substring(i, i + 1);

        }
        a.setVector(vaux);
        return a;
    }
//Método longitud(): muestra la longitud de la palabra que se debe
//encontrar. Nota: buscar como se usa el vector.length.
    public void longitud() {
        System.out.println("la longitud de la letra es " + a.getFrase().length());
        
    }
//    Método buscar(letra): este método recibe una letra dada por el
//usuario y busca si la letra ingresada es parte de la palabra o no.
//También informará si la letra estaba o no.
    public int buscar() {
        System.out.println("ingrese una letra");
        String letra= leer.next();
        int cont=0;
        for (int i = 0; i < a.getVector().length; i++) {
            if(a.getVector()[i].equalsIgnoreCase(letra)) {
               System.out.println("la letra " + letra + "es parte de la palabra en posicion " +(i+1)); 
            } else {
               cont ++;    
        } 
            if (cont==a.getVector().length) {
            System.err.println("La letra " + letra +" no se ha encontrado");
        } 
        return cont;
    }
//    Método encontradas(letra): que reciba una letra ingresada por el
//usuario y muestre cuantas letras han sido encontradas y cuántas le
//faltan. Este método además deberá devolver true si la letra estaba y
//false si la letra no estaba, ya que, cada vez que se busque una letra
//que no esté, se le restará uno a sus oportunidades.

    public boolean encontradas() {
        boolean estaba= false;
        int encontradas = buscar();
       if (encontradas==a.getVector().length);
      System.out.println("El numero de letras encontradas son: " + encontradas +" y faltantes: " + (a.getFrase().length() - encontradas)+ ")" );
   System.out.println("Perfecto ! has encontrado (" + encontradas + ") de [" + a.getFrase().length() + "] Letras,"  + " hasta el momento ");
            System.out.println("Felicitaciones! has adivinado, la palabra era " + a.getFrase());
            a.getCantJugadasMax(-1);
        } else {
            System.out.println("has encontrado " + encontradas + " de [" + a.getFrase().length()+ "] Letras," + " hasta el momento ");
        }
        if ( estaba== true && a. > 0) {
            System.out.println("Le quedan " + a.getCantJugadasMax() + " intentos");
        } else if (estaba == true && a.getCantJugadasMax() < 0) {
            System.out.println("Lo has conseguido");
        } else {
            a.setCantJugadasMax(a.getCantJugadasMax() - 1);
            System.out.println("Le quedan " + a.getCantJugadasMax() + " intentos");
        }
    }
  
   
   public void juego () {
       boolean encontrar;
       crearJuego();
       longitud();
       System.out.println("-----------------");
       int aciertos=0;
       
       do {
           System.out.println("ingrese una letra");
          String l = leer.next();
          aciertos= aciertos + buscar();
          
          encontrar= encontradas();
          if (encontrar) {
              a.setCantJugadasMax(a.getCantJugadasMax()-1);
          }
          intentos();
           System.out.println("La cantidad de letras encontradas es " + aciertos + " y la cantidad de letras faltantes es " + (a.getFrase().length() - aciertos));
       } while (a.getCantJugadasMax()>0&&aciertos== a.getFrase().length());
   }
}
