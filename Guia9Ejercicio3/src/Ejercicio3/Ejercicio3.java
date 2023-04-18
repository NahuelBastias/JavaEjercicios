/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import Servicios.ArregloService;

/**
 *
 * @author Josue
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here    
        double[] A = new double[50];
        double[] B = new double[20];

        ArregloService servicio = new ArregloService();
        servicio.inicializarA(A);
        servicio.mostrar(A);
        servicio.ordenar(A);
        servicio.mostrar(A);

        //servicio.ordenarYMostrar(A);
        //servicio.convirtiendoYOrdenando(A);
        //servicio.convirtiendoYOrdenando2(A);
        servicio.inicialiarB(A, B);
        servicio.mostrar(B);
    }
}
