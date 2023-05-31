
package guia9ejer2;

import Entidades.ParDeNumeros;
import Servicios.ParDeNumeroServicios;


public class Guia9ejer2 {

    public static void main(String[] args) {
       ParDeNumeros pdn = new ParDeNumeros();
       ParDeNumeroServicios pdns = new ParDeNumeroServicios();
       
       pdns.mostrarValores(pdn);
       pdns.devolverMayor(pdn);
       pdns.calcularPotencia(pdn);
       pdns.calcularRaiz(pdn);
       
      
    }
    
}
