package Servicios;

import java.util.Arrays;

public class ArregloServicio {
//1) Método inicializarA recibe un arreglo por parámetro y lo inicializa con
//números aleatorios.

    public void inicializarA(double A[]) {

        for (int i = 0; i < A.length; i++) {
            A[i] =Math.round (Math.random()*100);

        }

    }
//2) Método mostrar recibe un arreglo por parámetro y lo muestra por
//pantalla.

    public void mostrarA(double A[]) {
        for (int i = 0; i < A.length; i++) {
            System.out.println("[" +A[i]+"]");
        }
        System.out.println("-----------");
    }
//3) Método ordenar recibe un arreglo por parámetro y lo ordena de
//mayor a menor.

    public void ordenar(double A[]) {
        Arrays.sort(A);
        for (int i = A.length-1; i>=0; i--) {
            System.out.println("[" + A[i]+"]");

        }
        System.out.println("-----------");
    }
//4) Método inicializarB copia los primeros 10 números del arreglo A en el
//arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.

    public void inicializarB(double B[], double A[]) {
        for (int i = 0; i < B.length; i++) {
            if (i < 10) {
                B[i] = A[i];
            } else {
                Arrays.fill(B, 10, 20, 0.5);
            }
           
        }
        System.out.println(Arrays.toString(B));
    }
}
