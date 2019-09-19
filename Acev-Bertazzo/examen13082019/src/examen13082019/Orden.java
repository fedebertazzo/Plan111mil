/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen13082019;

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

    public Orden(int id, Date creacion) {
        this.id = id;
        this.creacion = creacion;
    }
    
    public void agregarItem(DetalleOrden detalle){
        this.items.add(detalle);
    }
    
    public int getNroItems(){
        return items.size();
    }

    public void setEnvio(Date envio) {
        this.envio = envio;
    }
    
}
