/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen6tojunio18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author capacitacion14
 */
public class Stock {
    private List<ItemStock> items;

    public List<ItemStock> getItems() {
        return items;
    }

    public void setItems(List<ItemStock> newItems) {
        this.items = newItems;
        newItems = new ArrayList<>();
    }
    public List<ItemStock> consultarItemStock (int cantidadMaxima){
        List<ItemStock> resultado = new ArrayList<>();
        for (Iterator<ItemStock> it = items.iterator(); it.hasNext();) {
            ItemStock itemActual = it.next();
            if (itemActual.getCantidad()<cantidadMaxima) {
                resultado.add(itemActual);
            }
        }
        return resultado;
    }
}
