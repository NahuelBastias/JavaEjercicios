/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Josue
 */
public class NIF {
    private long DNI;
    private char car;

    public NIF() {
    }

    public NIF(long DNI, char car) {
        this.DNI = DNI;
        this.car = car;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public char getCar() {
        return car;
    }

    public void setCar(char car) {
        this.car = car;
    }
    
}
