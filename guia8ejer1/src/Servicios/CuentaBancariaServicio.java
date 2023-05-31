
package Servicios;

import entidad.CuentaBancaria;
import java.util.Scanner;

   
         
   public class CuentaBancariaServicio {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
   
    public CuentaBancaria crearCuenta(){
        System.out.println("Ingrese numero de cuenta: ");
        Integer numCuenta=leer.nextInt();
        System.out.println("Ingrese su DNI");
         Long DNIcliente=leer.nextLong();
         System.out.println("Ingrese el monto a depositar:");
         Double saldo=leer.nextDouble();
         
        return new CuentaBancaria( numCuenta, DNIcliente, saldo);
    }
    
    public void  ingresar(CuentaBancaria cb){
     System.out.println("Ingrese el monto a depositar:");
     Double ingreso= leer.nextDouble();
     cb.setSaldo(cb.getSaldo()+ingreso);
     }
    
    public void  retirar(CuentaBancaria cb ){
        System.out.println("¿Cuánto dinero desea retirar?");
        Double retiroDinero=leer.nextDouble();
        if (cb.getSaldo()>= retiroDinero) {
                cb.setSaldo(cb.getSaldo()- retiroDinero);
            }else{
            System.out.println("Fondos Insuficientes. Se entregará el saldo Actual.");
            cb.setSaldo(0.0);
        }
        
     }
    
    public void extraccionRapida (CuentaBancaria cb){
         System.out.println("¿Cuánto dinero desea retirar?");
        Double retiroDinero=leer.nextDouble();
         if (cb.getSaldo()*0.2 >= retiroDinero) {
                cb.setSaldo(cb.getSaldo()- retiroDinero);
            }else{
            System.out.println("Superó el 20%. ");
            
        }
    }
    
    public void consultarSaldo(CuentaBancaria cb){
        System.out.println("Su saldo actual es: " + cb.getSaldo());
    }
    
      public void consultarDatos(CuentaBancaria cb){
          System.out.println(cb.toString()); 
    }
}

         
