/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtra;

import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class EjercicioExtra7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Cantidad de numeros de la sucesion de Fibonacci;");
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int[] vector = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            if (i <= 2) {
                vector[i] = 1;
            } else {
                vector[i] = vector[i - 2] + vector[i - 1];
            }
        }

        for (int i = 1; i <= n; i++) {
            System.out.print("[" + vector[i] + "] ");
        }
    }
}


