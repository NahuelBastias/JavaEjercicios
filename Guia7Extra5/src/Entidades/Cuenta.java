/*
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". 
Luego, crea un método "retirar_dinero" que permita retirar una cantidad 
de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea 
negativo después de realizar una transacción de retiro.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class Cuenta {
    Scanner leer = new Scanner(System.in);
    private int saldo;
    private String titular;

    public Cuenta() {
    }

    public Cuenta(int saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public int retirarDinero(){
        saldo = 100000;
        System.out.println("Cual es la cantidad que desea retirar?");
        int retiro = leer.nextInt();
        saldo -= retiro;
        if (retiro > saldo) {
            System.out.println("El retiro exede el monto en su cuenta");            
        }else{
            System.out.println("Usted retiro " + retiro);
        System.out.println("Su saldo restante es de " + saldo);
        }        
        return saldo;
    }
}
