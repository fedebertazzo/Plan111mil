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
public class Temporada {
    private int numero;
    private List<Episodio> episodios;

    public Temporada(int numero) {
        this.numero = numero;
        this.episodios = new ArrayList<Episodio>();
    }

    public int getNumero() {
        return numero;
    }

    public List<Episodio> getEpisodios() {
        return episodios;
    }
    
    public void agregarEpisodio (int numero, String titulo, boolean visto ){
        Episodio episodio = new Episodio(numero, titulo, visto);
        episodios.add(episodio);
    }
        public Episodio buscarEpisodio(int numEpisodio){
            for (Iterator<Episodio> it = episodios.iterator(); it.hasNext();) {
                Episodio epiActual = it.next();
                if(epiActual.getNumero()==numEpisodio)
                    return epiActual;
            }
            return null;
        }
}
