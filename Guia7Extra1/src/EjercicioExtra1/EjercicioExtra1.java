/*
Desarrollar una clase Cancion con los siguientes atributos: título y autor. 
Se deberá́ definir además dos constructores: uno vacío que inicializa el título y 
el autor a cadenas vacías y otro que reciba como parámetros el título y el autor de 
la canción. Se deberán además definir los métodos getters y setters correspondientes.
 */
package EjercicioExtra1;

import Entidades.Cancion;
import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class EjercicioExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Cancion primero = new Cancion();
        System.out.println("Escriba el titulo de la canción");
        String titulo = leer.nextLine();
        System.out.println("Escriba el autor de la canción");
        String autor = leer.nextLine();
        primero.cargarDatos(titulo,autor);
        primero.mostrarDatos(titulo, autor);
    }
    
}
