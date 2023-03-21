/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class Guia4Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero para saber si es primo");
        int num = leer.nextInt();
        if (detectarPrimo(num)) {
            System.out.println("El numero es PRIMO");
        } else { System.out.println("El numero no es PRIMO"); }
    }
    public static boolean detectarPrimo(int num) {
        boolean primo = false;
        int contador = 0;
        for (int i = 1; i < num + 1; i++) {
            if (num % i == 0) {
            contador++;
            }
        }
        if (contador == 2) {
                primo = true;
        }
        return primo;
    }
}
    

