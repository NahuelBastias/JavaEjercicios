/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author Josue
 */
public class Guia2Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Scanner lectura = new Scanner(System.in);
        //.useDelimiter("\n"): sirve para leer la linea
        //.nextLine(): lee toda la frase
        Scanner lectura = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese una frase");
        String frase;
        frase = lectura.next();
        System.out.println(toUpperCase(frase));
        System.out.println(toLowerCase(frase));
    }
    
}
