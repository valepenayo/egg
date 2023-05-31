
package guia8ext_extra1;

import entidades.coche;
import servicios.CocheServicios;

public class Guia8ext_extra1 {

    public static void main(String[] args) {
        coche c= new coche();
        CocheServicios cs= new CocheServicios();
        
        cs.ingresarCoche(c);
        cs.mostrarCoche(c);
    }
    
}
