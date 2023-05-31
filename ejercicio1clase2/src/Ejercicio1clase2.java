


import java.util.Scanner;
public class Ejercicio1clase2 {

    public static void main(String[] args) {
        System.out.println("ingrese dos numeros enteros");
        //permite leer lo que se ingresa por teclado
          Scanner leer = new Scanner(System.in);
          //int lo guarda para mostrarme el primer  num
           int num1 = leer.nextInt();
         //me guarda el num 2
        int num2 = leer.nextInt();      
       //se crea otra variable para la suma para imprimir por pantalla
        int suma = num1+num2;
         //me muestra por pantalla la suma
        System.out.println("La suma de ambos numeros es:--> " + suma);        
    
    }
    
}
