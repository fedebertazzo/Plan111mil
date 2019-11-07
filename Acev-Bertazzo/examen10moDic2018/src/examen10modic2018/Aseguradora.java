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
public class Aseguradora {
    private int idAseguradora;
    private String nombre;
    private String ciudad;
    private List<Poliza> polizas;

    public Aseguradora(String nombre) {
        this.nombre = nombre;
        polizas = new ArrayList<Poliza>();
    }

    public List<Poliza> getPolizas() {
        return polizas;
    }
    
    public void agregarPoliza(int idPoliza){
        Poliza poliza = new Poliza(idPoliza);
        polizas.add(idPoliza, poliza);
    }
    
    public Poliza buscarPoliza (int idPoliza){
        if (polizas.contains(idPoliza)) {
            Poliza poliza = polizas.get(idPoliza);
            //polizaEncontrada = true;
            return poliza;
        } else {
            return null;
        }
    }
    //opcion2
        public double obtenerValor (int idPoliza, String nombreObjeto){
            double valorEncontrado =0;
        if (polizas.contains(idPoliza)) {
            Poliza poliza = polizas.get(idPoliza);
            List<ObjetoDeValor> listobj =poliza.getObjetosDeValor();
            for (Iterator<ObjetoDeValor> it = listobj.iterator(); it.hasNext();) {
                ObjetoDeValor obj = it.next();
                if (obj.getNombre()== nombreObjeto){
                    valorEncontrado =obj.getValor();
                    
            } else {
                    System.out.println("No existe el objeto de valor");
                    valorEncontrado = 0;
                }  
            }
    } else {
            System.out.println("No se encontró poliza");
        }
        return valorEncontrado;
}
}
