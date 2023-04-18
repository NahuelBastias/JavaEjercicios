/*
 Crear una clase Ahorcado (como el juego), la cual deberá contener como atributos, un vector con la palabra a 
 * buscar, la cantidad de letras encontradas y la cantidad jugadas máximas que puede realizar el usuario
 */
package Entidades;

/**
 *
 * @author Josue
 */
public class Ahorcado {
    private char[] palabra;
    private char[] guiones;
    private int letras;
    private int intentos;

    public Ahorcado() {
    }

    public Ahorcado(char[] palabra, int letras, int intentos) {        
        this.palabra = palabra;
        this.guiones = new char [palabra.length];
        for (int i = 0; i < palabra.length; i++) {
            guiones[i] = '-';
        }
        this.letras = letras;
        this.intentos = intentos;
    }

    public char[] getGuiones() {
        return guiones;
    }

    public void setGuiones(char[] guiones) {
        this.guiones = guiones;
    }

    public char[] getPalabra() {
        return palabra;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    public int getLetras() {
        return letras;
    }

    public void setLetras(int letras) {
        this.letras = letras;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }
    
}
