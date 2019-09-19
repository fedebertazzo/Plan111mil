/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen5abril2018;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author capacitacion14
 */
public class GestorDePaquetesDeProyectores {
    private List<PaqueteProyectores>  paquetes;
    private String nombreEmpresa;

    public GestorDePaquetesDeProyectores(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        paquetes = new ArrayList<>();
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }
    public void agregarPaquete(PaqueteProyectores paqueteNuevo){
        paquetes.add(paqueteNuevo);
    }
    public int buscarPaqueteDeProyectores(int codPaq){
        for (Iterator<PaqueteProyectores> it = paquetes.iterator(); it.hasNext();) {
            PaqueteProyectores paqActual = it.next();
            if (codPaq == paqActual.getCodPaqueteDeProyectores()){
                return paqActual.getCodPaqueteDeProyectores();
            }
            else{
                return (null);
            }
            
        }
}
}