/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class FechaService {
    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");
     
    public static Date fechaNacimiento(){
         int dia, mes, anio;
         System.out.println("Ingrese el día: ");
         dia = leer.nextInt();
         System.out.println("Ingrese el mes: ");
         mes = leer.nextInt();
         System.out.println("Ingrese el año: ");
         anio = leer.nextInt();
         
         return new Date(anio,mes,dia);
         
     }
    
    public static Date fechaActual(){
        return new Date();
    }
    
    public static int diferencia(Date nac, Date act){
        int diferencia;
        diferencia = act.getYear()-nac.getYear();
        if (act.getMonth()<nac.getMonth()){
            diferencia--;
        }else if (act.getMonth()==nac.getMonth()){
            if (act.getDay()<nac.getDay()){
                diferencia--;
            }
        }
        
        
        return diferencia;
    }
}
