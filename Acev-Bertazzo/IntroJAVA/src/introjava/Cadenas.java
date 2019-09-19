/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

/**
 *
 * @author capacitacion14
 */
public class Cadenas {
    public static void main(String[] args){
        String nombre = "Aracelli";
        String primeras3 = nombre.substring(0,3);
        System.out.println(primeras3);
        int longitud=nombre.length();
        System.out.println("La longitud es: "+longitud);
        String ultimas3 = nombre.substring(longitud-3);
        System.out.println(ultimas3);
    }
    
}
