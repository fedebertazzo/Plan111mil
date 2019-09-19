/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;
import java.util.Scanner;
/**
 *Indice de masa corporal
 * @author capacitacion14
 */
public class Imc {
    public static void main(String[] args){
        double peso, altura, imc;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la altura:");
        altura = teclado.nextDouble();
        System.out.println("Ingrese su peso:");
        peso = teclado.nextDouble();
        imc = peso / Math.pow(altura,2);
        System.out.printf("Su indice de masa corporal es:%.2f", imc);
        if (imc <= 18.5){
            System.out.println("Tienes un imc bajo");
        } else if (imc <= 24.90){
            System.out.println("Tienes un imc normal");
        } else {
            System.out.println("Tienes un imc alto");
        }
    }
}

