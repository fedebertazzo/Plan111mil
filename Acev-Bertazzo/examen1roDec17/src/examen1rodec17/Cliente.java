/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1rodec17;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author capacitacion14
 */
public class Cliente {
    private String nombre;
    private int dni;
    private List<Orden> ordenes;

    public Cliente(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
        ordenes =new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }
    public void agregarOrden(Orden o){
        ordenes.add(o);
    }
    
}
