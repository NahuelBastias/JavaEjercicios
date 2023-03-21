/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercio.pkg02_guia;

import java.util.Scanner;

/**
 *
 * @author nicolas.g
 */
public class Ejercio02_guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String palabra = input.next();
         
        if(palabra.equals("eureka")){
             System.out.println("Correcto");
        }else{
             System.out.println("Incorrecto");
         }
         
    }
    
}
