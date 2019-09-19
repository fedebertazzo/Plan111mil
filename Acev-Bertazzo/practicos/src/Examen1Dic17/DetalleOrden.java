/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen1Dic17;

import java.math.BigDecimal;

/**
 *
 * @author capacitacion14
 */
public class DetalleOrden {
    private Notebook item;
    private float precioUnitario;
    private int cantidad;

    public DetalleOrden(Notebook item, float precioUnitario, int cantidad) {
        this.item = item;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
    }

    public Notebook getItem() {
        return item;
    }

    public float getPrecioUnitario() {
        return precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    public BigDecimal calcTotalItem(){
        BigDecimal precio = new BigDecimal(precioUnitario * cantidad);
        return precio;        
    }
            
}
