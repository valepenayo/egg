
package guia8ext_extra2;

import entidades.Estudiante;
import servicios.EstudianteServicios;


public class Guia8ext_extra2 {

    public static void main(String[] args) {
        Estudiante e= new Estudiante();
        EstudianteServicios es= new EstudianteServicios();
        es.crearEstudiante(e);
        es.mostrar(e);
        es.mostrarAoD(e);
    }
    
}
