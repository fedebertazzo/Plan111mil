/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen111mil.futbol5;
import java.util.List;
    
/**
 *
 * @author capacitacion14
 */
public class Equipo {
    //Atributos//
    private String nombre;
    private List<String> jugadores;
    private int max_jugadores=0;
    
    //Constructor por defecto//
    public Equipo(){
        
    }
    
    //Constructores//
    public Equipo( String nombre, List<String> jugadores, int max_jugadores){
        this.nombre=nombre;
        this.jugadores=jugadores;
        this.max_jugadores=max_jugadores;
        
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public int getMaxJugadores(){
        return max_jugadores;
    }
    public void setMaxJugadores(int max_jugadores){
        this.max_jugadores=max_jugadores;
    }
    public List<String> getJugador(){
        return jugadores;
    }
    public void addJugador(String jugador){
        this.jugadores.add(jugador);
    }
}
