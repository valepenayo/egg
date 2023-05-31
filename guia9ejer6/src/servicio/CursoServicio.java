
package servicio;

import Entidad.Curso;
import java.util.Scanner;


public class CursoServicio {
    Scanner leer= new Scanner(System.in).useDelimiter("\n");
    Scanner sc= new Scanner(System.in);
    Curso c= new Curso();
// Método cargarAlumnos(): este método le permitirá al usuario ingresar
//los alumnos que asisten a las clases. Nosotros nos encargaremos de
//almacenar esta información en un arreglo e iterar con un bucle,
//solicitando en cada repetición que se ingrese el nombre de cada
//alumno.
    public void cargarAlumnos() {
        String []alumnos= new String[5];
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("ingrese el nombre del alumno " + (i) + ":");
            alumnos[i]= sc.nextLine();
            //c.setAlumnos(alumnos);
      
           
        }
         
           c.setAlumnos(alumnos);
    } 
//   Método crearCurso(): el método crear curso, le pide los valores de
//los atributos al usuario y después se le asignan a sus respectivos
//atributos para llenar el objeto Curso. En este método invocamos al
//método cargarAlumnos() para asignarle valor al atributo alumnos  
    public Curso crearCurso() {
        System.out.println("Ingrese el nombre del curso"); 
        c.setNombreCurso(leer.nextLine());
        System.out.println("Ingrese la cantidad de horas por dia en el curso");
        c.setCantidadHorasPorDia(leer.nextDouble());
        System.out.println("Ingrese la cantidad de dias por semana");
        c.setCantidadDiasPorSemana(leer.nextDouble());
        System.out.println("Ingrese el turno");
        c.setTurno(sc.nextLine());
        System.out.println("Ingrese el precio por hora");
        c.setPrecioPorHora(leer.nextDouble());
        cargarAlumnos();
       
          System.out.println("El nombre del curso es " + c.getNombreCurso() + ", las horas por dia del curso es de " + c.getCantidadHorasPorDia() + ", la cantidad de horas por semana son " + c.getCantidadDiasPorSemana() + ", el precio por hora es de " + c.getPrecioPorHora() + ", ls cantidad de alumnos son " +c.getAlumnos());
          return c;
    }
// Método calcularGananciaSemanal(): este método se encarga de
//calcular la ganancia en una semana por curso. Para ello, se deben
//multiplicar la cantidad de horas por día, el precio por hora, la
//cantidad de alumnos y la cantidad de días a la semana que se repite
//el encuentro.
  public void calcularGananciaSemanal() {
      double cantGananciaSemanal= (c.getCantidadHorasPorDia()*c.getPrecioPorHora()* 5 * c.getCantidadDiasPorSemana());
      System.out.println("La ganancia semanal es " + cantGananciaSemanal);
  }
}
