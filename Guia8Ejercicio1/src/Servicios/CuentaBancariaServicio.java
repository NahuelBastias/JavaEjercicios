/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class CuentaBancariaServicio {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    CuentaBancaria cta = new CuentaBancaria();

    public void crearCuenta() {

        System.out.println("Por favor introduzca su Número de cuenta: ");
        int nc = leer.nextInt();
        cta.setNumeroCuenta(nc);
        System.out.println("Por favor introduzca su DNI: ");
        long dni = leer.nextLong();
        cta.setDniCliente(dni);
        System.out.println("Por favor introduzca su Saldo Actual: ");
        double sa = leer.nextDouble();
        cta.setSaldoActual(sa);

        // return new CuentaBancaria(nc, dni, sa);
        
    }

    public double ingresar() {
        System.out.println("Por favor introduzca la cantidad a depositar");
        double ingreso = leer.nextDouble();
        double saldo = cta.getSaldoActual();
        saldo += ingreso;
        cta.setSaldoActual(saldo);
        return cta.getSaldoActual();
    }

    public double retirar() {
        System.out.println("Por favor introduzca la cantidad a retirar");
        double egreso = leer.nextDouble();
        double saldo = cta.getSaldoActual();

        if (saldo > egreso) {
            cta.setSaldoActual(saldo - egreso);
            return saldo;
        } else {
            cta.setSaldoActual(0);
            System.out.println("Ustéd retiró:\n $" + saldo + " Dólares");
            return saldo;
        }

    }

    public void extraccionRapida() {
        double saldo = cta.getSaldoActual();
        System.out.println("Introduzca un monto a retirar express.\nRecuerde que utilizando este método ustéd solo podrá extraer hasta un 20% de su saldo.\nActualmente su saldo es de: $" + saldo + " y lo máximo que puede retirar ahora mismo es: " + saldo * 0.2 + " Dólares");
        System.out.println("Introduzca el monto a retirar: ");
        double retiro = leer.nextDouble();
        if (retiro > saldo * 0.2) {
            System.out.println("Su extracción excede el máximo permitido para este tipo de operación");
        } else {
            cta.setSaldoActual(saldo - retiro);
            System.out.println("Gracias! su saldo actual es de: " + cta.getSaldoActual());
        }
    }

    public void consultarSaldo() {
        System.out.println("Su saldo actual es de: ");
        System.out.println(cta.getSaldoActual());
    }

    public void consultarDatos() {
        System.out.println("Sus datos son:");
        System.out.println(cta);
    }
}
