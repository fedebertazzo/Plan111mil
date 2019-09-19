/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;
import java.util.Scanner;
/**
 *
 * @author capacitacion14
 */
public class usoSwitch {
    public static void main(String[] args){
        int nota = 2;
                switch (nota){
                    case 1:
                        System.out.println("Tenes un 1");
                        break;
                    case 2:
                        System.out.println("Tenes un 2");
                        break;
                    case 3:
                        System.out.println("Tenes un 3");
                        break;
                    default:
                        System.out.println("Tenes una nota distinta a 1,2 o 3");
                }
    }
}
