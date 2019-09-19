/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;
import java.util.Calendar;
import java.util.Date;
/**
 *
 * @author capacitacion14
 */
public class HorarioFuncion {
    //Atributos//
    private int diaDeSemana;
    private int duracionIntervalo;
    private int duracionPublicidad;
    private boolean esTrasnoche;
    private Date horaPrimeraFuncion;
    private Date horaUltimaFuncion;
    
    //Constructor por defecto//
    public HorarioFuncion(){
        
    }
    //Constructores//
    public HorarioFuncion(int diaDeSemana, int duracionIntervalo, int duracionPublicidad, boolean esTrasnoche, Date horaPrimeraFuncion, Date horaUltimaFuncion){
        this.diaDeSemana=diaDeSemana;
        this.duracionIntervalo=duracionIntervalo;
        this.duracionPublicidad=duracionPublicidad;
        this.esTrasnoche=esTrasnoche;
        this.horaPrimeraFuncion=horaPrimeraFuncion;
        this.horaUltimaFuncion=horaUltimaFuncion;
    }
    //Métodos//
    private String obtenerDescripcionDia(){
        //Convierte el día de la semana en español,utilizando la clase Calendar de Java
        String dia;
        switch(this.diaDeSemana){
            case Calendar.MONDAY:
                dia="Lunes";
                break;
            case Calendar.TUESDAY:
                dia="Martes";
                break;
            case Calendar.WEDNESDAY:
                dia="Miércoles";
                break;
            case Calendar.THURSDAY:
                dia="Jueves";
                break;
            case Calendar.FRIDAY:
                dia="Viernes";
                break;
            case Calendar.SATURDAY:
                dia="Sábado";
                break;
            case Calendar.SUNDAY:
                dia="Domingo";
                break;
            default:
                dia="No es un día";
        }
        return dia;   
    }
    //Setters & getters//
    public int getDiaDeSemana(){
        return diaDeSemana;
    }
    public void setDiaDeSemana(int diaDeSemana){
        this.diaDeSemana=diaDeSemana;
    }
    public int getDuracionIntervalo(){
        return duracionIntervalo;
    }
    public void setDuracionIntervalo(int duracionIntervalo){
        this.duracionIntervalo=duracionIntervalo;
    }
    public int getDuracionPublicidad (){
        return duracionPublicidad;
    }
    public void setDuracionPublicidad(int duracionPublicidad){
        this.duracionPublicidad=duracionPublicidad;
    }
    public boolean getEsTrasnoche(){
        return esTrasnoche;
    }
    public void setEsTrasnoche(boolean esTrasnoche){
        this.esTrasnoche=esTrasnoche;
     }
    public Date getHoraPrimeraFuncion(){
        return horaPrimeraFuncion;
    }
    public void setHoraPrimeraFuncion(Date horaPrimeraFuncion){
        this.horaPrimeraFuncion=horaPrimeraFuncion;
    }
    public Date getHoraUltimaFuncion(){
        return horaUltimaFuncion;
    }
    public void setHoraUltimaFuncion(Date horaUltimaFuncion){
        this.horaUltimaFuncion=horaUltimaFuncion;
    }
    //Devolvemos una cadena de texto indicando los horarios de las funciones
    @Override 
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("Los horarios para el dia: ").append(obtenerDescripcionDia()).append("son: ");
        sb.append("Duracion del intervalo: ").append(duracionIntervalo).append("\n");
        sb.append("Duracion de la publicidad: ").append(duracionPublicidad).append("\n");
        sb.append("Acepta Trasnoche: ").append(esTrasnoche).append("\n");
        sb.append("Horario Primera Funcion: ").append(horaPrimeraFuncion).append("\n");
        sb.append("Horario Ultima Funcion: ").append(horaUltimaFuncion).append("\n");
        return sb.toString();
    }
}

