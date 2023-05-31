/*Definir una clase llamada Puntos que contendrá las coordenadas de dos
puntos, sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto.
Generar un objeto puntos usando un método crearPuntos() que le pide al
usuario los dos números y los ingresa en los atributos del objeto.
Después, a través de otro método calcular y devolver la distancia que
existe entre los dos puntos que existen en la clase Puntos. Para conocer
como calcular la distancia entre dos puntos consulte el siguiente link:
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.htm
 */
package entidad;

import java.util.Scanner;


public class puntos {
   private double x1;
   private double y1;
   private double x2;
   private double y2;

    
       public void crearPuntos() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese las coordenadas del primer punto:\n" +" x1");
        this.x1 = leer.nextDouble();
        System.out.print("ingrese las coordenadas de :\n " +"y1" );
        this.y1 = leer.nextDouble();
        System.out.println("Ingrese las coordenadas del segundo punto: \n" + "x2");
        this.x2 = leer.nextDouble();
        System.out.print("y2: ");
        this.y2 = leer.nextDouble();
        //leer.close();
    }

    public double calcularDistancia() {
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distancia;
   
   
   
}
}