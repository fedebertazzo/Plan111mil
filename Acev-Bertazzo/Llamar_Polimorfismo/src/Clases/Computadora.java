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
public class Computadora implements IOnOff {
    private String modelo;

    public Computadora(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void encender() {
        System.out.println("La computadora se enciende");
    }

    @Override
    public void apagar() {
        System.out.println("La computadora se apaga");
    }

    
}
