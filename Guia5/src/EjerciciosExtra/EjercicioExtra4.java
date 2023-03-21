/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        double[][] alumnos = new double[10][4];
        double suma;
        int aprobado = 0;
        int desaprobado = 0;
        for (int i = 0; i < 10; i++) {
            suma = 0;
            System.out.println("Ingrese la nota del " + (i + 1) + " alumno");
            for (int j = 0; j < 4; j++) {
                switch (j) {
                    case 0:
                        System.out.println("Ingrese la nota del primer trabajo practico");
                        alumnos[i][j] = leer.nextDouble();
                        suma += alumnos[i][j] * 0.10;
                        break;
                    case 1:
                        System.out.println("Ingrese la nota del segundo trabajo practico");
                        alumnos[i][j] = leer.nextDouble();
                        suma += alumnos[i][j] * 0.15;
                        break;
                    case 2:
                        System.out.println("Ingrese la nota del primer integrador");
                        alumnos[i][j] = leer.nextDouble();
                        suma += alumnos[i][j] * 0.25;
                        break;
                    case 3:
                        System.out.println("Ingrese la nota del segundo integrador");
                        alumnos[i][j] = leer.nextDouble();
                        suma += alumnos[i][j] * 0.50;
                        break;

                }
            }
            if (suma >= 7) {
                aprobado++;
            } else {
                desaprobado++;
            }
        }
        System.out.println("La cantidad de aprobados es " + aprobado);
        System.out.println("La cantidad de desaprobados es " + desaprobado);
        mostrarMatriz(alumnos);
    }

    public static void mostrarMatriz(double[][] alumnos) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + alumnos[i][j] + "]");
            }
            System.out.println("");
        }
    }
}
    

