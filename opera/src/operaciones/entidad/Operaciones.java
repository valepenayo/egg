
package operaciones.entidad;

import java.util.Scanner;

public class Operaciones {
    private double numero1;
    private double numero2;
    
    public Operaciones() { 
    
}
    public Operaciones(double numero1, double numero2) {
     this.numero1= numero1;
     this.numero2= numero2;
    }
     
     public void setNumero1(double numero1){
         this.numero1= numero1;
     }
      public void setNumero2(double numero2){
         this.numero2= numero2;
     }
      public double getNumero1(){
         return numero1;
          }
       public double getNumero2(){
         return numero2;
          }
       public void crearOperaciones(double numero1, double numero2){
        Scanner leer= new Scanner(System.in);
        this.numero1= leer.nextDouble();
        this.numero2= leer.nextDouble();
}
           public double sumar(){
           return (numero1 + numero2);       
}
           public double restar(){
           return (numero1 - numero2);
           }
            public double multi(){
                 if (numero1==0 || numero2==0) {
                   System.out.println("el numero de la multiplicacion da 0, error");
                   return 0;
                 } 
                 else {
               return (numero1 * numero2);
           
           }
            }
             public double divi(){
                 if (numero1==0 || numero2==0) {
                   System.out.println("el numero de la division da 0, error");
                   return 0;
                 }
                 else {
                   return (numero1 / numero2);
                 }

             }
}