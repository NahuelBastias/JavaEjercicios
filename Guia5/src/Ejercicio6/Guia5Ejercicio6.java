/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas, 
sus columnas y sus diagonales son idénticas. Crear un programa que permita introducir un cuadrado por teclado y 
determine si este cuadrado es mágico o no. El programa deberá comprobar que los números introducidos son correctos, 
es decir, están entre el 1 y el 9.
 */
package Ejercicio6;

import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class Guia5Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        //Rellenando matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Introduzca el valor de la matriz para la posición: " + i + ";" + j);
                int num = leer.nextInt();
                matriz[i][j] = num;
                //Condicional del 1 al 9
                while (num < 1 || num > 9) {
                    System.out.println("Ingrese un número del 1 al 9");
                    num = leer.nextInt();
                    matriz[i][j] = num;
                }
            }
        }
        //Imprimiendo la matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        //Suma de comparación
        int sumaFila = 0, sumaColumna = 0, c = 0, sumaDiagonal = 0, sumaDiagonal2 = 0;
        boolean b = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sumaFila += matriz[i][j];
                sumaColumna += matriz[j][i];
                if (i == j) {
                    sumaDiagonal += matriz[i][j];
                }
                if (i == 2 && j == 0 || i == 1 && j == 1 || i == 0 && j == 2) {
                    sumaDiagonal2 += matriz[i][j];
                }
                if (sumaFila == sumaColumna && (sumaFila / 3) == sumaDiagonal && (sumaColumna / 3) == sumaDiagonal) {
                    if ((sumaFila/3)==sumaDiagonal2 && (sumaColumna/3)==sumaDiagonal2) {
                    b = true;
                    if (b) {
                        System.out.println("Es magico!");
                    } else {
                        System.out.println("No es magico");
                    }
                    }
                    
                }
            }

        }
        System.out.println(sumaFila);
        System.out.println(sumaColumna);
        System.out.println(sumaDiagonal);
        System.out.println(sumaDiagonal2);
    }
} 
    
    

