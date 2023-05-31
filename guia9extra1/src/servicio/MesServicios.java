package servicio;

import entidades.meses;
import java.util.Scanner;

public class MesServicios {

    meses m = new meses();
    Scanner leer = new Scanner(System.in);

    public meses adivinanza() {
        String meses[] = {"enero", "febrero", "marzo", "abril", "mayo", "juniio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        String mesSecreto = meses[10];
        m.setMeses(meses);
        m.setMesSecreto(mesSecreto);
          do {
        System.out.println("introducir un mes en minusculas");
        String mesu = leer.next();
            if (mesu.equalsIgnoreCase(m.getMesSecreto())) {
                System.out.println("Usted a adivinado el mes ¡FELICIDADES!");
                break;
            } else {
                System.err.println("El mes ingresado no es correcto, ingrese otro mes");
            }
          } while (true);
          
        return m;
    }
}
