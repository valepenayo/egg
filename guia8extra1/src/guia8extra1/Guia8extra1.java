
package guia8extra1;

import Entidad.Raices;
import Servicios.RaicesServicio;

public class Guia8extra1 {

    public static void main(String[] args) {
       Raices r= new Raices(2, 3, -2);
       RaicesServicio rs= new RaicesServicio();
       
       rs.calcular(r);
    }
    
}
