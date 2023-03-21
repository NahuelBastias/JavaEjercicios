/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class Guia2Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        int num1;
        System.out.println("Ingresa dos numeros");
        num = leer.nextInt();
        num1 = leer.nextInt();
        System.out.println("La suma de los dos numeros es de: " + (num+num1));
    }
    
}
