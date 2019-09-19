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
public class Personaje {
    //Atributos
    private String nombreEnPelicula;
    private Actor actor;
    private Rol rol;
    
    //Constructor por defecto//
    public Personaje(){
        
    }
    //Constructores//
    public Personaje(String nombreEnPelicula, Actor actor, Rol rol){
        this.nombreEnPelicula=nombreEnPelicula;
        this.actor=actor;
        this.rol=rol;
    }
    //Setters & getters//
    public String getNombreEnPelicula(){
        return nombreEnPelicula;
    }
    public void setNombreEnPelicula(String nombreEnPelicula){
        this.nombreEnPelicula=nombreEnPelicula;
    }
    public Actor getActor(){
        return actor;
    }
    public void setActor(Actor actor){
        this.actor=actor;
    }
    public Rol getRol(){
        return rol;
    }
    public void setRol(Rol rol){
        this.rol=rol;
    }
@Override
    public String toString(){
    return nombreEnPelicula+" interpretado por "+actor;
    }
}
