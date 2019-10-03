/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen7mojunio2018;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author capacitacion14
 */
public class Album {
    private List<Foto> fotos;
    private String nombre;
    private int cantidadMaxima;
    private Date fechaCreacion;

    public Album(String nombre, int maximo) {
        this.nombre = nombre;
        this.cantidadMaxima = maximo;
        List<Foto> fotos = new ArrayList<>();
    }

    public List<Foto> getFotos() {
        return fotos;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidadMaxima() {
        return cantidadMaxima;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }
    public void addFoto (Foto foto){
        fotos.add(foto);
    }
   /*usando ITERATOR*/
    public boolean tieneFotoConTamañoMenor (int umbral){
        for (Iterator<Foto> it = fotos.iterator(); it.hasNext();) {
            Foto fotoActual = it.next();
            if (fotoActual.getTamaño()< umbral) {
                System.out.println("La foto "+fotoActual.getNombreArchivo()+"tiene un tamaño menor a "+umbral);
            }
        }
        return true;
    }
     public boolean tieneFotoConTamañoMenor2 (int umbral){
         int aux=0;
         for (int i = 0; i < fotos.size(); i++) {
             Foto fotoActual = fotos.get(i);
             if (fotoActual.getTamaño()< umbral) {
                System.out.println("La foto "+fotoActual.getNombreArchivo()+"tiene un tamaño menor a "+umbral);
                aux=aux+1;
            }
             }
         if (aux>1) {
             return true; 
         }
             return false;
     }
}
