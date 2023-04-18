/*
 Método mostrarValores que muestra cuáles son los dos números guardados.
Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número. Previamente se deben redondear ambos valores.
Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. Antes de calcular la raíz cuadrada se debe obtener el valor absoluto
del número.

 */
package Servicio;

import Entidades.ParDeNumero;
import static jdk.nashorn.internal.objects.NativeMath.sqrt;

/**
 *
 * @author Josue
 */
public class ParDeNumeroService {

    ParDeNumero p1 = new ParDeNumero();

    public void mostrarValores() {
        System.out.println("El numero 1 es " + p1.getNum1() + "El numero 2 es " + p1.getNum2());
    }

    public double devolverMayor() {
        double aux;
        if (p1.getNum1() > p1.getNum2()) {
            aux = p1.getNum1();
        } else {
            aux = p1.getNum2();
        }

        return aux;
    }

    public void calcularPotencia() {
        int aux1, aux2;

        aux1 = (int) Math.round(p1.getNum1());
        aux2 = (int) Math.round(p1.getNum2());

        if (aux1 > aux2) {
            System.out.println("El resultado de la potencia de " + aux1 + aux2);
            System.out.println("Es " + Math.pow(aux1, aux2));
        } else {
            System.out.println("El resultado de la potencia de " + aux2 + aux1);
            System.out.println("Es " + Math.pow(aux2, aux1));
        }
    }

    public void calcularRaiz() {

        int aux;

        if (p1.getNum1() > p1.getNum2()) {

            aux = (int) Math.sqrt(p1.getNum1());
            System.out.println("La raiz cuadrada de " + p1.getNum1() + " es: " + aux);

        } else {

            aux = (int) Math.sqrt(p1.getNum2());
            System.out.println("La raiz cuadrada de " + p1.getNum2() + " es: " + aux);
        }
    }
}
