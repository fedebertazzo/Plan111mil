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
public class Ej2 {
    public static void main(String[] args){
        int primNum, segNum;
        float rtdo;
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        primNum = teclado.nextInt();
        System.out.println("ingrese el segundo numero");
        segNum = teclado.nextInt();
        rtdo = primNum + segNum;
        System.out.println("La suma es "+rtdo);
        
    }
}
