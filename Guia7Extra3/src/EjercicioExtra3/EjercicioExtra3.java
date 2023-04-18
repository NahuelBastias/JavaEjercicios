/*
 Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores 
jugar un juego de adivinanza de números. El primer jugador elige un número y el segundo 
jugador intenta adivinarlo. El segundo jugador tiene un número limitado de intentos y recibe 
una pista de "más alto" o "más bajo" después de cada intento. El juego termina cuando el 
segundo jugador adivina el número o se queda sin intentos. Registra el número de intentos 
necesarios para adivinar el número y el número de veces que cada jugador ha ganado..
 */
package EjercicioExtra3;

import Entidades.Juego;
import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class EjercicioExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Juego prueba = new Juego();
        Scanner leer = new Scanner(System.in);
        String op;
        do {
            prueba.iniciar_juego();
            System.out.println("Desea seguir jugando s/n");
            op = leer.next();
        } while (op.equalsIgnoreCase("s"));
        
        System.out.println("El jugador 1 gano: " + prueba.c1 + " veces");
        System.out.println("El jugador 2 gano: " + prueba.c2 + " veces");
    }
    
}
