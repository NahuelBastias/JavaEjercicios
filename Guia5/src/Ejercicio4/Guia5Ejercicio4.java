/*
 Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la traspuesta de la matriz. 
La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package Ejercicio4;

/**
 *
 * @author Josue
 */
public class Guia5Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matriz = new int [4][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {               
            matriz[i][j] = (int) Math.floor(Math.random()*10);
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {               
                System.out.print(matriz[i][j]);
                System.out.print("  ");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {               
                System.out.print(matriz[i][j]);
                System.out.print("  ");
            }
            System.out.println("");
        }
    }
    
}
