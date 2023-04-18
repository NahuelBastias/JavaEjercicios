/*
 a)Método constructor que inicialice el radio pasado como parámetro.
 b)Métodos get y set para el atributo radio de la clase Circunferencia.
 c)Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
 d)Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
 e)Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
 */
package Entidades;

/**
 *
 * @author Josue
 */
public class Circunferencia {
    
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public Circunferencia() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(double radio){
        this.radio = radio;        
    }
    public double area(){
        double area;
        area = Math.pow(Math.PI*radio,2);
        area = Math.round((area)*1000.0d)/1000.0d;
        return area;
    }
    public double perimetro(){
        double perimetro;
        perimetro = 2*Math.PI*radio;
        perimetro = Math.round((perimetro)*1000.0d)/1000.0d;
        //se puede poner el sout aca y dejar la funcion en void
        return perimetro;
    }
}

