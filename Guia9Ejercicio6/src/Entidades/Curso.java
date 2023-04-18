/*
 nombreCurso, cantidadHorasPorDia,
cantidadDiasPorSemana, turno (mañana o tarde),  precioPorHora y alumnos. Donde alumnos es un arreglo de tipo String de dimensión 
5 (cinco), donde se alojarán los nombres de cada alumno. A continuación, se implementarán los siguientes métodos:
Un constructor por defecto.
Un constructor con todos los atributos como parámetro.
Métodos getters y setters de cada atributo.
 */
package Entidades;

/**
 *
 * @author Josue
 */
public class Curso {
    private String nombreCurso;
    private float cantidadHoras;
    private int dias;
    private String turno;
    private float precioHora;
    private String[] alumnos = new String [5];

    public Curso() {
    }
    
    public Curso(String nombreCurso, float cantidadHoras, int dias, String turno, float precioHora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantidadHoras = cantidadHoras;
        this.dias = dias;
        this.turno = turno;
        this.precioHora = precioHora;
        this.alumnos = alumnos;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public float getCantidadHoras() {
        return cantidadHoras;
    }

    public void setCantidadHoras(float cantidadHoras) {
        this.cantidadHoras = cantidadHoras;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public float getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(float precioHora) {
        this.precioHora = precioHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }
    
    
}
