/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;
import java.util.Scanner;
/**
 *
 * @author capacitacion14
 */
public class Ejercicio1 {
    public  static void main(String[] args){
        int num1,num2,resultado;
        Scanner Teclado = new Scanner (System.in);
        
        System.out.println("Ingrese el primer número: ");
        num1 = Teclado.nextInt();
        
        System.out.println("Ingrese el segundo número: ");
        num2 = Teclado.nextInt();
        
        resultado = num1+num2;
        System.out.println("El resultado es : "+"\n"+resultado);
        }
}
