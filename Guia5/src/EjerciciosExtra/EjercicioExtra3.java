/*
Crear una función rellene un vector con números aleatorios, 
pasándole un arreglo por parámetro. Después haremos otra función o procedimiento que imprima el vector.
 */
package EjerciciosExtra;

import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class EjercicioExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la dimension del vector");
        int n = leer.nextInt();
        int[] vector = new int[n];
        llenarVector(vector);
        mostrarVector(vector);
    }
    public static void llenarVector(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            vector[i] =(int) Math.floor(Math.random()*10);
            
        }       
    
}
    public static void mostrarVector(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.print("["+vector[i]+"]");
        }
    }
}
