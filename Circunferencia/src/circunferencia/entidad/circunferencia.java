
package circunferencia.entidad;

import java.util.Scanner;

public class circunferencia {
    
    private double radio;
          
         public circunferencia(double radio){
         this.radio= radio;
         
            }
    
         public void crearCircunfenrecia(){
             System.out.println("ingrese el radio");
             Scanner leer= new Scanner(System.in);
             this.radio= leer.nextDouble();
         }
         //para calcular el área de la circunferencia (Area= (π*radio^2).
             public double area(){ 
             return Math.PI* Math.pow(radio,2);
         }
         // para calcular el perímetro(Perimetro=2*π*radio)
         public double perimetro(){
            return (2*Math.PI*radio);
         }
         
           public void setRadio(double radio) {
           this.radio= radio;
         }
         public double getRadio(){
         return radio;
          }




}
