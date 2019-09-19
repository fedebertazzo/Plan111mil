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
public class Genero {
    //Atributos de la clase
    private Integer id;
    private String nombre;
    
     //Constructor por defecto
    public Genero(){
    }
     
    //Constructores
    public Genero(String nombre){
        this.nombre=nombre;
    }
    
    //Setters & Getters
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
