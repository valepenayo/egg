package servicios;

import java.util.Date;
import java.util.Scanner;

public class FechaServicios {

    Scanner leer = new Scanner(System.in);

//Método fechaNacimiento que pregunte al usuario día, mes y año de
//su nacimiento. Luego los pase por parámetro a un nuevo objeto Date.
//El método debe retornar el objeto Date. Ejemplo fecha: Date fecha =
//new Date(anio, mes, dia);
    public Date fechaDeNacimiento() {
        System.out.println("introduzca el dia en que nacio con el siguiente parametro 'dd'");
        int dia = leer.nextInt();
        System.out.println("introduzca el mes en que nacio con el siguiente parametro 'mm'");
        int mes = leer.nextInt();
        System.out.println("introduzca el año en que nacio con el siguiente parametro 'aaaa'");
        int anio = leer.nextInt();
        Date fecha1 = new Date(anio - 1900, mes - 1, dia);

        return fecha1;
    }
// Método fechaActual que cree un objeto fecha con el día actual. Para
//esto usaremos el constructor vacío de la clase Date. Ejemplo: Date
//fechaActual = new Date();
//El método debe retornar el objeto Date.

    public Date fechaActual() {
        Date fecha2 = new Date();
        return fecha2;
    }
// Método diferencia que reciba las dos fechas por parámetro y retorna
//la diferencia de años entre una y otra (edad del usuario)

//    public int diferencia(Date fecha1, Date fecha2) {
//        return fecha2.getYear() - fecha1.getYear();
//
//    }
    public int calcularDiferencia(Date fecha1, Date fecha2) {
        long milisegundosPorAnio = 1000L * 60 * 60 * 24 * 365;
        long diferenciaMilisegundos = fecha2.getTime() - fecha1.getTime();
        int edad = (int) (diferenciaMilisegundos / milisegundosPorAnio);
        return edad;
    }
}
