/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practico;
import java.util.Scanner;
/**
 *
 * @author capacitacion14
 */
public class Ej1 {
    public static void main(String[] args){
        float mtsFrente, mtsFondo, mtsAl;
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese cantidad metros de frente");
        mtsFrente = teclado.nextFloat();
        System.out.println("ingrese cantidad metros de fondo");
        mtsFondo = teclado.nextFloat();
        mtsAl = 2 * (mtsFrente + mtsFondo);
        System.out.println("La cantidad de alhambre necesaria para cercar es "+mtsAl);
    }
}
