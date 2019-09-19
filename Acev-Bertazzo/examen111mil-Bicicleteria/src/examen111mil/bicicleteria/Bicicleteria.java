/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen111mil.bicicleteria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author capacitacion14
 */
public class Bicicleteria {
    private List<Bicicleta> bicicletas;
    private float ganancias;
    private Integer cantidadDeVentas;
    
    public Bicicleteria(){
        
    }
    public Bicicleteria(List<Bicicleta> bicicletas,float ganancias, Integer cantidadDeVentas){
        this.bicicletas=bicicletas;
        this.ganancias=ganancias;
        this.cantidadDeVentas=cantidadDeVentas;
        
        bicicletas= new ArrayList<Bicicleta>();
        cantidadDeVentas=0;
        ganancias=0;
    }
    public void addBicicleta(Bicicleta nuevaBici){
       // Scanner teclado = new Scanner(System.in);
        //System.out.println("Ingrese N° de Serie de la bici: ");
        //inNumDeSerie=teclado.next();
       // Bicicleta 
        this.bicicletas.add(nuevaBici);
    }
    public void venderBicicleta(Bicicleta bicicleta){
        
        this.bicicletas.remove(bicicleta);
        
    }
    public Bicicleta buscarBicicleta(String nroDeSerie){
        for(Bicicleta bici : bicicletas){
            if(bici.getNroDeSerie().equals(nroDeSerie))
                return bici;
        }
            return null;
        }
      }
