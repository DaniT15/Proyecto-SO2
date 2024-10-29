/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto.so2;

import Clases.Administrador;
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
    public static void main(String[] args) throws InterruptedException {
        
        ColasPrioridad colas = new ColasPrioridad();
        
        IA ia = new IA();
        
        Administrador admin = new Administrador();
        
        colas.personajesStartrek();
        colas.personajesStarwars();
        
        admin.asignacion(colas);
        
        for(int i = 0; i < 2; i++){
            admin.ejecucionPelea(colas, ia);
        
            colas.printColas();
        }
        
        ia.cambiarTiempoCombate(1);
        
        for(int i = 0; i < 15; i++){
            admin.ejecucionPelea(colas, ia);
        
            colas.printColas();
        }
        
        
       
    }
    
}
