/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg16vomarzo;

import java.util.List;

/**
 *
 * @author capacitacion14
 */
public class Profesor extends Persona{
    private int cantidadHoras;
    private float sueldo;
    private List<Curso> cursosDictados;

    public Profesor(String nombre, String apellido, int dni) {
        super(nombre, apellido, dni);
    }

    public void setCantidadHoras(int cantidadHoras) {
        this.cantidadHoras = cantidadHoras;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public int getCantidadHoras() {
        return cantidadHoras;
    }

    public float getSueldo() {
        return sueldo;
    }
    public void addCurso(Curso curso){
        this.cursosDictados.add(curso);
    }
    

    
}
