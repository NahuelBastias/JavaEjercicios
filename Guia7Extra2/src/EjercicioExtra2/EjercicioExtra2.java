/*
 Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, 
sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos 
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en los 
atributos del objeto. Después, a través de otro método calcular y devolver la distancia que 
existe entre los dos puntos que existen en la clase Puntos.
 */
package EjercicioExtra2;

import Entidades.Puntos;
import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class EjercicioExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Puntos primero = new Puntos();
        primero.crearPuntos();        
        System.out.println(primero.calcularDistancia());
    }
    
}
