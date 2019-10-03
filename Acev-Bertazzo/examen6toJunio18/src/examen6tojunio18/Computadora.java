/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen6tojunio18;

/**
 *
 * @author capacitacion14
 */
public class Computadora {
    private String nombre;
    private int precio;

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    /*Se agregó el CONTRUCTOR por defecto aunque no lo pide en el examen*/

    public Computadora(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    
}
