/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen11erdic2018;

import java.util.Iterator;

/**
 *
 * @author capacitacion14
 */
public class Episodio {
    private int numero;
    private String titulo;
    private boolean visto;

    public Episodio(int numero, String titulo, boolean visto) {
        this.numero = numero;
        this.titulo = titulo;
        this.visto = visto;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitulo() {
        return titulo;
    }
    
    public boolean fueVisto (){
        // hacer método
        return visto;
    }

}
