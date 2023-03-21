/*
 Realizar un programa que solo permita introducir solo 
 frases o palabras de 8 de largo. Si el usuario ingresa una frase o palabra 
de 8 de largo se deberá de imprimir un mensaje por pantalla que diga
“CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: 
investigar la función Lenght() en Java.

 */
package ejercicio.pkg3_guia;

import java.util.Scanner;

/**
 *
 * @author nicolas.g
 */
public class Ejercicio3_guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String palabra = input.next();
        
        if(palabra.length()== 8){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
    
}
