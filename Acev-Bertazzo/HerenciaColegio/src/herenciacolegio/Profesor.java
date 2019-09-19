/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciacolegio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author capacitacion14
 */
public class Profesor extends Persona{
    private List<String> cursos;
    private double salario;
    public Profesor(String nombre, String direccion) {
        super(nombre, direccion);
        cursos = new ArrayList<>();
    }
    
    @Override
    public String toString(){
        return "Profesor"+super.toString();
    }
    
    public void agregarCurso(String curso){
        cursos.add(curso);
    }
    
    public void setSalario( double salario){
	this . salario = salario;
    }
    public double getSalario(){
	return salario ;
    }

}
