/**
 * Crea una clase en Java donde declares una variable de tipo array de Strings que contenga los doce meses del año, en minúsculas.
 * A continuación, declara una variable mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo, mesSecreto =
 * mes[9]. El programa debe pedir al usuario que adivine el mes secreto. Si el usuario acierta mostrar un mensaje, y si no lo hace, 
 * pedir que vuelva a intentar adivinar el mes secreto.  Un ejemplo de ejecución del programa podría ser este:
 * Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
 * No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
 * ¡Ha acertado!
 *
 */
package Extra1;

import Entidades.Mes;
import Service.MesService;
import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class Extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        MesService p1 = new MesService();
        Mes c1 = new Mes();
        
        System.out.println("Adivina el mes secreto!");
        String res = leer.next();
        p1.adivinarMes(res,c1);
    }

}
