//En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide 
//toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le 
//pregunta al usuario si quiere crear otro Alumno o no.
//Después de ese bucle tendremos el siguiente método en el servicio de Alumno: 
//Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota 
//final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro 
//del método se usará la lista notas para calcular el promedio final de alumno. Siendo este 
//promedio final, devuelto por el método y mostrado en el main.
package servicio;

import entidad.alumnos;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class AlumnoServicio {
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    alumnos a = new alumnos();
    String res;
    List<alumnos> alumno = new ArrayList();

    public alumnos crearAlumnos() {
        System.out.println("Cuantas notas desea ingresar");
        int can = leer.nextInt();

        do {
            System.out.println("Ingrese nombre del alumno");
            String nombre = leer.next();
            List<Integer> notas = new ArrayList();
            for (int i = 0; i < can; i++) {
                System.out.println("Ingrese nota " + (i + 1) + ":");
                notas.add(leer.nextInt());
            }
            //alumnos a = new alumnos(nombre, notas);
            alumno.add(a);
            System.out.println("Desea ingresar otro alumno (Si/No)");
            res = leer.next();
        } while (res.equalsIgnoreCase("si"));
        
          return a;
    }

    public void imprimirLista() {
        for (alumnos aux : alumno) {
            System.out.println("Nombre: " + aux.getNombre() + ", Notas: " + aux.getNotas());

        }
    }

    public double notaFinal(String nombre) {
        Iterator <alumnos> it = alumnos.iterator();

        while (it.hasNext()) {
            alumnos a = it.next();
            if (a.getNombre().equalsIgnoreCase(nombre)) {
                double suma = 0;
                for (int nota : a.getNotas()) {
                    suma += nota;

                }
                return suma/a.getNotas().size();
            }
            
        }
        return -1;
    }
    
    
}