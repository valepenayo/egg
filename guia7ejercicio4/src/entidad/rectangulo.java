
package entidad;

import java.util.Scanner;

public class rectangulo {
    private double base;
    private double altura;
    
    
   public rectangulo(){
       
   }
    
    public rectangulo(double altura, double base){
   
      this.altura= altura;
       this.base= base;
    }
       public void crearRecta(){
        Scanner leer= new Scanner(System.in);
           System.out.println("ingrese altura");
           this.altura= leer.nextDouble();
           System.out.println("ingrese la base");
           this.base= leer.nextDouble();
    }
    
    public double superficie(){
       
        return (base*altura);
    }
    public double perimetro(){
        return (base+altura)*2;
}

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
   
    public void dibujar() {
       for (int i = 0; i <= altura; i++) {
            for (int j = 0; j <= base; j++) {
                
                    System.out.print("*");
                
                }
            System.out.println();
            }
       System.out.println(" ");
    }

}
