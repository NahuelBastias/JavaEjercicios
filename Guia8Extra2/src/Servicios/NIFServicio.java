/*
En NIFService
se dispondrá de los siguientes métodos:
Métodos getters y setters para el número de DNI y la letra.
Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le corresponderá. Una vez calculado, 
le asigna la letra que le corresponde según
Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra en mayúscula; por ejemplo: 00395469-F).
La letra correspondiente al dígito verificador se calculará a traves de un método que funciona de la siguiente manera: 
Para calcular la letra se toma el resto de dividir el número de DNI por 23 (el resultado debe ser un número entre 0 y 22).
El método debe buscar en un array (vector) de caracteres la posición que corresponda al resto de la división para obtener 
la letra correspondiente. La tabla de caracteres es la siguiente:
 */
package Servicios;

import Entidades.NIF;
import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class NIFServicio {
    char vec1[] = {'T', 'R', 'W', 'A', 'G','M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    Scanner leer = new Scanner(System.in);

    public void crearNif(NIF dni) {
        double res;
        int num;

        System.out.println("ingrese su numero de DNI sin puntos");
        dni.setDNI(leer.nextLong());
        res = dni.getDNI() % 23;

        //convertir a entero
        num = (int) res;

        //setear letra segun vector
        dni.setCar(vec1[num]);

    }

    public void mostrar(NIF dni) {
        System.out.println("el NIF es: " + dni.getDNI() + "-" + dni.getCar());

    }
}
