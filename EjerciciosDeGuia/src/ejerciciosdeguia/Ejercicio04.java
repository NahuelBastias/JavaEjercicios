/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg04;

import java.util.Scanner;

/**
 *
 * @author nicolas.g
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int num;
         int contador = 0;
         int contadorCiclo = 0;
         
         do {
             System.out.println("Ingrese un numero");
             num = input.nextInt();
             
             if (num >0){
                    contador = contador + num;
             }else if(num == 0){
                 System.out.println("Se capturó el numero 0");
                 break;                 
             }
               System.out.println(contador);           
             contadorCiclo++;
             
             
         }while(contadorCiclo <=20);
    } 
    
}
