/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg03;

import java.util.Scanner;

/**
 *
 * @author nicolas.g
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         System.out.println("Ingrese la nota del alumno");
       int nota;
       nota = input.nextInt();
       
       while(nota <0 || nota >10){
           
           System.out.println("El valor ingresado no es el correcto, "
                   + "por favor ingreselo nuevamente");
           nota = input.nextInt();
           
       }
    }
    
}
