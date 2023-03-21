/*
Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que represente el costo del tratamiento (previo al descuento)
y determine el importe en efectivo a pagar por dicho socio.
*/
package EjerciciosExtra;

import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class EjercicioExtra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Que clase de socio es?");
        String socio = leer.next();
        System.out.println("Ingrese el costo del tratamiento");
        int costo = leer.nextInt();
        switch(socio){
            case "a":
                System.out.println("El monto a pagar es de: " + (costo*0.5));
                break;
            case "b":
                System.out.println("El monto a pagar es de: " + (costo*0.35));
                break;
            case "c":
                System.out.println("El monto a pagar es de: " + costo);
                break;
        }
    }
    
}
