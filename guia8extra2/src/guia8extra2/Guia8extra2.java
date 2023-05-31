/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8extra2;

import Entidades.Nif;
import Servicios.NifServicios;

/**
 *
 * @author vale
 */
public class Guia8extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Nif n= new Nif();
       NifServicios ns= new NifServicios();
       
       ns.CrearNif(n);
       ns.mostrar(n);
    }
  
    }

