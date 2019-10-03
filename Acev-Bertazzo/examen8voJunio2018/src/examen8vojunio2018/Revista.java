/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen8vojunio2018;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author capacitacion14
 */
public class Revista {
    private List<Articulo> elementos;
    private String titulo;
    private int ejemplar;

    public Revista(List<Articulo> elementos, String titulo, int ejemplar) {
        this.elementos = elementos;
        elementos = new ArrayList<>();
        this.titulo = titulo;
        this.ejemplar = ejemplar;
    }
    
    public boolean addElemento(Articulo articulo){
        elementos.add(articulo);
        return true;
    }
    
    public Articulo getArticuloEnPosicion (int posicion){
        if (posicion <= elementos.size() && posicion < 0){
            return elementos.get(posicion);
        }else{
            return null;
        }
    }
    public int getCantidadArticulosDeTema (String tema){
        int cantidad=0;
        for (int i = 0; i < elementos.size(); i++) {
            Articulo articulo = elementos.get(i);
            if (articulo.contieneTema(tema)) {
                cantidad++;
            }
        }
    return cantidad;    
    }
}