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
public class Rol {
    //Atributos
    private String nombre;
    //Constructor por defecto//
    public Rol(){
        
    }
    //Constructores//
    public Rol(String nombre){
        this.nombre=nombre;
    }
    //Setters & getters//
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
}
    
