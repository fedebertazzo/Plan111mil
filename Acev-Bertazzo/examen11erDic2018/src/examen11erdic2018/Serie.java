/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen11erdic2018;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author capacitacion14
 */
public class Serie {
    private String nombre;
    private List<Temporada> temporadas;

    public Serie(String nombre) {
        this.nombre = nombre;
        this.temporadas = new ArrayList<Temporada>();
    }
    
    public void agregarTemporada (int numero){
        Temporada temporada = new Temporada(numero);
        temporadas.add(temporada);
    }
    
    public Episodio obtenerEpisodio(int numTemporada, int numEpisodio){
        if(temporadas.contains(numTemporada)){
            for (Iterator<Temporada> itTemporada = temporadas.iterator(); itTemporada.hasNext();) {
                Temporada temporada = itTemporada.next();
                List<Episodio> episodios = temporada.getEpisodios();
                for (Iterator<Episodio> itEpisodios = episodios.iterator(); itEpisodios.hasNext();) {
                    Episodio episodioActual = itEpisodios.next();
                    if(numEpisodio == episodioActual.getNumero()){
                        return episodioActual;
                    } else {
                        System.out.println("No existe el episodio");
                        return null;
                    }
                }
            }
        } else {
            System.out.println("No existe temporada");
            return null;
        }
        System.out.println("Error!");
        return null;
    }
    
    public Episodio obtenerEpisodio2 (int numTemporada, int numEpisodio){
        for (Iterator<Temporada> itTemporada = temporadas.iterator(); itTemporada.hasNext();) {
            Temporada tempActual = itTemporada.next();
            if (tempActual.getNumero()==numTemporada) {
                Episodio episodio = tempActual.buscarEpisodio(numEpisodio);
                return episodio;                
            }
        }
        return null;
    }
}
