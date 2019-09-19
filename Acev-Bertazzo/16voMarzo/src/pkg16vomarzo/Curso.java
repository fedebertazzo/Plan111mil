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
class Curso {
    private String nombre;
    private int maximoAlumnos;
    private List<Alumno> alumnos;
    private List<Float> notas;

    public Curso(String nombre, int maximoAlumnos) {
        this.nombre = nombre;
        this.maximoAlumnos = maximoAlumnos;
    }

    public String getNombre() {
        return nombre;
    }
    
    public boolean agregarAlumno(Alumno nuevoAlumno){
        alumnos.add(nuevoAlumno);
        return true;
    }
}
