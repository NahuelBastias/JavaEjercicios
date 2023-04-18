/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class PersonaServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        System.out.println("Ingrese su nombre");
        String nombre = leer.next();
        System.out.println("Ingrese su edad");
        int edad = leer.nextInt();

        System.out.println("Ingrese sexo(‘H’ para hombre, ‘M’ para mujer, ‘O’ para otro)");
        String sexo = leer.next();
        if (!sexo.equalsIgnoreCase("h") && !sexo.equalsIgnoreCase("m") && !sexo.equalsIgnoreCase("o")) {
            System.out.println("Error, recuerde que las letras validas son h,m,o");
        }
        System.out.println("Ingrese su peso");
        double peso = leer.nextDouble();
        System.out.println("Ingrese su altura");
        double altura = leer.nextDouble();

        return new Persona(nombre, edad, sexo, peso, altura);

    }

    public boolean esMayorDeEdad(Persona p1) {
        boolean comp = false;
        if (p1.getEdad() >= 18) {
            return true;

        } else {
            return false;
        }

    }

    public int calcularIMC(Persona p1) {

        if (p1.getPeso() / (Math.pow(p1.getAltura(), 2)) < 20) {

            return -1;

        } else if (p1.getPeso() / (Math.pow(p1.getAltura(), 2)) > 25) {
            return 1;

        } else {
            return 0;
        }
    }
}
