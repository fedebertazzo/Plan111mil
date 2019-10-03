/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen7mojunio2018;

/**
 *
 * @author capacitacion14
 */
public class Foto {
    private String personasEnFoto;
    private String nombreArchivo;
    private int tamaño;
    private String descripcion;

    public Foto(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String getPersonasEnFoto() {
        return personasEnFoto;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setPersonasEnFoto(String personasEnFoto) {
        this.personasEnFoto = personasEnFoto;
    }
/*Lo creamos para poder mostrar el nmbre en el método tieneFotoConTamañoMenor de la calse Album*/
    public String getNombreArchivo() {
        return nombreArchivo;
    }
    
    
}
