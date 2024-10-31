/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto.so2;

import Clases.Administrador;
import Clases.ColasPrioridad;
import Clases.IA;
import Interfaz.Menu;
import java.net.MalformedURLException;

/**
 *
 * @author danie
 */
public class ProyectoSO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException, MalformedURLException {
        
        ColasPrioridad colas = new ColasPrioridad();
        IA ia = new IA();
        Administrador admin = new Administrador();

        colas.personajesStartrek();
        colas.personajesStarwars();
        
        Menu frame = new Menu();
        frame.setVisible(true);
        
        admin.asignacion(colas);
        
        int contador = 20;
        
        while(contador > 0){
        
            admin.ejecucionPelea(colas, ia, frame);
        
            colas.printColas();
            
            contador --;
        }
    
    }
    
}
