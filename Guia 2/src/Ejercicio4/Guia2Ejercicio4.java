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
public class Guia2Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en C°");
        int temperatura;
        temperatura = leer.nextInt();
        temperatura = 32 + (9 * temperatura / 5);
        System.out.println("La temperatura en F° es: " + temperatura + "°");
    }
    
}
