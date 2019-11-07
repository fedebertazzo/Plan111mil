/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen9vodic2018;

/**
 *
 * @author capacitacion14
 */
public class Examen9voDic2018 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Examen examen1 = new Examen("quimica", preguntas, respuestasAlumnos, alumnos);
        Curso curso1 = new Curso("sextoA", alumnos, examen1);
        Pregunta pregunta1 = new Pregunta("Como se calcula el perimetro de un cuadrado?", "Lado x 4", (float) 5.5);
        
        pregunta1.esCorrecta("lado x 3");
        
    }
    
}
