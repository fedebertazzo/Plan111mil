    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen1Dic17;

import java.util.List;

/**
 *
 * @author capacitacion14
 */
public class Cliente {
    private String nombre;
    private int dni;
    private List<Orden> ordenes;

    public Cliente(String nombre, int dni, List<Orden> ordenes) {
        this.nombre = nombre;
        this.dni = dni;
        this.ordenes = ordenes;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    public List<Orden> getOrdenes() {
        return ordenes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setOrdenes(List<Orden> ordenes) {
        this.ordenes = ordenes;
    }
    
    public void agregarOrden(Orden o){
        ordenes.add(o);
    }
}
