/*
 Crea una clase "Cocina" que tenga una lista de objetos "Receta". Luego, 
crea métodos para agregar nuevas recetas a la lista, para buscar una receta 
por nombre y para obtener la lista de recetas que se pueden preparar con los 
ingredientes disponibles en la cocina.
 */
package EjercicioExtra4;

import Entidades.Cocina;
import Entidades.Receta;
import java.util.Scanner;



/**
 *
 * @author Josue
 */
public class EjercicioExtra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Cocina prueba = new Cocina();
        Receta asd = new Receta();
        prueba.cargarReceta();
        System.out.println("Que receta desea buscar?");
        String op = leer.next();
        switch (op) {
            case "Bizcochuelo":
                System.out.println("Los ingredientes que necesita son " );
                for (int i = 0; i < 3; i++) {
                    System.out.println();
                }
                break;
            case "Cafe con leche":
                break;
            case "Fideos con tuco":
                break;
            }
            
    }

}
