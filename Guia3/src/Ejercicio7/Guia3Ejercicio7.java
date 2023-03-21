/*
 Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de dispositivo lee cadenas 
enviadas por el usuario. Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres 
de largo, el primer carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial “&&&&&” marca el final de los 
envíos (llamémosla FDE), y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas.
Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().
 */
package Ejercicio7;

import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class Guia3Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String palabra;
        int cont1,cont2,longitud;
        cont1 = 0;
        cont2 = 0;
        
        do {
            System.out.println("Ingrese una cadena");
            palabra = leer.next();
            longitud = palabra.length();
            if (palabra.length() <= 5) {
                if (palabra.substring(0, 1).equalsIgnoreCase("X") && (palabra.substring(longitud-1,longitud).equalsIgnoreCase("O"))) {
                cont1++;
            }else{
                cont2++;
            }
            }else{
                cont2++;
            }
            
        } while (!palabra.equals("&&&&&"));
        System.out.println("La cantidad de lecturas correctas fue de: " + cont1);
        System.out.println("La cantidad de lecturas incorrectas fue de: " + (cont2 - 1));
    }
    
}
