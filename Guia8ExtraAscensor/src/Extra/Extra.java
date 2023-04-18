/*
 Crea una clase "Ascensor" con las propiedades "pisoActual" y "maximoPisos".
Crea un constructor para inicializar los valores de las propiedades.
Crea un método "subir" que aumente en uno el valor de la propiedad "pisoActual" si aún no se ha alcanzado el "maximoPisos".
Crea un método "bajar" que disminuya en uno el valor de la propiedad "pisoActual" si no se ha alcanzado el piso "0".
Crea un método "irA" que reciba como parámetro el número de piso al que se desea ir y
que modifique la propiedad "pisoActual" para que tenga ese valor.
Crea un programa que cree un objeto "Ascensor" con un "maximoPisos" de 10. Simula el 
comportamiento del ascensor moviéndolo hacia arriba y hacia abajo, 
yendo a un piso específico, y mostrando en pantalla el piso actual después de cada movimiento.
 */
package Extra;

import Entidades.Ascensor;
import Servicio.AscensorServicio;
import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        AscensorServicio prueba = new AscensorServicio();
        Ascensor p1 = prueba.crearAscensor();
        int op;
        do {
            
            System.out.println("Menú");
            System.out.println("1.Subir");
            System.out.println("2.Bajar");
            System.out.println("3.Ir a");
            System.out.println("4.Cerrar puerta");
            op =leer.nextInt();
          switch (op) {
            case 1:
                prueba.subir(p1);
                break;
            case 2:
                prueba.bajar(p1);
                break;
            case 3:                                
                prueba.irA(p1);
                break;
            case 4:
                System.out.println("Gracias por usar el ascensor");
                break;
            default:
                System.out.println("opcion incorrecta");;
        }  
        } while (op!=4);
    }
    
}
