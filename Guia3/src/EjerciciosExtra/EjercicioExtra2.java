/*
 Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una.
A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B.
Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package EjerciciosExtra;

/**
 *
 * @author Josue
 */
public class EjercicioExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int A,B,C,D,aux;
        A = 5;
        B = 2;
        C = 7;
        D = 1;
        System.out.println("Los valores iniciales de A:" + A + " B:" + B + " C:" + C + " D:" + D);
        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;
        System.out.println("Los valores cambiados de A:" + A + " B:" + B + " C:" + C + " D:" + D);    
    }
    
}
