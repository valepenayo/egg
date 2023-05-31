/*Los profesores del curso de programación de Egg necesitan llevar un registro de las notas adquiridas por sus 10 alumnos para 
luego obtener una cantidad de aprobados y desaprobados. Durante el período de cursado cada alumno obtiene 4 notas, 
2 por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo.
Al final del programa los profesores necesitan obtener por pantalla la cantidad de aprobados y desaprobados,
teniendo en cuenta que solo aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso.

 */
package guia5ejercicio1;

import java.util.Scanner;

public class Guia5extra4 {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        float[]vector= new float[2];
        int aprobados=0;
        int desaprobados=0;
        
        for (int i = 0; i < 2; i++) {
            System.out.println("alumno" + (i+1));
            System.out.println("ingrese la nota del primer tp");
            float tp1= leer.nextFloat();
            tp1= tp1*1;
             System.out.println("ingrese la nota del segundo tp");
            float tp2= leer.nextFloat();
            tp2= (float) (tp2*(1.5));
             System.out.println("ingrese la nota del primer integrador");
            float in1= leer.nextFloat();
            in1= (float) (in1*2.5);
             System.out.println("ingrese la nota del segundo integrador");
            float in2= leer.nextFloat();
            in2= in2 *5;
            
            
           float suma = (tp1+tp2+in1+in2);
           vector[i]=suma;
         
           if (vector[i]>=70) {
            aprobados++;
              
        } else {
               
           desaprobados++;
       
    }
    
}
        System.out.println("la cantidad de alumnos aprobados es " + aprobados);
        System.out.println("la cantidad de alumnos desaprobados es " + desaprobados);
    }}