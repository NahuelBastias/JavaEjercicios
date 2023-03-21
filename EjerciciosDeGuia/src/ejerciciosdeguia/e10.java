/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01_ejercicios_java_intro_p1_.generalidades_de_java;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.concat;

/**
 *
 * @author Usuario
 */
public class e10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima
            el número ingresado seguido de tantos asteriscos como indique su valor. Por
            ejemplo:
            5 *****
            3 ***
            11 ***********
            2 ** */
        
        Scanner ingresar = new Scanner(System.in);
        int numero;
        String cadena;
        String cantidadAsteriscos = "";
        String numCadena;
        cadena="*";
        
        for (int i = 0; i < 5; i++) {
            System.out.println("ingrese un numero:");
            numero = ingresar.nextInt();
            for (int j = 0; j < numero; j++) {
                
                cantidadAsteriscos =  cantidadAsteriscos.concat(cadena);
            }
            
            numCadena = String.valueOf(numero);
            
            System.out.println(numCadena+cantidadAsteriscos);
            
        }
        
    }
    
}
