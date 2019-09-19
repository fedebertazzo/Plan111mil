/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciacolegio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author capacitacion14
 */
public class Estudiante extends Persona {
    private List<String> cursos;
    private List<Float> calificaciones;

    public Estudiante(String nombre, String direccion) {
        super(nombre, direccion);
        cursos=new ArrayList<>();
        calificaciones=new ArrayList<>();
    }
    
    @Override
    public String toString(){
        return "Estudiante"+super .toString();
    }
    public void agregarCalificacion(String curso, float calificacion){
        cursos.add(curso);
        calificaciones.add(calificacion);
    }
    
    public void getNotaCurso(String curso){
        Float nota = -1f;
        if (cursos.contains(curso)){
            nota =calificaciones.get(cursos.indexOf(curso));
        }
    }
    
    public float calcularPromedio(){
        float sum = 0f;
        Iterator<Float> it= calificaciones.iterator();
        while (it.hasNext()){
            float calificacion = it.next();
            sum = sum+calificacion;
        }
        return sum/calificaciones.size();
    }
}
