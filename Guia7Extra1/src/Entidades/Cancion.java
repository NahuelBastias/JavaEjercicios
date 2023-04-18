/*
 Desarrollar una clase Cancion con los siguientes atributos: título y autor. 
Se deberá́ definir además dos constructores: uno vacío que inicializa el título y 
el autor a cadenas vacías y otro que reciba como parámetros el título y el autor de 
la canción. Se deberán además definir los métodos getters y setters correspondientes.
 */
package Entidades;

/**
 *
 * @author Josue
 */
public class Cancion {
    public String titulo;
    public String autor;

    public Cancion() {
    }

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public void cargarDatos(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }
    
    public void mostrarDatos(String titulo, String autor){
        System.out.println("La canción " + titulo + " del autor " + autor);
        
    }
}
