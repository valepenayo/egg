/*Crear una función rellene un vector con números aleatorios,
pasándole un arreglo por parámetro. Después haremos otra función o procedimiento que imprima el vector.
 */
package guia5ejercicio1;

public class Guia5extra3 {

    public static void main(String[] args) {
        int[] vector = new int [4];
        rellenarvector(vector);
        imprimirvector(vector);
          
    }
    public static void rellenarvector(int []vector) {
         
        for (int i = 0; i < vector.length; i++) {
          vector[i] = (int) (Math.random() *9 +1); 
          }
       
    }
      public static void imprimirvector(int []vector) {
       
        for (int i = 0; i < vector.length; i++) {
           System.out.print("[" + vector[i] + "]"); 	 
           System.out.println("");
         
    } 
    }
    
}