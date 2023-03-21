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
public class NewMain1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String[][] sopa = new String[20][20];
        String[] palabra = new String[5];
        int[] fila = new int[5];
        int colum;

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                sopa[i][j] = "";
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese palabra N°" + (i + 1) + " de entre 3 y 5 caractares");
            do {
                palabra[i] = input.nextLine();
                palabra[i] = palabra[i].toUpperCase();
            } while (palabra[i].length() < 3 || palabra[i].length() > 5);
        }
        for (int i = 0; i < 5; i++) {
            do {
                fila[i] = (int) (Math.random() * 20);
            } while (fila.equals(fila[i]));
            colum = (int) (Math.random() * 20);
            if (colum > 19 - palabra[i].length()) {
                colum = (int) (Math.random() * 20) - palabra[i].length();
            }
            for (int j = 0; j < palabra[i].length(); j++) {
                sopa[fila[i]][colum + j] = palabra[i].substring(j, j + 1);
            }
        }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (sopa[i][j].equals("")) {
                    sopa[i][j] = String.valueOf((int) (Math.random() * 10));
                }
                System.out.print(sopa[i][j] + " | ");
            }
            System.out.println("");
        }
    }
}  
    

