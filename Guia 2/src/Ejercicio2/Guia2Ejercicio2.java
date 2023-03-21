/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class Guia2Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lectura = new Scanner(System.in);
        System.out.print("Hola, ¿Cual es tu nombre?");
        String nombre;
        nombre = lectura.next();
        System.out.println("¡Un placer!, " + nombre);
    }
    
}
