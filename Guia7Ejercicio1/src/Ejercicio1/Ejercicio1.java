/*
 Crear una clase llamada Libro que contenga los siguientes atributos: 
ISBN, Título, Autor, Número de páginas, y un constructor con todos los 
atributos pasados por parámetro y un constructor vacío. Crear un método 
para cargar un libro pidiendo los datos al usuario y luego informar mediante 
otro método el número de ISBN, el título, el autor del libro y el número de páginas.
 */
package Ejercicio1;

import Entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Libro primero = new Libro();
        System.out.println("Ingrese el ISBN del libro");
        int ISBN = leer.nextInt();

        System.out.println("Ingrese el titulo");
        String titulo = leer.next();

        System.out.println("Ingrese el autor");
        String autor = leer.next();

        System.out.println("Ingrese el numero de paginas");
        int paginas = leer.nextInt();

        primero.cargarDatos(autor, titulo, ISBN, paginas);
        primero.mostrarDatos();
    }

}
