/*
 Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por debajo de 1.60 mts.
    y el promedio de estaturas en general.
 */
package EjerciciosExtra;

import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class EjercicioExtra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Cuantas personas se mediran?");
        int personas = leer.nextInt();
        int c;
        float promedio,promedioG,altura;
        c = 0;
        promedio = 0;
        promedioG = 0;
        for (int i = 1; i <= personas; i++) {
            System.out.println("Cuanto mide la " + i + "?");
            altura = leer.nextFloat();
            promedioG = promedioG + altura;
            if (altura < 1.60) {
                promedio = promedio + altura;
                c++;
            }
        }
        System.out.println("El promedio de personas que miden menos a 1.60 es de:" + (promedio/c));
        System.out.println("El promedio general de altura es de:" + (promedioG/personas));
    }
    
}
