/*
   Crea una clase "Cocina" que tenga una lista de objetos "Receta". Luego, 
crea métodos para agregar nuevas recetas a la lista, para buscar una receta 
por nombre y para obtener la lista de recetas que se pueden preparar con los 
ingredientes disponibles en la cocina.
 */
package Entidades;

/**
 *
 * @author Josue
 */
public class Receta {
    public String nombre1;
    public String nombre2;
    public String nombre3;
    private String[] ingredientes1 = new String[10];
    private String[] ingredientes2 = new String[10];
    private String[] ingredientes3 = new String[10];

    public Receta() {
    }

    public Receta(String nombre1, String nombre2, String nombre3) {
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.nombre3 = nombre3;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getNombre3() {
        return nombre3;
    }

    public void setNombre3(String nombre3) {
        this.nombre3 = nombre3;
    }

    public String[] getIngredientes1() {
        return ingredientes1;
    }

    public void setIngredientes1(String[] ingredientes1) {
        this.ingredientes1 = ingredientes1;
    }

    public String[] getIngredientes2() {
        return ingredientes2;
    }

    public void setIngredientes2(String[] ingredientes2) {
        this.ingredientes2 = ingredientes2;
    }

    public String[] getIngredientes3() {
        return ingredientes3;
    }

    public void setIngredientes3(String[] ingredientes3) {
        this.ingredientes3 = ingredientes3;
    }
    
    public void cargarRecetas(){
        nombre1 = "Bizcochuelo";
        nombre2 = "Cafe con leche";
        nombre3 = "Fideos con tuco";        
        ingredientes1[0] = "huevos";
        ingredientes1[1] = "leche";
        ingredientes1[2] = "harina";
        ingredientes2[0] = "cafe";
        ingredientes2[1] = "agua hirviendo";
        ingredientes2[2] = "leche";
        ingredientes2[3] = "azucar";
        ingredientes3[0] = "fideos";
        ingredientes3[1] = "salsa de tomate";
        ingredientes3[2] = "carne";
    }
}
