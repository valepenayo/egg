//Implementar un programa que le pida dos números enteros al usuario y determine si ambos o alguno de ellos es mayor a 25.


import java.util.Scanner;

public class Ejercicio1clase4 {

    public static void main(String[] args) {
        System.out.println("ingrese dos numeros");
        Scanner leer = new Scanner (System.in);
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        if (num1 > 25) 
            System.out.println("el numero 1 ingresado es mayor a 25");
        if (num2 > 25)
            System.out.println("el numero 2 ingresado es mayor a 25");
        else 
            System.out.println("ninguno de los numeros ingresados es mayor a 25");
}
}