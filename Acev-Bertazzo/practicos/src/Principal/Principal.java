/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import Interface.IComerJugar;
import practicos.Gato;
import practicos.Pez;
/**
 *
 * @author capacitacion14
 * 
 * Práctico 01-08-2019
 * Ejercicio 3
 */
public class Principal {
    public static void main(String[] args) {
    IComerJugar obj = new Gato();
    obj.comer();
    obj.jugar();
    
    IComerJugar obj = new Pez();
    obj.comer();
    obj.jugar();
}
