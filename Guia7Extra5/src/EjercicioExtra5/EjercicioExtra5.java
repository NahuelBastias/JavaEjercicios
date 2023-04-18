/*
 Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". 
Luego, crea un método "retirar_dinero" que permita retirar una cantidad 
de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea 
negativo después de realizar una transacción de retiro.
 */
package EjercicioExtra5;

import Entidades.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class EjercicioExtra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuenta prueba = new Cuenta();
        Scanner leer = new Scanner(System.in);
        String op;
        do {
            System.out.println("Desea retirar dinero? s/n");
            op = leer.next();
            if (op.equalsIgnoreCase("s")) {
                prueba.retirarDinero();
            }else{
                System.out.println("Desea consultar su saldo? s/n");
                op = leer.next();
                if (op.equalsIgnoreCase("s")) {
                    System.out.println("Su saldo es de " + prueba.getSaldo());
                }
            }
                
        } while (op.equalsIgnoreCase("s"));       
        
    }
    
}
