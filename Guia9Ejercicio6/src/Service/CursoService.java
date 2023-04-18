/*
 Método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos que asisten a las clases. Nosotros nos encargaremos 
de almacenar esta información en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el nombre de cada alumno.
Método crearCurso(): el método crear curso, le pide los valores de los atributos al usuario y después se le asignan a sus respectivos
atributos para llenar el objeto Curso. En este método invocamos al método cargarAlumnos() para asignarle valor al atributo alumnos
Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia en una semana por curso. Para ello, se deben multiplicar 
la cantidad de horas por día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que se repite el encuentro.
 */
package Service;

import Entidades.Curso;
import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class CursoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public String[] cargarAlumnos() {
        String[] alumnos = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del alumno");
            alumnos[i] = leer.next();
        }
        return alumnos;
    }

    public Curso crearCurso() {
        System.out.println("Ingrese el nombre del curso");
        String curso = leer.next();
        System.out.println("Cuantas horas se cursa?");
        int horas = leer.nextInt();
        System.out.println("Cuantos dias cursa?");
        int dias = leer.nextInt();
        System.out.println("En que turno?");
        String turno = leer.next();
        System.out.println("Cuanto cobra por hora?");
        float cobro = leer.nextFloat();
        String[] alumnos = new String[5];
        alumnos = cargarAlumnos();
        
        return new Curso(curso, horas, dias, turno, cobro, alumnos);
    }
    
    public void calcularGanancia(Curso c1){
        System.out.println("La ganancia semanal es de $" + c1.getCantidadHoras()*c1.getDias()*c1.getAlumnos().length*c1.getPrecioHora());
        
    }
}
