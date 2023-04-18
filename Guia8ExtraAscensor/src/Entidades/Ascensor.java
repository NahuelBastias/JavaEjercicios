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
public class Ascensor {
    private int pisoActual;
    private int maximoPisos;

    public Ascensor() {
    }

    public Ascensor(int pisoActual, int maximoPisos) {
        this.pisoActual = pisoActual;
        this.maximoPisos = maximoPisos;
    }

    public int getPisoActual() {
        return pisoActual;
    }

    public void setPisoActual(int pisoActual) {
        this.pisoActual = pisoActual;
    }

    public int getMaximoPisos() {
        return maximoPisos;
    }

    public void setMaximoPisos(int maximoPisos) {
        this.maximoPisos = maximoPisos;
    }
    
}
