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
public class UsuarioPassword {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        String usuarioDB = "fede";
        String passwordDB = "123";
        
        System.out.println("Ingrese su usuario: ");
        String usuario = teclado.next();
        
        System.out.println("Ingrese su password: ");
        String password = teclado.next();
        
        if (usuario.equals(usuarioDB) && password.equals(passwordDB)){
            System.out.println("Ingresaste correctamente!");
        }else{
            System.out.println("Usuario y contraseña incorrectas!");
        }
    }
}
