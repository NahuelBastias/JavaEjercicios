
package ejerciciosdeguia;

import java.util.Scanner;

/**
 * Pedir una frase, terminada en un punto.
 * solo reemplazar cada vocal con un caracter (a = @; e = #; i = $; o = %; u = *);
 * @author Wendy
 */
public class Guia_Ejer11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
         int largo;
         String punto;
         String frase;
           String fin;
        do {
            System.out.println("Ingrese una frase. Finalice con un punto");
            frase = leer.nextLine();
            largo = frase.length();
            punto = ".";
            fin = frase.substring(largo - 1,largo);
        } while(!fin.equals(punto));
        
        String oracion = codificada(frase, largo);
        
        System.out.println(oracion);
  
        
    }
    public static String codificada(String frase, int largo) {
        String oracion = "";
        String letra;
        
        for (int i = 0; i < largo; i++) {
        letra = frase.substring(i, i+1);
        
            switch (letra.toLowerCase()) {
                case "a":
                    oracion+="@";
                    break;
                    case "e":
                    oracion+="#";
                    break;
                    case "i":
                    oracion+="$";
                    break;
                    case "o":
                    oracion+="%";
                    break;
                    case "u":
                    oracion+="*";
                    break;
                    default:
                    oracion+=letra;
            }
        }
        
        return oracion;
    }
    
}
