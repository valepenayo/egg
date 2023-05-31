/*Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida que el usuario las va ingresando, 
construya una “sopa de letras para niños” de tamaño de 20 x 20 caracteres. 
Las palabras se ubicarán todas en orden horizontal en una fila que será seleccionada de manera aleatoria. 
Una vez concluida la ubicación de las palabras, rellene los espacios no utilizados con un número aleatorio del 0 al 9. 
Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java substring(), Length() y Math.random().
 */
package guia5ejercicio1;

import java.util.Scanner;

public class Guia5extra6 {

   public static void main(String[] args){
        
            Scanner sc = new Scanner (System.in);
            //declaramos la matriz
    String[][] matriz = new String [20][20];
    int cont =0;
         for (int i = 0; i < 5 ; i++) {
             cont=0;
        System.out.println("ingrese 5 palabras para la sopa de letras");
        String palabra = sc.nextLine();
        while(palabra.length()<3 || palabra.length() > 5){
            System.out.println("palabra incorrecta, ingrese una palabra ");
                palabra = sc.nextLine();
            
        }//si no hay nada en las filas que llene el espacio con nros random
        int filas = (int) (Math.random()* matriz.length);
        while (matriz [filas][0]!= null){
            filas = (int) (Math.random()*20);
        }//utiliza los contadores para ir ubicando las palabras
        int columnas =(int) (Math.random ()* 14); 
             for (int j = columnas; j <(columnas+ palabra.length()); j++) {
                 matriz[filas][j] = palabra.toUpperCase().substring(cont, cont+1);
                 cont++;
             }
             cont=0;
             
            for (int j = 0; j < matriz.length; j++) { 
                if (matriz[filas][j]==null) {
                    matriz[filas][j]= String.valueOf((int)(Math.random()*9+1));
                    //convierte los numeros en una cadena String para poder rellenar los espacios vacios
                }
            }
         }
         for (int i = 0; i < matriz.length; i++) {
             for (int j = 0; j < matriz.length; j++) {
                 if (matriz[i][j]==null ) {
                     matriz[i][j]= String.valueOf((int)(Math.random()*9+1));
                 }//convierte los numeros en una cadena String para poder rellenar los espacios vacios
             }}
         //mostrar matriz
         for (int i = 0; i < matriz.length; i++) {
             for (int j = 0; j < matriz.length; j++) {
                 System.out.print(matriz[i][j]+"  ");
             }
             System.out.println("");
        }
    }
    
}