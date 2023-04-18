/*
 Método getDiscriminante(): devuelve el valor del discriminante (double). El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, el discriminante debe ser mayor o igual que 0.
Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra, el discriminante debe ser igual que 0.
Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles soluciones.
Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. Es en el caso en que se tenga una única solución posible.
Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por pantalla las
posibles soluciones que tiene nuestra ecuación con los métodos obtenerRaices() o obtenerRaiz(), según 
lo que devuelvan nuestros métodos y en caso de no existir solución, se mostrará un mensaje.
Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el signo delante de -b
 */
package Servicios;

import Entidades.Raices;
import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class RaicesServicio {

    private Scanner leer = new Scanner(System.in);

    public Raices crearEcuacion() {
        System.out.println("Ingrese el valor de a,b,c");
        double a = leer.nextDouble();
        double b = leer.nextDouble();
        double c = leer.nextDouble();
        return new Raices(a, b, c);
    }

    public double getDiscriminante(Raices r1) {

        double discriminante = Math.pow(r1.getB(), 2) - 4 * r1.getA() * r1.getC();
        return discriminante;

    }

    public boolean tieneRaices(Raices r1) {
        double discriminante = Math.pow(r1.getB(), 2) - 4 * r1.getA() * r1.getC();
        if (discriminante > 0) {
            return true;

        } else {
            return false;
        }
    }

    public boolean tieneRaiz(Raices r1) {
        double discriminante = Math.pow(r1.getB(), 2) - 4 * r1.getA() * r1.getC();
        if (discriminante == 0) {
            return true;

        } else {
            return false;
        }
    }
    //(-b±√((b^2)-(4*a*c)))/(2*a)
    public void obtenerRaices(Raices r1) {
        double res1 = 0,res2 = 0;
        if (tieneRaices(r1) == true) {            
            res1 = (-r1.getB()+Math.sqrt((Math.pow(r1.getB(), 2) - (4 * r1.getA()) * r1.getC())))/2*r1.getA();
            res2 = (-r1.getB()-Math.sqrt((Math.pow(r1.getB(), 2) - (4 * r1.getA()) * r1.getC())))/2*r1.getA();
            System.out.println("La primera solucion es " + res1);
            System.out.println("La segunda solucion es " + res2);
        }
        //return res1;
        
    }
    
    public double obtenerRaiz(Raices r1){
        double discriminante = Math.pow(r1.getB(), 2) - 4 * r1.getA() * r1.getC();
        double res1=0,res2=0;
        if (tieneRaiz(r1) == true) {
            
            //res1 = (-r1.getB()+Math.sqrt((Math.pow(r1.getB(), 2) - (4 * r1.getA()) * r1.getC())))/2*r1.getA();
            res2 = (-r1.getB()+Math.sqrt((Math.pow(r1.getB(), 2) - (4 * r1.getA()) * r1.getC())))/2*r1.getA();
            
        }else if(discriminante < 0){
            System.out.println("La ecuacion no tiene raices");
        }
        return res1;
    }
    
    public void calcular(Raices r1){
        obtenerRaiz(r1);
    }
}
