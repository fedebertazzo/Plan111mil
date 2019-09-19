/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen3rodec17;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author capacitacion14
 */
public class Equipo {
    private String nombre;
    private List<String> jugadores;
    private int max_jugadores;

    public Equipo(String nombre, List<String> jugadores) {
        this.nombre = nombre;
        this.jugadores = jugadores;
        jugadores = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<String> getJugadores() {
        return jugadores;
    }

    public int getMax_jugadores() {
        return max_jugadores;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMax_jugadores(int max_jugadores) {
        this.max_jugadores = max_jugadores;
    }
    public void addJugador(String jugador){
        jugadores.add(jugador);
    }
    
}
