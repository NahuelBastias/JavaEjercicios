/*
 Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, 
sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos 
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en los 
atributos del objeto. Después, a través de otro método calcular y devolver la distancia que 
existe entre los dos puntos que existen en la clase Puntos.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class Puntos {
    Scanner leer = new Scanner(System.in);
    
    private int x1,x2,y1,y2;
    

    public Puntos() {
    }    

    public int getX1() {
        return x1;
    }

    public Puntos(int p1, int p2, int x1, int x2, int y1, int y2) {        
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }
    
    public void crearPuntos(){        
        System.out.println("Ingrese el X del primer punto");
        this.x1 = leer.nextInt();
        System.out.println("Ingrese el Y del primer punto");
        this.y1=leer.nextInt();        
        System.out.println("Ingrese el X del segundo punto");
        this.x2 = leer.nextInt();
        System.out.println("Ingrese el Y del segundo punto");
        this.y2=leer.nextInt();        
    }
    
    public double calcularDistancia(){        
        double distancia;
        distancia = Math.sqrt((Math.pow(x2-x1,2)) + (Math.pow(y2-y1,2)));
        
        return distancia;
    }
}
