/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

import Entidad.Persona;

/**
 *
 * @author Josue
 */
public class POOEj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona primera = new Persona();
        primera.setNombre("Nahuel");
        System.out.println(primera.getNombre());
    }
    
}
