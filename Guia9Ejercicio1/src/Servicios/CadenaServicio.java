/*
Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la frase, 
por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase con otra nueva frase ingresada por el usuario.
Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase ingresada por el usuario y mostrar la frase 
resultante.
Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, por algún otro carácter seleccionado por el
usuario y mostrar la frase resultante.
Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class CadenaServicio {

    public int mostrarVocales(Cadena c1) {
        int contadorVocales = 0;
        String vocales = "aeiouAEIOU";
        for (int i = 0; i < c1.getLongitud(); i++) {
            char c = c1.getFrase().charAt(i);
            if (vocales.indexOf(c) != -1) {
                contadorVocales++;
            }
        }
        return contadorVocales;
    }

    public String invertirFrase(Cadena c1) {
        String fraseCon ="";
        for (int i = c1.getLongitud()-1; i >= 0; i--) {            
            fraseCon += c1.getFrase().substring(i, i+1);
        }
        return fraseCon;
    }
    
    public int vecesRepetido(Cadena c1){
        Scanner leer = new Scanner(System.in);
        System.out.println("Que letra desea buscar? ");
        String letra = leer.next();
        
        return 10;
    }
}
