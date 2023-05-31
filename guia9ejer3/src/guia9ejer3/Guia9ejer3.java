package guia9ejer3;

import Servicios.ArregloServicio;

public class Guia9ejer3 {

    public static void main(String[] args) {
     
        ArregloServicio as = new ArregloServicio();
        double A[]= new double[50];
        double B[]= new double[20];
        as.inicializarA(A);
        System.out.println("El arreglo A queda de esta manera ");
        as.mostrarA(A);
        System.out.println("EL arreglo ordenado queda de la siguiente forma ");
        as.ordenar(A);
        System.out.println("EL llenadi del arreglo B queda compuesto asi ");
        as.inicializarB(B, A);
    }
    
}
