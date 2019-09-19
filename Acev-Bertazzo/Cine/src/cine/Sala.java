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
public class Sala {
    //Atributos//
    private int capacidad;
    private int numero;
    //Constructor por defecto//
    public Sala(){
        
    }
    //Constructores
    public Sala(int capacidad, int numero){
        this.capacidad=capacidad;
        this.numero=numero;
    }
    //Setters & getters
    public int getCapacidad(){
        return capacidad;
    }
    public void setCapacidad(int capacidad){
        this.capacidad=capacidad;
    }
    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){
        this.numero=numero;
    }
    @Override
    public String toString(){
        return "Sala "+numero+"("+capacidad+")";
        }
}
