package servicio;


import entidades.persona;
import java.util.Scanner;

public class PersonasServicio {
Scanner leer= new Scanner(System.in);
Scanner nom= new Scanner(System.in);
    
    //Metodo crearPersona(): el método crear persona, le pide los valores
    //de los atributos al usuario y después se le asignan a sus respectivos
    //atributos para llenar el objeto Persona. Además, comprueba que el
    //sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se
    //deberá mostrar un mensaje

   public persona crearPersona(persona p) {
        System.out.print("Ingrese el nombre de la persona: ");
        String nombre = nom.nextLine();
        p.setNombre(nombre);

        System.out.print("Ingrese la edad de la persona: ");
        int edad = leer.nextInt();
        p.setEdad(edad);

        System.out.print("Ingrese el sexo de la persona (H/M/O): ");
        char sexo = leer.next().charAt(0);
        while (sexo != 'H' && sexo != 'M' && sexo != 'O') {
            System.out.print("Sexo inválido. Por favor, ingrese H, M o O: ");
            sexo = leer.next().charAt(0);
        }
        p.setSexo(sexo);
        
        System.out.print("Ingrese el peso de la persona (en kg): ");
        double peso = leer.nextDouble();
        p.setPeso(peso);

        System.out.print("Ingrese la altura de la persona (en metros): ");
        double altura = leer.nextDouble();
        p.setAltura(altura);
        return p;
        
    }
    //Método esMayorDeEdad(): indica si la persona es mayor de edad. La
    //función devuelve un booleano.

    public boolean esMayorDeEdad(persona p) {
        return p.getEdad() >= 18;
        }

    
    //Método calcularIMC(): calculara si la persona está en su peso ideal
    //(peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un
    //valor menor que 20, significa que la persona está por debajo de su
    //peso ideal y la función devuelve un -1. Si la fórmula da por resultado
    //un número entre 20 y 25 (incluidos), significa que la persona está en
//su peso ideal y la función devuelve un 0. Finalmente, si el resultado
//de la fórmula es un valor mayor que 25 significa que la persona tiene
//sobrepeso, y la función devuelve un 1.
    
  
     public int calcularIMC(persona p) {
         
        double imc = p.getPeso() / Math.pow(p.getAltura(), 2);
        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }     

}
}