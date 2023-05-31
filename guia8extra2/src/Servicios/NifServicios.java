
package Servicios;

import Entidades.Nif;
import java.util.Scanner;

public class NifServicios {
    Scanner leer= new Scanner(System.in);

  //Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la
//letra que le corresponderá. Una vez calculado, le asigna la letra que
//le corresponde según
    private static final char [] letras=  {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'}; 
    
    
    
       public Nif  CrearNif(Nif n) {
        System.out.println("ingrese su numero de DNI");
        long DNI= leer.nextLong();
        n.setDNI(DNI);
        char letra= calcularLetras(DNI);
        n.setLetra(letra);
        return n;
     
        
    }
       public char calcularLetras(long DNI) {
           int resto= (int) (DNI%23);
           return letras[resto];
       }
    
    
       public String mostrar(Nif n) {
        return String.format("%d-%s", n.getDNI(), n.getLetra());
    } 
        
       
    public String toString(Nif n) {
        StringBuilder sb = new StringBuilder();
        sb.append(n.getDNI());sb.append("-");sb.append(n.getLetra());
        return sb.toString();
  

}
}
        
    
