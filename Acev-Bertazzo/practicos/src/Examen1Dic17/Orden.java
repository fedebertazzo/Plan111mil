/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen1Dic17;

import java.math.BigDecimal;
import java.util.Date;
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

    public Orden(List<DetalleOrden> items, int id, Date creacion, Date envio) {
        this.items = items;
        this.id = id;
        this.creacion = creacion;
        this.envio = envio;
    }

    public List<DetalleOrden> getItems() {
        return items;
    }

    public int getId() {
        return id;
    }

    public Date getCreacion() {
        return creacion;
    }

    public Date getEnvio() {
        return envio;
    }

    public void setItems(List<DetalleOrden> items) {
        this.items = items;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreacion(Date creacion) {
        this.creacion = creacion;
    }

    public void setEnvio(Date envio) {
        this.envio = envio;
    }
    
    public int getNroItems() {
        return items.size();
    }
    
    public void agregarItem(DetalleOrden detalle){
        items.add(detalle);
    }
    
    
    public BigDecimal calcularTotalOrden() {
        BigDecimal total = BigDecimal.ZERO;
        
        for (DetalleOrden detalle : items) {
            total = total.add(detalle.calcTotalItem());
        }
        
        return total;       
}
