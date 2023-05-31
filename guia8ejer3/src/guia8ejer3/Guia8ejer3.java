
package guia8ejer3;

import entidades.persona;
import servicio.PersonasServicio;


public class Guia8ejer3 {

    public static void main(String[] args) {
       persona p= new persona();
       PersonasServicio ps= new PersonasServicio();
      int mayorDeEdad= 0;
       int menorDeEdad=0;
     double bp=0;
       double pn=0;
       double sp=0;
       
       //array
       persona [] vp= new persona[4];
       int []vIMC = new int[4];
       boolean vEdad [] = new boolean[4];
        for (int i = 0; i < 4; i++) {
           
          vp[i]= ps.crearPersona(p);
            vIMC[i]= ps.calcularIMC(p);
            switch (vIMC[i]) {
                case 1:
                    System.out.println("la persona tiene sobrepeso");
                    sp++;
                 break;
                case 2:
                    System.out.println("la persona tiene peso normal");
                    pn++;
                   break;
                default:
                        System.out.println("la persona tiene bajo peso ");
                        bp++;
                        break;
        
    
}
            vEdad[i]= ps.esMayorDeEdad(p);
             if (ps.esMayorDeEdad(p)) {
            mayorDeEdad++;
            } else 
                 menorDeEdad++;
    }
        System.out.println("el promedio de las personas con obecidad son " + sp/0.4  +"%");
        System.out.println("el promedio de las personas con peso normal son " + pn/0.4 + "%");
        System.out.println("el promedio de las personas con bajo peso son " + bp/0.4 + "%");
        
        System.out.println("----------------------------");
        System.out.println("el promedio de los mayores de edad son " + mayorDeEdad);
        System.out.println("el promedio de los menores de edad es " + menorDeEdad);
        
}
}
