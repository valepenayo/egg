
package Servicios;

import Entidad.Raices;
import java.util.Scanner;


public class RaicesServicio {
    Scanner leer= new Scanner(System.in);
    /*
    *) Método getDiscriminante(): devuelve el valor del discriminante
(double). El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
    */
    public double getDiscriminante(Raices r) {
      return Math.pow(r.getB(), 2) - 4*r.getA()*r.getC();
    }
    /*
    Método tieneRaices(): devuelve un booleano indicando si tiene dos
soluciones, para que esto ocurra, el discriminante debe ser mayor o
igual que 0.
    */
    public boolean tieneRaices(Raices r) {
        return getDiscriminante(r)>= 0;
                
    }
    /*
    Método tieneRaiz(): devuelve un booleano indicando si tiene una
única solución, para que esto ocurra, el discriminante debe ser igual
que 0.

    */
    
    public boolean tieneRaiz(Raices r) {
         return getDiscriminante(r)== 0;
    }
    /*
    Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true,
imprime las 2 posibles soluciones.

    */
    public void obtenerRaices(Raices r) {
        if (tieneRaices(r)) {
         double x1=(-r.getB() + Math.sqrt(getDiscriminante(r)))/(2*r.getA()); 
         double x2=(-r.getB() - Math.sqrt(getDiscriminante(r)))/(2*r.getA()); 
            System.out.println("las soluciones son: " + x1 + " y la siguiente solucion es " + x2);
        }else {
            System.out.println("no hay solucion real para esta ecuacion");
        }
    }
    /*
    Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime
una única raíz. Es en el caso en que se tenga una única solución
posible.

    */
    public void obtenerRaiz(Raices r) {
       if (tieneRaiz(r)){
           double x3= (-r.getB()/(2*r.getA())); 
           System.out.println("la solucion es " + x3);
       } else {
           System.out.println("no hay solucion real para esta ecuacion");
       }
    }
        /*
        Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(),
y mostrará por pantalla las posibles soluciones que tiene nuestra
ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo
que devuelvan nuestros métodos y en caso de no existir solución, se
mostrará un mensaje.
Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía
el signo delante de -b
        */
    public void calcular(Raices r) {
        if (tieneRaices(r)) {
           obtenerRaices(r);
          
        } else if (tieneRaiz(r)) {
            obtenerRaiz(r);
        } else
            System.out.println("no tiene solucion en el campo de los reales");
    }
    
}
