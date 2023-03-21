/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
