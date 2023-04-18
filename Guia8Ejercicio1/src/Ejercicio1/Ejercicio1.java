/*
 Realizar una clase llamada CuentaBancaria en el paquete Entidades con los siguientes atributos: 
numeroCuenta(entero), dniCliente(entero largo), saldoActual. Agregar constructor vacío, con parámetros, getters y setters.
Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
Método para crear cuenta pidiéndole los datos al usuario.
Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. Si la cuenta 
no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
Método consultarDatos: permitirá mostrar todos los datos de la cuenta.

 */
package Ejercicio1;

import Servicios.CuentaBancariaServicio;
import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        CuentaBancariaServicio ctaS = new CuentaBancariaServicio();
        boolean menu;
        menu = true;

        int seleccion;
        do {
            System.out.println("Bienvenido al Banco República Argentina");
            System.out.println("1. Complete sus datos");
            System.out.println("2. Depositar");
            System.out.println("3. Extraer");
            System.out.println("4. Retiro Express");
            System.out.println("5. Vea sus datos");
            System.out.println("6. Salir");
            seleccion = leer.nextInt();
            switch (seleccion) {
                case 1:
                    ctaS.crearCuenta();
                    break;
                case 2:
                    ctaS.ingresar();
                    break;
                case 3:
                    ctaS.retirar();
                    break;
                case 4:
                    ctaS.extraccionRapida();
                    break;
                case 5:
                    ctaS.consultarDatos();
                    break;
                case 6:
                    System.out.println("Desea realmente salir ? S/N");
                    String sale = leer.next().toLowerCase();
                    if ("s".equals(sale)) {
                        System.out.println("Hasta luego!");
                        menu = false;
                    }
                    break;
                default:
                    System.out.println("Opción inválida, ponele onda hermano");
            }

        } while (menu);
    }
    
}
