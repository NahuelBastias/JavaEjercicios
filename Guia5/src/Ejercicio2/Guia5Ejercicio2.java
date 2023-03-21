/*
 Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y le pida al usuario un 
número a buscar en el vector. El programa mostrará dónde se encuentra el numero y si se encuentra repetido

 */
package Ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class Guia5Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int num = leer.nextInt();
        int[]vector = new int[num];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) Math.floor(Math.random()*10);
        }
        System.out.println("Ingrese el numero a buscar");
        num = leer.nextInt();
        int aux = 0;
        for (int i = 0; i < vector.length; i++) {
            if (num == vector[i]) {
                 aux++;
                 System.out.println("Su numero se encuentra en la posicion " + i);

            }
           
        }
        System.out.println("Su numero se encontro " + aux + " ves");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]);
        }
        System.out.println("");
        
    }
    
}
