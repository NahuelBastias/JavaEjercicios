/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

import Entidades.Persona;
import Service.PersonaService;

/**
 *
 * @author Josue
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad = 18;
        Persona p = PersonaService.crearPersona();
        System.out.println("Edad: " + PersonaService.calcularEdad(p));
        System.out.println("Es menor a "+ edad + "?" + PersonaService.menorQue(p, edad));
        PersonaService.mostrarPersona(p);
    }
    
}
