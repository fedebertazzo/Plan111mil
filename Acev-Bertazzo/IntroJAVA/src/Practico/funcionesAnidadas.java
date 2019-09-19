package Practico;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author capacitacion14
 */
public class funcionesAnidadas {
    String nombre;
    String usuario;
    String contraseña;
   
    public void main (String[] args){
        String usuario="Juan";
        String contraseña="pass";
        verificar(usuario,contraseña);
            
    }
    
    public void saludar(String nombre){
        System.out.println("Hola, bienvenido/a "+nombre);
    }
    public void error(String nombre){
        System.out.println("Error en la validación: "+nombre+" Es tu usuario?");
    }
    public void verificar(String usuario, String contraseña){
        String usuarioValido="JuanDMeGon";
        String contraseñaValida="MiPass";
        
        if(usuarioValido.equals(usuario) && contraseñaValida.equals(contraseña)){
           saludar(usuario);
        }
        else
        {
           error(usuario);
        }
    }
}
