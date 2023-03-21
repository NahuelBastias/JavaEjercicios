/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;

import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class Guia3Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num1,num2,opcion;
        boolean bandera = false;
        String op;
        System.out.println("Ingrese dos números");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        do {
            System.out.println("Que desea hacer?");
            System.out.println("1-Sumar");
            System.out.println("2-Restar");
            System.out.println("3-Multiplicar");
            System.out.println("4-Dividir");
            System.out.println("5-Salir");
            opcion = leer.nextInt();
            switch(opcion){ 
                case 1:
                    System.out.println("La suma de los dos numeros es: " + (num1+num2));
                    break;
                case 2:
                    System.out.println("La resta de los dos numeros es: " + (num1-num2));
                    break;
                case 3:
                    System.out.println("La multiplicacion de los dos numeros es: " + (num1*num2));
                    break;
                case 4:
                    System.out.println("La division de los dos numeros es: " + (num1/num2));
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    op = leer.next();
                    if (op.equals("s")) {
                        break;
                    }else{
                        bandera = true;
                    }
                                                         
        }  
        } while (bandera == true);
        
        
             
    }
    
}
