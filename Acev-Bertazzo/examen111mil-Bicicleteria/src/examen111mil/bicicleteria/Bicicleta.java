/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen111mil.bicicleteria;

/**
 *
 * @author capacitacion14
 */
public class Bicicleta {
    private String nroDeSerie;
    private String modelo;
    private int año;
    private float precio;
    
    
    public Bicicleta(){
        
    }
    public Bicicleta( String nroDeSerie, String modelo, int año, float precio){
        this.nroDeSerie=nroDeSerie;
        this.modelo=modelo;
        this.año=año;
        this.precio=precio;
        }
    public float getPrecio(){
        return precio;
    }
    public void setPrecio(float precio){
        this.precio=precio;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    public String getNroDeSerie(){
        return nroDeSerie;
    }
    public void setNroDeSerie(String nroDeSerie){
        this.nroDeSerie=nroDeSerie;
    }
}
