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
public class notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] notas = new int[5];
        int i;
        
       /* notas [0]=2;
        notas [1]=8;
        notas[2]=7;
        notas[3]=10;
        notas[4]=3;*/
              
        for(i=0; i<notas.length;i++){
            System.out.print("Ingrese nota: ");
            notas[i] = teclado.nextInt();
            System.out.println("Nota "+(i+1)+" de "+notas.length);
            //System.out.print(notas[i]+" ");
        }
        System.out.println("El array tiene "+notas.length+" elementos");
        System.out.println("Los elementos son: ");
        for(i=0; i<notas.length;i++){
            System.out.print(notas[i]+ " ");
        }
        System.out.println();
        
    }
}

