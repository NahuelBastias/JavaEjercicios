/*
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su equivalente en romano.
 */
package EjerciciosExtra;

import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class EjercicioExtra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num;
        do {
            System.out.println("Ingrese un numero de 1 a 10");
            num = leer.nextInt();
        } while (!(num>=1 && num<=10));
        switch(num){ 
                case 1:
                case 2:
                case 3:    
                    for (int i = 0; i < num; i++) {
                        System.out.print("I"); 
                    }
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("IV");
                    break;
                case 5:
                    System.out.println("V");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.print("V");
                    for (int i = 5; i < num; i++) {
                        System.out.print("I"); 
                    }
                    System.out.println("");
                    break;
                case 9:
                    System.out.println("IX");
                    break;
                case 10:
                    System.out.println("X");
                    break;
        }
    }
    
}
