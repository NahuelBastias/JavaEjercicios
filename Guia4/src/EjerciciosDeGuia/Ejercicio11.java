/*
 Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada en punto, y luego codifique la palabra o 
frase ingresada de la siguiente manera: cada vocal se reemplaza por el carácter que se indica en la tabla y el resto de los caracteres 
(incluyendo a las vocales acentuadas) se mantienen sin cambios.
a e i o u
@ # $ % *
Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación correspondiente. 
Utilice la estructura “según” para la transformación.

 */
package EjerciciosDeGuia;

import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una frase");
        String frase = leer.next();
        int longitud = frase.length();
        System.out.println(convertirFrase(frase, longitud));
    }

    public static String convertirFrase(String frase, int longitud) {
        String fraseConvertida;
        fraseConvertida = "";
        String letra;
        for (int i = 0; i < longitud; i++) {
            letra = frase.substring(i, i+1);
            switch (letra.toLowerCase()) {               
                case "a":    
                    fraseConvertida += "@";
                    break;
                case "e":
                    fraseConvertida += "#";
                    break;
                case "i":
                    fraseConvertida += "$";
                    break;
                case "o":
                    fraseConvertida += "%";
                    break;
                case "u":
                    fraseConvertida += "*";
                    break;
                default:
                    fraseConvertida += letra;                  
        }
        }
        return fraseConvertida;
    }

}
