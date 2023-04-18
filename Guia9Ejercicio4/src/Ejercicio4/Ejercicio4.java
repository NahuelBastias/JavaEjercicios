/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

import Servicios.FechaService;
import java.util.Date;

/**
 *
 * @author Josue
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Date fecha = FechaService.fechaNacimiento();
        System.out.println(fecha);
        Date fechaAct = FechaService.fechaActual();
        System.out.println(fechaAct);
        System.out.println("la edad es: "+FechaService.diferencia(fecha, fechaAct));
    }
    
}
