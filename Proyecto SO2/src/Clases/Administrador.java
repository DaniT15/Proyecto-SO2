/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author danie
 */
public class Administrador {
    private int ciclosDeRevision;
    private int ciclosDeRevisionTotales;

    public Administrador() {
        this.ciclosDeRevision = 0;
        this.ciclosDeRevisionTotales = 0;
    }
    
    
    
    //asignacion inical de cada personajes a su cola
    public void asignacion(ColasPrioridad cola){
        
        while(cola.colaRefuerzoStartrek.peek() != null && cola.colaRefuerzoStarwars.peek() != null){
          
            if(cola.colaRefuerzoStartrek.peek() != null){
                Personajes personaje1 = cola.colaRefuerzoStarwars.poll();
                
                switch (personaje1.getPrioridad()) {
                case 1 -> cola.cola1Starwars.add(personaje1);
                case 2 -> cola.cola2Starwars.add(personaje1);
                default -> cola.cola3Starwars.add(personaje1);
                }
            }else{}   
            
            if(cola.colaRefuerzoStartrek.peek() != null){
                Personajes personaje2 = cola.colaRefuerzoStartrek.poll();
                
                switch (personaje2.getPrioridad()) {
                case 1 -> cola.cola1Startrek.add(personaje2);
                case 2 -> cola.cola2Startrek.add(personaje2);
                default -> cola.cola3Startrek.add(personaje2);
                }
            }else{}
            
        }
        
        cola.printColas();
    }
   
    
    public void ejecucionPelea(ColasPrioridad cola, IA ia) throws InterruptedException{
        
        Personajes personaje1 = null;
        Personajes personaje2 = null;
        
        // Escoje peleador de Starwars
        if (cola.cola1Starwars.peek() != null) {
            personaje1 = cola.cola1Starwars.poll();
        } else if (cola.cola2Starwars.peek() != null) {
            personaje1 = cola.cola2Starwars.poll();
        } else if (cola.cola3Starwars.peek() != null) {
            personaje1 = cola.cola3Starwars.poll();
        }

        // Escoje peleador de Startrek
        if (cola.cola1Startrek.peek() != null) {
            personaje2 = cola.cola1Startrek.poll();
        } else if (cola.cola2Startrek.peek() != null) {
            personaje2 = cola.cola2Startrek.poll();
        } else if (cola.cola3Startrek.peek() != null) {
            personaje2 = cola.cola3Startrek.poll();
        }
        
        ia.combate(cola, personaje1, personaje2);
        
         //Logica funcion para personajes en Reservas -> cola1
        int probabilidad1 = (int)(Math.random()* 100);
        if(cola.colaRefuerzoStarwars.peek() != null){
                if(probabilidad1 >= 40){
                    Personajes personajeCambio1 = cola.colaRefuerzoStarwars .poll();
                    cola.cola1Starwars.add(personajeCambio1);}
                else{
                    Personajes personajeCambio1 = cola.colaRefuerzoStarwars .poll();
                    cola.colaRefuerzoStarwars.add(personajeCambio1);}
            }else{}
        
        int probabilidad2 = (int)(Math.random()* 100);
        if(cola.colaRefuerzoStartrek.peek() != null){
                if(probabilidad2 >= 40){
                    Personajes personajeCambio2 = cola.colaRefuerzoStartrek .poll();
                    cola.cola1Startrek.add(personajeCambio2);}
                else{
                    Personajes personajeCambio2 = cola.colaRefuerzoStartrek .poll();
                    cola.colaRefuerzoStartrek.add(personajeCambio2);}
            }else{}
        
        cicloRevision( cola);
    }
    
    public void cicloRevision(ColasPrioridad cola){
        this.ciclosDeRevision ++;
        
        
        if(this.ciclosDeRevision >= 2){
            int probabilidad1 = (int)(Math.random()* 100);
            
             if(probabilidad1 <= 80){
                this.ciclosDeRevision = 0;
                this.ciclosDeRevisionTotales += 1;

                Personajes personaje1 = new Personajes(this.ciclosDeRevisionTotales + 80, "Han Solo" + this.ciclosDeRevisionTotales + 80, "Han Solo.png");
                personaje1.evaluarPrioridad();
                cola.colaRefuerzoStarwars.add(personaje1);

                Personajes personaje2 = new Personajes(this.ciclosDeRevisionTotales + 80, "Spok" + this.ciclosDeRevisionTotales + 80, "Spock.png");
                personaje1.evaluarPrioridad();
                cola.colaRefuerzoStartrek.add(personaje2);
             }
             else{
                this.ciclosDeRevision = 0;
                this.ciclosDeRevisionTotales += 1;
            }
        }else{}
        
    }

    public int getCiclosDeRevision() {
        return ciclosDeRevision;
    }

    public void setCiclosDeRevision(int ciclosDeRevision) {
        this.ciclosDeRevision = ciclosDeRevision;
    }
    
    
}
