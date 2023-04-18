/*
Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades con los atributos capacidadMáxima 
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad actual de café que 
hay en la cafetera). Agregar constructor vacío y con parámetros así como setters y getters. Crear clase 
CafeteraServicio en el paquete Servicios con los siguiente:
Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza y simula 
la acción de servir la taza con la capacidad indicada. Si la cantidad actual de café “no alcanza” para llenar 
la taza, se sirve lo que quede. El método le informará al usuario si se llenó o no la taza, y de no haberse 
llenado en cuanto quedó la taza.
Método vaciarCafetera(): pone la cantidad de café actual en cero. 
Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se añade a la 
cafetera la cantidad de café indicada.
 */
package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class CafeteraServicio {

    Cafetera cafe1 = new Cafetera();
    private Scanner leer = new Scanner(System.in);

    public void llenarCafetera() {
        System.out.println("Cual es la capacidad maxima de su cafetera en litros?");
        Double cM = leer.nextDouble();
        cafe1.setCapacidadMaxima(cM);
        System.out.println("Cual es la cantidad actual de cafe?");
        Double cA = leer.nextDouble();
        cafe1.setCantidadActual(cA);

        Double aux = cafe1.getCapacidadMaxima() - cafe1.getCantidadActual();
        System.out.println("Se rellenaran " + aux + " litros");
        aux += cA;
        cafe1.setCantidadActual(aux);
    }

    public void servirTaza() {
        System.out.println("Ingrese el tamaño de la taza en mililitros");
        double taza = leer.nextInt();
        taza = taza / 1000;
        if (taza > cafe1.getCantidadActual()) {
            System.out.println("No hay cafe suficiente para llenar la taza, se rellenara con el cafe disponible");
            taza = cafe1.getCantidadActual();
            System.out.println("La taza se relleno " + (taza*1000) + " mililitros");
        } else {
            double aux;
            aux = cafe1.getCantidadActual();
            aux -= taza;
            cafe1.setCantidadActual(aux);
            System.out.println("Se relleno la taza de cafe, aun quedan " + cafe1.getCantidadActual() + " litros disponibles en la cafetera");
        }
    }
    
    public void vaciarCafetera(){
        System.out.println("Se vaciara la cafetera");
        System.out.println("Se vaciaron " + cafe1.getCantidadActual() + " litros");
        double aux = cafe1.getCantidadActual();        
        aux = aux * 0;
        cafe1.setCantidadActual(aux);        
    }
    
    public void agregarCafe(){
        System.out.println("Cuantos litros desea agregar?");
        double aux = leer.nextDouble();
        cafe1.setCantidadActual(aux);
        System.out.println("Se rellenaron " + cafe1.getCantidadActual());
    }
}
