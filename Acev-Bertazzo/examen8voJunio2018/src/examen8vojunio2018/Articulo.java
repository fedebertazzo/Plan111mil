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
public class Articulo {
    private String titulo;
    private String periodista;
    private List<String> temas;
    private int palabras;
    private String texto;
    private long idArticulo;

    public Articulo(String titulo, String periodista, List<String> temas, int palabras, String texto, long idArticulo) {
        this.titulo = titulo;
        this.periodista = periodista;
        this.temas = temas;
        temas = new ArrayList<>();
        this.palabras = palabras;
        this.texto = texto;
        this.idArticulo = idArticulo;
        }

    public String getPeriodista() {
        return periodista;
    }

    public int getPalabras() {
        return palabras;
    }

    public void setPeriodista(String periodista) {
        this.periodista = periodista;
    }

    public void setPalabras(int palabras) {
        this.palabras = palabras;
    }
    
    public boolean addTema(String tema){
        temas.add(tema);
        return true;
    }
    
    public boolean contieneTema(String tema){
        for (int i = 0; i < temas.size(); i++) {
            if (tema == temas.get(i)) {
                return true;
            }
            
        }
        return false;
        }
    
    // Usando el método "contains" de la lista
    public boolean contieneTema2 (String tema){
        if (temas.contains(tema)) {
            return true;
        }
        return false;
    }  
}
