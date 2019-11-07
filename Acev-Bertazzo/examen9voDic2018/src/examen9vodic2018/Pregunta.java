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
public class Pregunta {
    private String consigna;
    private String respuesta;
    private float puntaje;

    public Pregunta(String consigna, String respuesta, float puntaje) {
        this.consigna = consigna;
        this.respuesta = respuesta;
        this.puntaje = puntaje;
    }

    public String getRespuesta() {
        return respuesta;
    }
    
    public boolean esCorrecta (String respuesta){
        if (respuesta == this.respuesta ) {
            return true;
        }
        return false;
    }

    public float getPuntaje(String respuesta) {
        float puntaje = 0;
        if( respuesta == this.respuesta ){
            puntaje = this.puntaje;
        }
        return puntaje;
    }
    
}
