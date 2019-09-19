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
public class Ej3 {
    public static void main (String[] args){
        double altura, ancho, area, litros;
      
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cálculo de litros necesario para pintar");
        System.out.println("Ingrese el valor de altura (m): ");
        altura = teclado.nextFloat();
        System.out.println("Ingrese el valor del ancho (m): ");
        ancho = teclado.nextFloat();
        area = altura*ancho;
        System.out.printf("El área a pintar es: %.2f\n",area);
        litros= area*(0.5)/(3.6);
        System.out.printf("Los litros necesarios son: %.2f\n",litros);
        
    }
}
