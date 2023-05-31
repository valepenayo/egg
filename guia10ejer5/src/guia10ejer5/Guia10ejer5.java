
package guia10ejer5;

import Servicio.ServicioPais;
import java.util.HashSet;
import java.util.Set;

public class Guia10ejer5 {

    public static void main(String[] args) {
       
                      
        ServicioPais sp = new ServicioPais();
        HashSet<String> paises =new HashSet();
        sp.llenarHash(paises);
        sp.ordenar(paises);
        sp.eliminarPais(paises);
        
    }

}
