/*
 Realizar una clase llamada ParDeNumeros que tenga como atributos dos números reales con los cuales se realizarán diferentes operaciones matemáticas. 
La clase debe tener un constructor vacío, getters y setters.  En el constructor vacío se usará el Math.random para generar los dos números. 
Crear una clase ParDeNumerosService, en el paquete Servicios, que deberá además implementar los siguientes métodos:
Método mostrarValores que muestra cuáles son los dos números guardados.
Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número. Previamente se deben redondear ambos valores.
Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. Antes de calcular la raíz cuadrada se debe obtener el valor absoluto
del número.

 */
package Ejercicio2;

import Servicio.ParDeNumeroService;
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
         Scanner leer = new Scanner(System.in);
        
        ParDeNumeroService servi = new ParDeNumeroService();
        
        System.out.println("-------------------------------Bienvenido-------------------------");
        
        boolean salir = true;
        int opc;
        
        do{
            
            System.out.println("1. Mostrar valores \n"
                    + "2. Devolver mayor \n"
                    + "3. Calcular potencia \n"
                    + "4. Calcular raiz \n"
                    + "5. Salir");
            
            opc = leer.nextInt();
            
            switch (opc){
                case 1:
                    servi.mostrarValores();
                    break;
                case 2:
                    System.out.println("El mayor es: " + servi.devolverMayor());
                    break;
                case 3:
                    servi.calcularPotencia();
                    break;
                case 4 : 
                    servi.calcularRaiz();
                    break;
                case 5: 
                    salir = false;
                    break;
                default:
                    System.out.println("El dato ingresado no se encuentra");
                    break;
            }
            
        }while(salir);
    }
    
}
