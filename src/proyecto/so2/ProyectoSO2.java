/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto.so2;

import Clases.ColasPrioridad;
import Clases.IA;

/**
 *
 * @author danie
 */
public class ProyectoSO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ColasPrioridad colas = new ColasPrioridad();
        
        IA ia = new IA();
        
        colas.personajesStartrek();
        colas.personajesStarwars();
        
         System.out.println("");
         System.out.println("***********************************");
         ia.combate(colas);
         System.out.println("");
         colas.printColas();
         System.out.println("***********************************");
         System.out.println("");
         
         System.out.println("");
         System.out.println("***********************************");
         ia.combate(colas);
         System.out.println("");
         colas.printColas();
         System.out.println("***********************************");
        System.out.println("");
        
        System.out.println("");
         System.out.println("***********************************");
         ia.combate(colas);
         System.out.println("");
         colas.printColas();
         System.out.println("***********************************");
         System.out.println("");
         
         System.out.println("");
         System.out.println("***********************************");
         ia.combate(colas);
         System.out.println("");
         colas.printColas();
         System.out.println("***********************************");
        System.out.println("");
        
        System.out.println("");
         System.out.println("***********************************");
         System.out.println(ia.getGanadoresStartrek());
         System.out.println(ia.getGanadoresStarwars());
         System.out.println("***********************************");
        System.out.println("");
        
    }
    
}
