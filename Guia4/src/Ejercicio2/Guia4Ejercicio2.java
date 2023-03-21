/*
 Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas ingresadas 
por teclado e indique si son mayores o menores de edad. Después de cada persona, el programa debe preguntarle 
al usuario si quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
package Ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class Guia4Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Indique la cantidad de personas a ingresar");
        int num = leer.nextInt();
        String nombre;
        String opcion;
        int edad;
        for (int i = 0; i < num; i++) {
            System.out.println("Ingrese el nombre");
            nombre = leer.next();
            System.out.println("Ingrese la edad");
            edad = leer.nextInt();
            System.out.println(nombre + " " + edad);
            if (edad < 18) {
                System.out.println("Es menor de edad");
            }else{
                System.out.println("Es mayor de edad");
            }
            System.out.println("Desea continuar con el ingreso?");
            opcion = leer.next();
            if (opcion.equals("no")) {
                break;
            }
        }
    }
    
}
