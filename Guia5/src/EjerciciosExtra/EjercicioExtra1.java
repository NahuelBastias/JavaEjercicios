/*
 Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N, 
con los valores ingresados por el usuario.

 */
package EjerciciosExtra;

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
        System.out.println("Ingrese la dimension del vector");
        int num = leer.nextInt();
        int[] vector = new int [num];
        int suma=0;
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese el numero para la posicion " + i);
            vector[i] = leer.nextInt();
            suma+=vector[i];
        }
        System.out.println("El resultado de la suma es: " + suma);
    }
    
}
