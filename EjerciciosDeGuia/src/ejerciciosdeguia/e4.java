/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02_ejercicios_java.intro.p2_.estructuras.de.control;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class e4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Escriba un programa que pida una frase o palabra y valide si la primera
            letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de
            imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
            contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función
            Substring y equals() de Java.
            2
            Bucles y sentencias de salto break y continue*/
        System.out.println("Escribir frase");
        Scanner ingresar = new Scanner(System.in);
        String frase;
        frase = ingresar.next() ;
        if(frase.startsWith("a")){
            System.out.println("correcta");
        }else{
            
            System.out.println("incorrecta");
        }
        
        
    }
    
}
