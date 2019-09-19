/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen13082019;
/**
 *
 * @author capacitacion14
 */
public class DetalleOrden {
    private float precioUnitario;
    private int cantidad;
    private Notebook item;

    public DetalleOrden(float precioUnitario, int cantidad, Notebook item) {
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
        this.item = item;
    }

    public float getPrecioUnitario() {
        return precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Notebook getItem() {
        return item;
    }

}
