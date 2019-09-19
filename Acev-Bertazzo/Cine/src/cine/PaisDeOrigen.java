/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

/**
 *
 * @author capacitacion14
 */
public class PaisDeOrigen {
    //Atributos de la clase
    private int id;
    private String idioma;
    private String nombre;
    
    //Constructor por defecto
    public PaisDeOrigen(){
        
    }
    //Constructores
    public PaisDeOrigen(String idioma, String nombre){
        this.nombre=nombre;
        this.idioma=idioma;
    }
    //Setters & Getters
    public String getIdioma(){
        return idioma;
    }
    public void setIdioma(String idioma){
        this.idioma=idioma;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    @Override
    public String toString(){
        return this.nombre;
    }
}
