/*
 Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y
un atributo privado altura. La clase incluirá un método para crear el rectángulo con los datos 
del Rectángulo dados por el usuario. También incluirá un método para calcular la superficie del rectángulo 
y un método para calcular el perímetro del rectángulo. Por último, tendremos un método que dibujará el rectángulo
mediante asteriscos usando la base y la altura. Se deberán además definir los métodos getters, setters y constructores 
correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package Ejercicio4;

import Entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangulo primero = new Rectangulo();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la base del rectangulo");
        int base = leer.nextInt();
        System.out.println("Ingrese la altura del rectangulo");
        int altura = leer.nextInt();
        primero.cargarDatos(base,altura);
        primero.Superficie();
        primero.Perimetro();
        primero.Dibujar();
    }
    
}
