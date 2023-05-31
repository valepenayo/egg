/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ejer2;

import Servicio.CafeteraServicio;
import entidad.Cafetera;
import java.util.Scanner;

public class Guia8ejer2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int menu = 0;
        Cafetera c = new Cafetera();
        CafeteraServicio cs = new CafeteraServicio();
        c = cs.llenarCafetera();
        do {
            System.out.println("que opcione desea realizar? \n 1. servir taza \n 2. vaciar la cafetera \n 3. agregar cafe \n 4. salir");
            menu = leer.nextInt();
            switch (menu) {
                case 1:
                    cs.servirTaza(c);
                    break;
                case 2:
                    cs.vaciarCafetera(c);
                    break;
                case 3:
                    cs.agregarCafe(c);
                    break;
                case 4:
                    System.out.println("Muchas gracias!");

            }
        } while (menu != 4);

    }

}
