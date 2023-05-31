package guia9ejer4;

import java.util.Date;
import servicios.FechaServicios;

public class Guia9ejer4 {

    public static void main(String[] args) {

        FechaServicios fs = new FechaServicios();
        Date fecha1 = fs.fechaDeNacimiento();
        System.out.println("La fecha de nacimiento es " + fecha1);
        Date fecha2 = fs.fechaActual();
        System.out.println("La fecha actual es " + fecha2);
        System.out.println("La edad del usuario es " + fs.calcularDiferencia(fecha1, fecha2));
    }

}
