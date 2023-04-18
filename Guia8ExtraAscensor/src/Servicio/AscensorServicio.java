/*

Crea un método "subir" que aumente en uno el valor de la propiedad "pisoActual" si aún no se ha alcanzado el "maximoPisos".
Crea un método "bajar" que disminuya en uno el valor de la propiedad "pisoActual" si no se ha alcanzado el piso "0".
Crea un método "irA" que reciba como parámetro el número de piso al que se desea ir y
que modifique la propiedad "pisoActual" para que tenga ese valor.
Crea un programa que cree un objeto "Ascensor" con un "maximoPisos" de 10. Simula el 
comportamiento del ascensor moviéndolo hacia arriba y hacia abajo, 
yendo a un piso específico, y mostrando en pantalla el piso actual después de cada movimiento.
 */
package Servicio;

import Entidades.Ascensor;
import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class AscensorServicio {
    Scanner leer = new Scanner(System.in);
    public Ascensor crearAscensor(){
        System.out.println("Ingrese el piso actual");
        int pA = leer.nextInt();
        System.out.println("Ingrese el piso maximo");
        int pM = leer.nextInt();
        return new Ascensor(pA,pM);
    }
    
    public void subir(Ascensor n1){
        int suma = n1.getPisoActual()+1;        
        if (suma <= n1.getMaximoPisos()) {
            n1.setPisoActual(suma);
            System.out.println("Usted se encuentra en el piso " + n1.getPisoActual());
        }else{
            System.out.println("Llegaste al piso maximo, no se puede seguir subiendo");
        }
        
    }
    
    public void bajar(Ascensor n1){
        int resta = n1.getPisoActual()-1;
        if (resta < 0 ) {
            System.out.println("Esta en planta baja, no se puede seguir bajando");
        }else{
            n1.setPisoActual(resta);
            System.out.println("Ahora se encuentra en el piso " + n1.getPisoActual());
        }
        
    }
    
    public void irA(Ascensor n1){
        System.out.println("A que piso desea ir?");
        int piso = leer.nextInt();
        if (piso < n1.getMaximoPisos() && piso >= 0) {
            System.out.println("Se esta desplazando al piso " + piso);
            n1.setPisoActual(piso);
        }else{
            System.out.println("El piso que desea ir no esta disponible");
        }
    }
    
}
