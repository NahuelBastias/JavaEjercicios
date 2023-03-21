/*
 Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el usuario ingresa 1600 minutos, 
 el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package EjerciciosExtra;

import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class EjercicioExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de minutos");
        int min,horas,dias;
        min = leer.nextInt();
        horas = min/60;
        dias = horas/24;
        horas = horas%24;
        System.out.println("La cantidad de minutos en dias es: " + dias + " y " + horas + " horas.");
    }
    
}
