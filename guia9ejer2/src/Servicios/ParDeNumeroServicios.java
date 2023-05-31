
package Servicios;

import Entidades.ParDeNumeros;

public class ParDeNumeroServicios {
// a) Método mostrarValores que muestra cuáles son los dos números
//guardados.
    public void mostrarValores(ParDeNumeros pdn) {
        System.out.println("El valor del numeros 1 es " + pdn.getNum1() + " y el valor del numero 2 es " + pdn.getNum2());
    }
//b) Método devolverMayor para retornar cuál de los dos atributos tiene
//el mayor valor
    public double devolverMayor(ParDeNumeros pdn) {
        if (pdn.getNum1()>pdn.getNum2()) {
            System.out.println("El numero mas grande es " + pdn.getNum1());
            return pdn.getNum1();
        } else
            System.out.println("El numero mas grande es " + pdn.getNum2());
           return pdn.getNum2();
    }
//c) Método calcularPotencia para calcular la potencia del mayor valor de
//la clase elevado al menor número. Previamente se deben redondear
//ambos valores.
          public void calcularPotencia(ParDeNumeros pdn) {
            if (pdn.getNum1()>pdn.getNum2()) {
            System.out.println("La potencia del mayor valor es " + Math.pow (pdn.getNum1(),pdn.getNum2()));
      
        } else
            System.out.println("La potencia del mayor valor es " + Math.pow (pdn.getNum1(),pdn.getNum2()));
          
          }
          
//d) Método calculaRaiz, para calcular la raíz cuadrada del menor de los
//dos valores. Antes de calcular la raíz cuadrada se debe obtener el
//valor absoluto del número.
      public void calcularRaiz(ParDeNumeros pdn) {
         if (pdn.getNum1()>pdn.getNum2()) {
            double valAbsoluto= Math.abs(pdn.getNum2());
             System.out.println("La raiz cuadrada es " + Math.sqrt(valAbsoluto));
      
        }  
            else if (pdn.getNum1()<pdn.getNum2()) {
          
            double valAbs= Math.abs(pdn.getNum1());
            System.out.println("La raiz cuadrada es " + Math.sqrt(valAbs));
          
          } 
          
      }
}
