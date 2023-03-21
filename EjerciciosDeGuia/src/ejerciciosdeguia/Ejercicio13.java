/*
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y 
define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
 */
package ejerciciosdeguia;

import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String[] vector = new String[6];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = leer.next();
        }
        for (String vector1 : vector) {
            System.out.println(vector1);
        }
        
    }
    
}
