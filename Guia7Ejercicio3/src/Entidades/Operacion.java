/*
 a)Método constructor con todos los atributos pasados por parámetro.
 b)Método constructor sin los atributos pasados por parámetro.
 c)Métodos get y set.
 d)Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
 e)Método sumar(): calcular la suma de los números y devolver el resultado al main.
 f)Método restar(): calcular la resta de los números y devolver el resultado al main
 g)Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera a multiplicar por cero, 
 el método devuelve 0 y se le informa al usuario el error. Si no, se hace la multiplicación y se devuelve el resultado al main
 h)Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división por cero, 
 el método devuelve 0 y se le informa al usuario el error se le informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
 */
package Entidades;

/**
 *
 * @author Josue
 */
public class Operacion {
    private int numero1,numero2;

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public void crearOperacion(int num, int num2){
        this.numero1 = num;
        this.numero2 = num2;
    }
    public void Sumar(){
        int suma = numero1 + numero2;
        System.out.println("El resultado de la suma es " + suma);
    }
    public void Restar(){
        int resta = numero1 - numero2;
        System.out.println("El resultado de la resta es " + resta);
    }
    public void Multiplicacion(){
        int multi;
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("El resultado es 0 ");
        }else{
            multi = numero1 * numero2;
            System.out.println("El resultado de la multiplicacion es " + multi);
        }
    }
    public void Divicion(){
        double divi;
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("El resultado es 0 ");
        }else{
            divi = numero1/numero2;
            System.out.println("El resultado de la divicion es " + divi);
        }
    }
}
