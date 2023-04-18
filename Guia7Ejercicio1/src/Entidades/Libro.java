/*
 Crear una clase llamada Libro que contenga los siguientes atributos: 
ISBN, Título, Autor, Número de páginas, y un constructor con todos los 
atributos pasados por parámetro y un constructor vacío. Crear un método 
para cargar un libro pidiendo los datos al usuario y luego informar mediante 
otro método el número de ISBN, el título, el autor del libro y el número de páginas.
 */
package Entidades;

/**
 *
 * @author Josue
 */
public class Libro {

    public int ISBN;
    public String titulo;
    public String autor;
    public int paginas;

    public Libro() {
    }

    public Libro(int ISBN, String titulo, String autor, int paginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;

    }

    public void cargarDatos(String autor, String titulo, int ISBN, int paginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void mostrarDatos() {
        System.out.println("El autor es " + autor + "\nEl titulo del libro es " + titulo + "\nEl ISBN del libro es " + ISBN
                + "\nEl numero de paginas es " + paginas);
    }

}
