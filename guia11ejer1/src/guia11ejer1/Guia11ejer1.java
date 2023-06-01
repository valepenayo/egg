/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11ejer1;

import entidad.Perro;
import entidad.Persona;

/**
 *
 * @author vale
 */
public class Guia11ejer1 {

    public static void main(String[] args) {
        Persona p1= new Persona("vale", "penayo",31, 34566545);
        Persona p2= new Persona("jose", "perez", 40, 56567555);
        
        Perro pe1= new Perro("draco", "caniche", "grande", 2);
        Perro pe2= new Perro("cleo", "bull dog", "mediano", 5);
        
        p1.adoptar(pe2);
        p2.adoptar(pe1);
        p1.mostrar();
        p2.mostrar();
    }
    
}
