/*
  El programa debe pedir al usuario que adivine el mes secreto. Si el usuario acierta mostrar un mensaje, y si no lo hace, 
 * pedir que vuelva a intentar adivinar el mes secreto.  Un ejemplo de ejecución del programa podría ser este:
 */
package Service;

import Entidades.Mes;
import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class MesService {
    Scanner leer = new Scanner(System.in);
    
    
    public void adivinarMes(String res, Mes c1){
        
        while (!res.equals(c1.getMesSecreto())) {
            System.out.println("No adivinaste, intentale de nuevo");
            res = leer.next();
            
        }        
        System.out.println("Adivinaste el mes secreto felicidades");
    }
}
