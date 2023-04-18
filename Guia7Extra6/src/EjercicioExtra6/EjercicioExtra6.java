/*
 Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario". 
Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un empleado 
en función de su edad y salario actual. El aumento salarial debe ser del 10% si el empleado 
tiene más de 30 años o del 5% si tiene menos de 30 años.
 */
package EjercicioExtra6;

import Entidades.Empleado;
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
        Empleado uno = new Empleado();
        Scanner leer = new Scanner(System.in);
        String op;
        do {
            System.out.println("Desea consultar el aumento de un empleado? s/n");
            op = leer.next();
            if (op.equalsIgnoreCase("s")) {
                System.out.println("El aumento es de " + uno.calcularAumento());
            }

        } while (op.equalsIgnoreCase("s"));
    }

}
