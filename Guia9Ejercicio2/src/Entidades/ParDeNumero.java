/*
La clase debe tener un constructor vacío, getters y setters.  En el constructor vacío se usará el Math.random para generar los dos números.
 */
package Entidades;

/**
 *
 * @author Josue
 */
public class ParDeNumero {
    private double num1;
    private double num2;

    public ParDeNumero() {
        this.num1 = (double) Math.random()*10;
        this.num2 = (double) Math.random()*10;
    }

    public ParDeNumero(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    
}
