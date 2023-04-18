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
public class Cocina {

    public Cocina() {
    }
    
    Receta nom = new Receta();
    public String[] recetas = new String[3];
    public String[] ingredientes = new String[3];
    
    public void cargarReceta(){
        nom.cargarRecetas();
        for (int i = 0; i < 3; i++) {
            recetas[0] = nom.nombre1;
            recetas[1] = nom.nombre2;
            recetas[2] = nom.nombre3;
        }        
    }
}
