/*
 Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario". 
Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un empleado 
en función de su edad y salario actual. El aumento salarial debe ser del 10% si el empleado 
tiene más de 30 años o del 5% si tiene menos de 30 años.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class Empleado {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private String nombre;
    private int edad;
    private int salario;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, int salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    public int calcularAumento(){
        int aumento = 0;        
        System.out.println("Ingrese el nombre del empleado");
        this.nombre = leer.next();
        System.out.println("Ingrese la edad");
        this.edad = leer.nextInt();
        System.out.println("Ingrese el salario");
        this.salario = leer.nextInt();
        if (edad > 30) {
            aumento += salario*0.10;
        }else{
            aumento += salario*0.05;
        }
        
        return aumento;
}
}
