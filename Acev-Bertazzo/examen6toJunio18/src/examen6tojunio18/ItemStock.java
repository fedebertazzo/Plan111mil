/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen6tojunio18;

import java.util.Date;

/**
 *
 * @author capacitacion14
 */
public class ItemStock {
    private Computadora computadora;
    private int cantidad;
    private Date ultimaFechaModificacion;

    public ItemStock(Computadora c, int cantidad) {
        this.computadora = c;
        this.cantidad = cantidad;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    
}
