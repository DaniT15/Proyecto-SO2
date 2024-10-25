/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto.so2;

import Clases.Personajes;

/**
 *
 * @author danie
 */
public class ProyectoSO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Personajes personaje1 = new Personajes(1, "Han Solo");
        Personajes personaje2 = new Personajes(2, "Obiwan Kenobi");
        Personajes personaje3 = new Personajes(3, "Luke Skywalker");
        Personajes personaje4 = new Personajes(4, "Leia");
        
        personaje1.evaluarPrioridad();
        personaje2.evaluarPrioridad();
        personaje3.evaluarPrioridad();
        personaje4.evaluarPrioridad();
        
    }
    
}
