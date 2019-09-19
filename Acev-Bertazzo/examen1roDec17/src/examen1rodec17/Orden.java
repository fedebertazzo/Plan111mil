/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1rodec17;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author capacitacion14
 */
public class Orden {
    private List<DetalleOrden> items;
    private int id;
    private Date creacion;
    private Date envio;

    public Orden(int id, Date creacion) {
        this.id = id;
        this.creacion = creacion;
        items= new ArrayList<>();
    }
    public void agregarItem(DetalleOrden detalle){
        items.add(detalle);
    }
    public int getNroItems(){
        int nroItems;
        nroItems=items.size();
        return nroItems;
    }

    public void setEnvio(Date envio) {
        this.envio = envio;
    }
    /*Ejericio 2 - Programar en Java el código del método calcularTotalOrden en la clase Orden. 
    El mismo deberá retornar el precio total de una orden. 
    Para esto deberá tener en cuenta la cantidad solicitada de cada notebook.*/
    public float calcularTotalOrden(){
        float precioTotal;
        precioTotal=0;
        
        for (Iterator<DetalleOrden> it = items.iterator(); it.hasNext();) {
            DetalleOrden next = it.next();
            float precioItem= next.getCantidad()*next.getPrecioUnitario();
            precioTotal=precioTotal+precioItem;
        }      
        return precioTotal;
    }
}
