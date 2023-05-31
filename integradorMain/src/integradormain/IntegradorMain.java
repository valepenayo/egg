/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integradormain;

import entidad.Estudiante;
import java.util.Scanner;

/**
 *
 * @author vale
 */
public class IntegradorMain {

    public static void main(String[] args) {
         Scanner leer=new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la cantidad de estudiantes a relevar: ");
        int cant=leer.nextInt();
        
               
    Estudiante  estudiante []= new Estudiante[cant]; // Creamos Vector Estudiantes
    
        for (int i = 0; i < estudiante.length; i++) {
            System.out.println("Ingrese nombre estudiante: ");
            String nombre=leer.next();
            System.out.println("Ingrese la nota del estudiante: ");
            Double nota=leer.nextDouble();
            estudiante[i]=new Estudiante(nombre,nota);
        }
        
        // Calcular y mostrar el promedio de notas de todo el curso
        double sumaNotas=0;
        for (int i = 0; i < estudiante.length; i++) {
            sumaNotas+= estudiante[i].getNota();
        }
        double promedioNotas=sumaNotas/estudiante.length;
        System.out.println("El promedio de las Notas es: "+promedioNotas);
        
        
        // calcula cuantos alumnos superaron el promedio de notas
        int cont=0;
        for (int i = 0; i < estudiante.length; i++) {
            if(estudiante[i].getNota()>promedioNotas){
                cont++;
        }
        }
        String nombreEstudiantes [] =new String[cont]; // Vector estudiantes
        cont=0;
            for (int i = 0; i < estudiante.length; i++) {
            if(estudiante[i].getNota()>promedioNotas){
                nombreEstudiantes[cont]=estudiante[i].getNombre();
                cont++;
            }
        }
           // Opcion1 : for normal 
           // for (int i = 0; i < nombreEstudiantes.length; i++) {
           // System.out.println("El estudiante => "+nombreEstudiantes[i]+" supera el promedio ");
           // ----------------------------------------------------------------------------------------
  
           // Opcion2 : for mejorado
            for (String nombre : nombreEstudiantes) {
            System.out.println("El estudiante => "+nombre+" , supera el promedio.");
           } 
            
}
}
 
    
    

