/*
 Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar, multiplicar y dividir. 

La aplicación debe tener una función para cada operación matemática y deben devolver sus resultados para imprimirlos en el main. 
 */
package guia4_ej11_teoria;

import java.util.Scanner;

public class Guia4ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese dos numeros");
        int n1= leer.nextInt();
        int n2= leer.nextInt();
        System.out.println("ingrese la operacion a realizar :\n 1.Sumar \n 2.Restar \n 3.Multiplicar \n 4.Dividir \n 5. Salir");
        int menu = leer.nextInt();
        
        
       switch (menu) {
            case(1):
               System.out.println("la suma de los numeros es:" + suma(n1, n2));
             break;
            case(2):
                System.out.println("la resta de los numeros es:" + resta(n1, n2));
             break;
              
            case(3):
              System.out.println("la multiplicacion de los numeros es:" + mul(n1, n2));
             break;
             case(4):
                System.out.println("la division de los numeros es:" + div(n1, n2) );
             break;
             case 5:
                 System.out.println("hasta pronto!");
           
               
               
    }

    }  
       public static int suma(int n1, int n2) {
        int res = n1+n2;
        return res;
       }
 
        public static int resta(int n1, int n2) {
        int res1 = n1-n2;
         return res1;
    }
            public static int mul(int n1, int n2) {
        int res2 = n1*n2;
        return res2;     
    }
                public static int div(int n1, int n2) {
        int res3 = n1/n2;
        return res3;
    }
}
