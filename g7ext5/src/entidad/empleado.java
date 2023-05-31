/*. Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y
"salario". Luego, crea un método "calcular_aumento" que calcule el
aumento salarial de un empleado en función de su edad y salario actual.
El aumento salarial debe ser del 10% si el empleado tiene más de 30
años o del 5% si tiene menos de 30 años.
 */
package entidad;

import java.util.Scanner;

public class empleado {
    private String nombre;
    private int edad;
    private double salario;
    private double aumen1;
    private double aumen2;

    public empleado() {
    }

    public empleado(String nombre, int edad, double salario, double aumen1, double aumen2) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.aumen1 = aumen1;
        this.aumen2 = aumen2;
    }
    
    

   
      
    public double calcular_aumento() {
      Scanner leer= new Scanner(System.in); 
        System.out.println("ingrese el nombre del empleado ");
        this.nombre= leer.next();
        System.out.println("ingrese el salario del empleado " + nombre);
        this.salario= leer.nextDouble();
        System.out.println("ingrese la edad del empleado " + nombre);
        this.edad= leer.nextInt();
        aumen1= salario*0.05;
        aumen2= salario*0.1;
        
        if (edad < 30) {
            System.out.println("El aumento del empleado " + nombre + " es: " + (salario + aumen1));
            return salario + aumen1;
        }    
        else {
            System.out.println("El aumento del empleado " + nombre + " es: " + (salario + aumen2));
            return salario+aumen2;
        
        }
        
        
        
        
        
        
    }
}


