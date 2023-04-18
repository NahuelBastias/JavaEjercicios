/*
Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y 
un método "calcular_area" que calcule y devuelva el área del rectángulo. 
Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados de
4 y 6 y imprime el área del rectángulo.
 */
package EjercicioExtra7;

import Entidades.Rectangulo;

/**
 *
 * @author Josue
 */
public class EjercicioExtra7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangulo rectangulo1 = new Rectangulo();
        int lado1 = 4;
        int lado2 = 6;
        System.out.println("El area del rectangulo es " + rectangulo1.calcularArea(lado1,lado2));
    }

}
