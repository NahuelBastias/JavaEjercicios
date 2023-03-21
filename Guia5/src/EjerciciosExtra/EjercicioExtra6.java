/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida que el usuario las va ingresando, 
construya una “sopa de letras para niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal 
en una fila que será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras, rellene los espacios no 
utilizados con un número aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java substring(), Length() y Math.random().
 */
package EjerciciosExtra;

import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class EjercicioExtra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String [][] matriz = new String [20][20];
        String[] palabra = new String [5];
        for (int i = 0; i < palabra.length; i++) {
            System.out.println("Ingrese una palabra");
            palabra[i] = leer.next();
            while (palabra[i].length() < 3 || palabra[i].length() > 5){
                    System.out.println("Ingrese una palabra de minimo 3 o 5 digitos");
                    System.out.println("Ingrese palabra");
                    palabra[i] = leer.next();
            }
        }
        int r;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                
            }
        }
    }
    
}
