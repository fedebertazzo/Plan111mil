/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen9vodic2018;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author capacitacion14
 */
public class Examen {
    private String tema;
    private List<Pregunta> preguntas;
    private List<List<String>> respuestasAlumnos;
    private List<String> alumnos;

    public Examen(String tema, List<Pregunta> preguntas, List<List<String>> respuestasAlumnos, List<String> alumnos) {
        this.tema = tema;
        this.preguntas = preguntas;
        preguntas = new ArrayList<Pregunta>();
        this.respuestasAlumnos = respuestasAlumnos;
        respuestasAlumnos = new ArrayList<List<String>>();
        this.alumnos = alumnos;
    }

    public float calificarRespuestas (List<String> respuestas){
        float puntajeObtenido = 0;
        int j = 0;
        for (int i = 0; i < preguntas.size(); i++) {
            while (i==j) {
                for (Iterator<String> iterator = respuestas.iterator(); iterator.hasNext();) {
                    String next = iterator.next();
                    
                }
                
            }
                
        }
        

            
        }
            
        }
        return puntajeObtenido;
    }
    
}
