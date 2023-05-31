/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ejer1;

import Servicios.CuentaBancariaServicio;
import entidad.CuentaBancaria;



public class Guia8ejer1 {

  
    public static void main(String[] args) {
       
        CuentaBancariaServicio cbs= new CuentaBancariaServicio();
        CuentaBancaria cb= new CuentaBancaria();
        
       cb=cbs.crearCuenta();
       cbs.consultarDatos(cb);
       cbs.consultarSaldo(cb);
       cbs.extraccionRapida(cb);
       cbs.retirar(cb);
       cbs.ingresar(cb);
       cbs.consultarSaldo(cb);
    }
    
}
        
      
