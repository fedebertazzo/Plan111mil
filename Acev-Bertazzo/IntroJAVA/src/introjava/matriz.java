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
public class matriz {
    public static void main(String[] args) {
        int[][] suma = new int[5][5];
        for (int i=0; i<5;i++){
            for(int j=0;j<5;j++){
            suma[i][j] = i+j;
            System.out.print(suma[i][j]+" ");
        }
        System.out.println();
    }
}
}
