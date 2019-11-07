/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen9vodic2018;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author capacitacion14
 */
public class Curso {
  private String nombre;
  private List<String> alumnos;
  private List<Examen> examenes;

    public Curso(String nombre, List<String> alumnos, List<Examen> examenes) {
        this.nombre = nombre;
        this.alumnos = alumnos;
        alumnos = new ArrayList<>();
        this.examenes = examenes;
        examenes = new ArrayList<>();
    }
        
    public boolean addAlumno (String alumno){
        alumnos.add(alumno);
        return true;
    }
    public boolean addExamen (Examen examen){
        examenes.add(examen);
        return true;
    }
    public boolean addRespuestas (String temaExamen, String alumno, List<String> respuestas){
        //falta gilada
        return true;
    }
  
}
