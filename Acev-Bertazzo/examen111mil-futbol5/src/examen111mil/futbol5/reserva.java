/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen111mil.futbol5;
import java.util.Date;
/**
 *
 * @author capacitacion14
 */
public class reserva {
    //Atributos//
    private Date fechaReserva;
    private Equipo equipo1,equipo2;
    
//Constructor por defecto//
    public reserva(){
        
    }
 //Constructores//
    public reserva(Date dReserva, Equipo dequipo1, Equipo dequipo2){
        this.fechaReserva=dReserva;
        this.equipo1=dequipo1;
        this.equipo2=dequipo2;
    }
    
//Setters & getters/
public Date getFechaReserva(){
    return fechaReserva;
}    
public void setFechaReserva(Date fecha) {
    this.fechaReserva=fecha;
}
public Equipo getEquipo1(){
    return equipo1;
}
public void setEquipo1(Equipo e1){
    this.equipo1=e1;
}
public Equipo getEquipo2(){
    return equipo2;
}
public void setEquipo2(Equipo e2){
    this.equipo2=e2;
}

}
