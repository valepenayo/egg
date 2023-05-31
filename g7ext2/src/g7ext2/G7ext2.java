
package g7ext2;

import entidad.puntos;


public class G7ext2 {

    public static void main(String[] args) {
        puntos p1 = new puntos();
        p1.crearPuntos();
        double distancia = p1.calcularDistancia();
        System.out.println("La distancia entre los puntos es: " + distancia);
    }
    
}
