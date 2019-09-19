/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg16vomarzo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author capacitacion14
 */
public class Alumno extends Persona {
 private int añoDeIngreso;
 private List<Curso> cursadas;

    public Alumno(int añoDeIngreso, String nombre, String apellido, int dni) {
        super(nombre, apellido, dni);
        this.añoDeIngreso = añoDeIngreso;
        this.cursadas= new ArrayList<>();
        
    }
 }

