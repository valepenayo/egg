/*Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
Luego, crea un método "retirar_dinero" que permita retirar una cantidad
de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea
negativo después de realizar una transacción de retiro.
 */
package entidad;

import java.util.Scanner;


public class cuenta {
    private double saldo;
    private String titular;
    private double retiro;

    public cuenta() {
       
    }

    public cuenta(double saldo, String titular, double retiro) {
        Scanner leer= new Scanner(System.in);
        this.saldo = saldo;
        this. titular = titular;
        this.retiro = retiro;
    }
    
      public double retirar_cuenta() {
        Scanner leer= new Scanner(System.in);
        this.saldo = 1500;
        System.out.println("ingrese el nombre del titular");
        this.titular = leer.nextLine();
        System.out.println("Bienvenida/o sr/a "+ titular + "\n su saldo es " + saldo + " \n ingrese el monto a retirar");
        this.retiro = leer.nextDouble();
          if (saldo<retiro) {
              System.out.println("error, el numero ingresado supera su saldo");
              return 00;
          }  
          else {
              System.out.println("En su cuenta queda " + (saldo-retiro) + "\n ¡Muchas gracias por elegirnos!");
       return (saldo - retiro);
      
              
          }
     }
   
    
}
   
