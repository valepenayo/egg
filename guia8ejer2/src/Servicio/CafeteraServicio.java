
package Servicio;

import entidad.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {
    private Scanner leer = new Scanner(System.in);

    // Método llenarCafetera(): hace que la cantidad actual sea igual a la
    //capacidad máxima
    public Cafetera llenarCafetera() {
        System.out.println("ingrese la capacidad maxima en mililitros de la cafetera");
        double capMax = leer.nextDouble();
        double cantActual = capMax;
        return new Cafetera(cantActual, capMax);
    }
    //Método servirTaza(int): se pide el tamaño de una taza vacía, el
    //método recibe el tamaño de la taza y simula la acción de servir la
    //taza con la capacidad indicada. Si la cantidad actual de café “no
    //alcanza” para llenar la taza, se sirve lo que quede. El método le
    //informará al usuario si se llenó o no la taza, y de no haberse llenado
    //en cuanto quedó la taza.

    public void servirTaza(Cafetera c) {
        System.out.println("ingrese el tamaño de la taza ");
        int taza = leer.nextInt();
        if (c.getCantActual() > taza) {
            c.setCantActual(c.getCantActual() - taza);
            System.out.println("la cafetera tiene " + c.getCantActual());
        } else {
            System.out.println("la taza no se ha llenado, la cafetera no tiene sufuciente cafe, solo se ha llenado " + c.getCantActual());
        }

    }

    //Método vaciarCafetera(): pone la cantidad de café actual en cero
    public void vaciarCafetera(Cafetera c) {
        c.setCantActual(0);
        System.out.println("la cafetera se ha vaciado con exito");
    }
    //Método agregarCafe(int): se le pide al usuario una cantidad de café,
    //el método lo recibe y se añade a la cafetera la cantidad de café
    //indicada.

    public void agregarCafe(Cafetera c) {
        System.out.println("ingrese la cantidad a agregar");
        int agregar = leer.nextInt();
        c.setCantActual(c.getCantActual() + agregar);
        System.out.println("se ha agregado con exito, la cantidad total es " + c.getCantActual());
    }
}
