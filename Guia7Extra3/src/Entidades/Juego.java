/*
 Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores 
jugar un juego de adivinanza de números. El primer jugador elige un número y el segundo 
jugador intenta adivinarlo. El segundo jugador tiene un número limitado de intentos y recibe 
una pista de "más alto" o "más bajo" después de cada intento. El juego termina cuando el 
segundo jugador adivina el número o se queda sin intentos. Registra el número de intentos 
necesarios para adivinar el número y el número de veces que cada jugador ha ganado..
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class Juego {

    public int jugador1, jugador2;
    public int cI, c1, c2;

    public Juego() {
    }

    public Juego(int jugador1, int jugador2, int cI, int c1, int c2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.cI = cI;
        this.c1 = c1;
        this.c2 = c2;
    }

    public int getJugador1() {
        return jugador1;
    }

    public void setJugador1(int jugador1) {
        this.jugador1 = jugador1;
    }

    public int getJugador2() {
        return jugador2;
    }

    public void setJugador2(int jugador2) {
        this.jugador2 = jugador2;
    }

    public int getcI() {
        return cI;
    }

    public void setcI(int cI) {
        this.cI = cI;
    }

    public int getC1() {
        return c1;
    }

    public void setC1(int c1) {
        this.c1 = c1;
    }

    public int getC2() {
        return c2;
    }

    public void setC2(int c2) {
        this.c2 = c2;
    }

    public void iniciar_juego() {
        Scanner leer = new Scanner(System.in);
        cI = 0;        
        System.out.println("Ingrese un numero secreto");        
        jugador1 = leer.nextInt();
        do {
            System.out.println("Adivine el numero que ingreso el jugador 1");
            jugador2 = leer.nextInt();
            if (jugador2 != jugador1) {
                cI++;
                if (jugador2 < jugador1) {
                    System.out.println("El numero es mas alto");
                } else if (jugador2 > jugador1) {
                    System.out.println("El numero es mas bajo");
                }
            }
            if (jugador2 == jugador1) {
                c2++;
                break;
            }

            if (cI == 3) {
                c1++;
                System.out.println("Se realizaron " + cI + " intentos, perdio :c");
                break;
            }

        } while (jugador2 != jugador1);

        

    }
}
