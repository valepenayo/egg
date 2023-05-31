
package guia9ejer6;

import Entidad.Curso;
import servicio.CursoServicio;


public class Guia9ejer6 {

    public static void main(String[] args) {
        Curso c= new Curso(); 
       CursoServicio cs= new CursoServicio();
       
       
       cs.crearCurso();
       cs.calcularGananciaSemanal();
    }
    
}
