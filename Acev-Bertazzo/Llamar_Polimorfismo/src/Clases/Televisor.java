/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Interface.IOnOff;

/**
 *
 * @author capacitacion14
 */
public class Televisor implements IOnOff{
    private String modelo;

    public Televisor(String modelo) {
        this.modelo = modelo;
    }
   // public void prueba(){
     //   System.out.println("Prueba");
    //}
            
@Override
    public void encender() {
        System.out.println("El Televisor se enciende"); 
    }

    @Override
    public void apagar() {
        System.out.println("El Televisor se apaga");
    }
    
}
