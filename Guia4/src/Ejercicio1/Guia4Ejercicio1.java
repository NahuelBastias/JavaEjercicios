/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar, multiplicar y dividir. 
La aplicación debe tener una función para cada operación matemática y deben devolver sus resultados para imprimirlos en el main. 
 */
package Ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class Guia4Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros");
        int num1 = leer.nextInt(), num2 = leer.nextInt();
        mostrarMenu();
        int op = leer.nextInt();
        switch (op) {
            case 1:
                System.out.println("El resultado de la suma es: " + suma(num1, num2));
                break;
            case 2:
                System.out.println("El resultado de la resta es: " + resta(num1, num2));
                break;
            case 3:
                System.out.println("El resultado de la multiplicacion es: " + multi(num1, num2));
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("No se puede dividir por 0");
                }else{
                System.out.println("El resultado de la division es: " + divi(num1, num2));
                }
                break;
        }
        leer.close();
    }

    public static int suma(int num1, int num2) {
        return num1 + num2;
    }

    public static int resta(int num1, int num2) {
        return num1 - num2;
    }

    public static int multi(int num1, int num2) {
        return num1 * num2;
    }

    public static float divi(float num1, float num2) {
        float cociente = Math.round((num1/num2) * 100.0f)/100.0f;
        return cociente;
    }

    public static void mostrarMenu() {
        System.out.println("Que desea hacer?");
        System.out.println("1- Sumar");
        System.out.println("2- Restar");
        System.out.println("3- Multiplicar");
        System.out.println("4- Dividir");
    }

}
