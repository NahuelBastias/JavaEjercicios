/*
 Realice un programa que compruebe si una matriz dada es antisimétrica. 
Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, pero cambiada de signo. 
Es decir, A es antisimétrica si A = -AT. La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando 
sus filas por columnas (o viceversa).

 */
package Ejercicio5;

/**
 *
 * @author Josue
 */
public class Guia5Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matriz = new int[3][3];

        int[][] matrizA = new int[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {               
            matriz[i][j] = -10 + (int) (Math.random() * ((10 - (-10)) + 1));
//            -10 + (int) (Math.random() * ((10 - (-10)) + 1))
            //Math.random()*19-9
            }
        }
//        for (int j = 0; j < 3; j++) {
//            for (int i = 0; i < 3; i++) {               
//                matrizA[i][j] = matriz[i][j];
//            }            
//        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {               
                System.out.print(matriz[i][j]);
                System.out.print("  ");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {               
                System.out.print(matriz[i][j]);
                System.out.print("  ");
            }
            System.out.println("");
        }
        boolean aux = true;        
                
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] != -matriz[j][i]){
                    aux = false;
                    break;
                }
            }
        }
        if (aux) {
            System.out.println("Su matriz es antisimetrica");
        }else{
            System.out.println("Su matriz no es antisimetrica");
        }
        
    }
    
}
