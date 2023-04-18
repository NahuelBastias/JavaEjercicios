/*
 Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. 
 A continuación, se deben crear los siguientes métodos:
 a)Método constructor que inicialice el radio pasado como parámetro.
 b)Métodos get y set para el atributo radio de la clase Circunferencia.
 c)Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
 d)Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
 e)Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

 */
package Ejercicio2;

import Entidades.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circunferencia num = new Circunferencia();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        double radio;
        System.out.println("Ingrese el radio");
        radio = leer.nextFloat();
        num.crearCircunferencia(radio);
        //num.area();
        //num.perimetro();
        System.out.println("El radio que ingreso es " + radio + "\n" + "El area del radio es de " + num.area() + "\n" + "El perimetro del radio es "
                + "de " + num.perimetro());
    }
    
}
