/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen10modic2018;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author capacitacion14
 */
public class Poliza {
    private int idPoliza;
    private List<ObjetoDeValor> objetosDeValor;

    public Poliza(int idPoliza) {
        this.idPoliza = idPoliza;
        objetosDeValor = new ArrayList<ObjetoDeValor>();
    }

    public int getIdPoliza() {
        return idPoliza;
    }

    public List<ObjetoDeValor> getObjetosDeValor() {
        return objetosDeValor;
    }
    
    public void agregarObjetoDeValor (String nombre,double valor){
        ObjetoDeValor objeto = new ObjetoDeValor(nombre, valor);
        objetosDeValor.add(objeto);
    }
    /*public double mostrarValor(String nombre){
        double val = 0;
        for (Iterator<ObjetoDeValor> it = objetosDeValor.iterator(); it.hasNext();) {
            ObjetoDeValor obj = it.next();
            if (obj.getNombre() == nombre) {
               val = obj.getValor();   
            } else {
                val=0;
            }
        }
        return val;
    }*/   
}
