/*
 Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos los
métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene sobrepeso 
o está por debajo de su peso ideal e indicar para cada objeto si la persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en distintas 
variables(arrays), para después calcular un porcentaje de esas 4 personas cuantas están por debajo 
de su peso, cuantas en su peso ideal y cuantos, por encima, y también calcularemos un porcentaje de 
cuantos son mayores de edad y cuantos menores. Para esto, podemos crear unos métodos adicionales.

 */
package Ejercicio3;

import Entidades.Persona;
import Servicios.PersonaServicio;

/**
 *
 * @author Josue
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersonaServicio op1 = new PersonaServicio();
        Persona per1 = op1.crearPersona();
        Persona per2 = op1.crearPersona();
        Persona per3 = op1.crearPersona();
        Persona per4 = op1.crearPersona();

        //op1.esMayorDeEdad(per1);
        op1.calcularIMC(per1);
        //op1.esMayorDeEdad(per2);
        op1.calcularIMC(per2);
        //op1.esMayorDeEdad(per3);
        op1.calcularIMC(per3);
        //op1.esMayorDeEdad(per4);
        op1.calcularIMC(per4);

        int[] vecIMC = new int[4];

        vecIMC[0] = op1.calcularIMC(per1);
        vecIMC[1] = op1.calcularIMC(per2);
        vecIMC[2] = op1.calcularIMC(per3);
        vecIMC[3] = op1.calcularIMC(per4);

        double por1 = 0, por2 = 0, por3 = 0;
        for (int i = 0; i < vecIMC.length; i++) {
            switch (vecIMC[i]) {
                case -1:
                    por1++;
                    break;
                case 0:
                    por2++;
                    break;
                case 1:
                    por3++;
                    break;
                default:
                    break;
            }
        }
        
        System.out.println("El porcentaje de personas por debajo del imc es:" + (por1 / 4) * 100 + "%");
        System.out.println("El porcentaje de personas con un imc ideal es:" + (por2 / 4) * 100 + "%");
        System.out.println("El porcentaje de personas por encima del imc es:" + (por3 / 4) * 100 + "%");

        boolean[] vecEdad = new boolean[4];
        vecEdad[0] = op1.esMayorDeEdad(per1);
        vecEdad[1] = op1.esMayorDeEdad(per2);
        vecEdad[2] = op1.esMayorDeEdad(per3);
        vecEdad[3] = op1.esMayorDeEdad(per4);
        int porc1 = 0, porc2 = 0;
        for (int i = 0; i < vecEdad.length; i++) {
            System.out.println(vecEdad[i]);
            if (vecEdad[i] == true) {
                porc1++;
            } else {
                porc2++;
            }
        }
        System.out.println("El porcentaje de personas mayor de edad es: " + (porc1 / 4) * 100 + "%");
        System.out.println("El porcentaje de personas menor de edad es: " + (porc2 / 4) * 100 + "%");
    }
}
