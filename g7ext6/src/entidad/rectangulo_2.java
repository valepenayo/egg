/*
 Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un
método "calcular_area" que calcule y devuelva el área del rectángulo.
Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados
de 4 y 6 y imprime el área del rectángulo.
*/
package entidad;

import java.util.Scanner;


public class rectangulo_2 {
    private double lado1;
    private double lado2;

    public rectangulo_2() {
    }

    public rectangulo_2(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    public double calcularArea() {
        Scanner leer= new Scanner(System.in);
        System.out.println("ingrese el ancho del rectangulo");
        this.lado1= leer.nextDouble();
        System.out.println("ingrese el largo del rectangulo");
        this.lado2= leer.nextDouble();
        System.out.println("el area del primer rectangulo es : " + lado1*lado2);
    return lado1*lado2;
    
}
    public double Rectangulo1() {
        this.lado1= 6;
        this.lado2= 4;
        System.out.println("El area del rectangulo es: " + (lado1*lado2));
        return (lado1*lado2);
    }
}