//Crear una clase CadenaServicio en el
//paquete servicios que implemente los siguientes métodos:

package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

public class CadenaServicios {
    Scanner leer= new Scanner(System.in);
    Scanner sc= new Scanner(System.in);
//    Método mostrarVocales(), deberá contabilizar la cantidad de vocales
//que tiene la frase ingresada.
    public int mostrarVocales(Cadena c) {
        System.out.println("ingrese la frase");
        String frase= leer.nextLine().toLowerCase();
        c.setFrase(frase);
        int cont= 0;
        for (int i = 0; i < frase.length(); i++) {
          char letra= frase.charAt(i);
          if (letra== 'a'||letra== 'e'||letra== 'i'||letra== 'o'||letra== 'u') {
            cont++;  
          }
        }
        System.out.println("La cant de vocales en la frase " + c.getFrase()+" son " + cont);
        return cont;
    }
    
//b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla
//por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb
//asac".
    public void invertirFrase(Cadena c) {
        String fraseInv= "";
        for (int i = c.getFrase().length()-1; i >=0; i--) {
            fraseInv+= c.getFrase().charAt(i);
        }
        System.out.println("la cadena original es " + c.getFrase());
        System.out.println("La cadena invertida es " + fraseInv);
    }
    
//c) Método vecesRepetido(String letra), recibirá un carácter ingresado
//por el usuario y contabilizar cuántas veces se repite el carácter en la
//frase, por ejemplo:
//d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4
//veces.
         public int vecesRepetido(Cadena c) {
        System.out.println("ingrese la letra a buscar ");
         char letra= leer.next().charAt(0);
        
        int cont= 0;
        for (int i = 0; i < c.getFrase().length(); i++) {
          if (c.getFrase().charAt(i)== letra) {
              
            cont++;  
          }
        }
        System.out.println("La cant de letras en la frase " + c.getFrase() +" a buscar es " + cont);
        return cont;
    }
    
//e) Método compararLongitud(String frase), deberá comparar la longitud
//de la frase que compone la clase con otra nueva frase ingresada por
//el usuario.
         
         public void compararLongitud(Cadena c) {
             System.out.println("ingrese una frase nueva");
             String frase2= sc.nextLine();
             if (c.getLongitud()==frase2.length()) {
                 System.out.println(" La frase " + c.getFrase() +" y la frase " + frase2 + " tienen la misma longitud");
                 System.out.println("La longitud de ambas es " + c.getLongitud());
             }else
                  System.out.println(" La frase " + c.getFrase() +" y la frase " + frase2 + " no tienen la misma longitud");
             System.out.println("La longitud del 1ro es: " + c.getLongitud() + " y la de la 2da frase es " + frase2.length());
         }
//f) Método unirFrases(String frase), deberá unir la frase contenida en la
//clase Cadena con una nueva frase ingresada por el usuario y mostrar
//la frase resultante.
        public void unirFrase(Cadena c) {
             System.out.println("ingrese una frase nueva");
             String frase3= sc.nextLine();
             System.out.println("la nueva frase es: " + c.getFrase() + "--" + frase3);
        }
         
//g) Método reemplazar(String letra), deberá reemplazar todas las letras
//“a” que se encuentren en la frase, por algún otro carácter
        public void reemplazar(Cadena c) {
            System.out.println("ingrese la letra a reemplazar");
            String letra= sc.nextLine();
            System.out.println("introduzca un caracter para reemplazar");
            String car= sc.nextLine();
            String nuevaFrase= c.getFrase().replace(letra, car);
            System.out.println("la frase nueva es " + nuevaFrase);
            
        }
          
        
//seleccionado por el usuario y mostrar la frase resultante.
//h) Método contiene(String letra), deberá comprobar si la frase contiene
//una letra que ingresa el usuario y devuelve verdadero si la contiene y
//falso si no.
   public boolean contiene(Cadena c) {
       System.out.println("ingrese una letra a comprobar");
       String letra= leer.next();
     return c.getFrase().contains(letra);
       
}
}