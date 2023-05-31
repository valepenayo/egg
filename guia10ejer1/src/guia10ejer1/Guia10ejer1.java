package guia10ejer1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Guia10ejer1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<String> perro = new ArrayList();

        boolean salir = true;

        do {
            System.out.println("ingrese una raza de perro");
            String raza = leer.next();
            perro.add(raza);
            //perro.add(leer.nextLine()); esta opcion tambien es valida sin crear la variable String raza

            if (raza.equalsIgnoreCase("salir")) {
                salir = false;

            }
        } while (salir);

        for (String raza : perro) {
            System.out.println(raza);

        }

        System.out.println("ingrese la raza a eliminar: ");
        String razaM = leer.next();
        boolean noEncontrado = true;
        Iterator<String> it = perro.iterator();
        while (it.hasNext()) {
            if (it.next().equals(razaM)) {
                it.remove();
                noEncontrado = false;
                break;

            }

        }
        if (noEncontrado) {
            System.out.println("La raza de perro ingresada no se encuentra");
        }

        Collections.sort(perro);
        for (String raza : perro) {
            System.out.println(raza);

        }
    }
}
    
    

