/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Josue
 */
public class Persona {
    private String nombre;
    private int DNI;
    private String nacimiento;

    public Persona() {
    }
    
    public Persona(String nombre, int DNI, String nacimiento) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.nacimiento = nacimiento;
    }   

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public String getNacimiento() {
        return nacimiento;
    }
    
    
}
