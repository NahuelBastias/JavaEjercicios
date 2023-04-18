/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class PersonaService {
    public static Persona crearPersona() {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el nombre: ");
        String nombre = leer.next();
        System.out.println("Ingrese día de nacimiento: ");
        int dia = leer.nextInt();
        System.out.println("Ingrese mes de nacimiento: ");
        int mes = leer.nextInt();
        System.out.println("Ingrese año de nacimiento: ");
        int anio = leer.nextInt();
        Date fechaNac = new Date(anio, mes, dia);

        return new Persona(nombre, fechaNac);
    }

    public static int calcularEdad(Persona p) {
        int diferencia;
        Date act = new Date();
        diferencia = act.getYear() - p.getFechaNac().getYear();
        if (act.getMonth() < p.getFechaNac().getMonth()) {
            diferencia--;
        } else if (act.getMonth() == p.getFechaNac().getMonth()) {
            if (act.getDay() < p.getFechaNac().getDay()) {
                diferencia--;
            }
        }
        return diferencia;
    }

    public static boolean menorQue(Persona p, int edad) {

        if (PersonaService.calcularEdad(p) < edad) {
            return true;
        } else {
            return false;
        }

    }

    public static void mostrarPersona(Persona p) {
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Fecha de nacimiento: " + p.getFechaNac().getDate()+ "/" + p.getFechaNac().getMonth() + "/" + p.getFechaNac().getYear());
    }
}
