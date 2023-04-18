/*
 Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con la palabra del usuario, pone la longitud 
 * de la palabra, como la longitud del vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
 * palabra en un índice del vector. Y también, guarda la cantidad de jugadas máximas y el valor que ingresó el usuario.
 * Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: buscar como se usa el vector.length.
 * Método buscar(letra):  este método recibe una letra dada por el usuario y busca si la letra ingresada es parte de la palabra o no. 
 * También informará si la letra estaba o no.
 * Método encontradas(letra):  que reciba una letra ingresada por el usuario y muestre cuantas letras han sido encontradas y cuántas le faltan. 
 * Este método además deberá devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se busque una letra que no esté, 
 * se le restará uno a sus oportunidades.
 * Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
 * Método juego(): el método juego se encargará de llamar todos los métodos previamente mencionados e informará cuando el usuario descubra toda 
 * la palabra o se quede sin intentos. Este método se llamará en el main.
 */
package Service;

import Entidades.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class AhorcadoService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Ahorcado crearJuego(){
        System.out.println("Ingrese la palabra");
        String palabra = leer.next();        
        System.out.println("Cuantos intentos desea dar?");
        int intentos = leer.nextInt();
        
        return new Ahorcado(palabra.toCharArray(),0,intentos);
    }
    
    public void longitud(Ahorcado c1){
        System.out.println("La palabra tiene " + c1.getPalabra().length + " caracteres");        
    }
    
    public boolean buscarLetra(Ahorcado c1,char letra){
        boolean b = false;
        int c = 0;
        while (!b && c < c1.getPalabra().length) {
            if (c1.getPalabra()[c] == letra) {
                b = true;
            }else{
                c++;
            }
        }
        
        if (b) {
            System.out.println("La letra esta en la palabra");
        }else{
            System.out.println("La letra no esta en la palabra");
        }
        return b;
    }
    
    public void encontradas(Ahorcado c1,char letra){
        boolean b = buscarLetra(c1,letra);
        if (b) {
            for (int i = 0; i < c1.getPalabra().length; i++) {                
                if (c1.getPalabra()[i]==letra) {
                    c1.getGuiones()[i] = letra;
                    c1.setLetras(c1.getLetras()+1);
                }
            }
        }else{
            c1.setIntentos(c1.getIntentos()-1);
        }      
               
    }
    
    public void intentos(Ahorcado c1){
        System.out.println("A usted le quedan " + c1.getIntentos() + " intentos");
    }
    
    public void juego(){
        Ahorcado p1 = crearJuego();
        
        do {
            System.out.println("Ingrese una letra");
            String letra = leer.next();
            longitud(p1);
            encontradas(p1,letra.charAt(0));
            intentos(p1);           
            System.out.println(Arrays.toString(p1.getGuiones()));
        } while (p1.getIntentos() > 0 && p1.getLetras() < p1.getPalabra().length);
        
        if (p1.getIntentos() == 0) {
            System.out.println("La palabra era " + Arrays.toString(p1.getPalabra())+ " no adivinaste :c");
        }else{
            System.out.println("Adivinaste la palabra, ¡Felicidades!");
        }
    }
}
