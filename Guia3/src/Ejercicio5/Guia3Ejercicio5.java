/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class Guia3Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num,suma,limite;
        suma = 0;
        System.out.println("Ingrese un numero");
        limite = leer.nextInt();
        do {
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            suma = suma + num;
        } while (suma < limite);
        
    }
    
}
