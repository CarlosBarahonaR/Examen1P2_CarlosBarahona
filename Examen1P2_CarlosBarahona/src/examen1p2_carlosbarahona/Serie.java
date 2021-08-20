/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_carlosbarahona;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Serie extends Servicio {
    
    private String nombre2;
    private int cantTemporadas;
    private String clasificacionEdad;
    private int añoEstreno;
    private int cantActoresInvolucrados;
    
    public Serie(String nombre2, int cantTemporadas, String clasificacionEdad, int añoEstreno, int cantActoresInvolucrados) {
       
        this.nombre2 = nombre2;
        this.cantTemporadas = cantTemporadas;
        this.clasificacionEdad = clasificacionEdad;
        this.añoEstreno = añoEstreno;
        this.cantActoresInvolucrados = cantActoresInvolucrados;
    }

    public Serie(String nombre2, int cantTemporadas, String clasificacionEdad, int añoEstreno, int cantActoresInvolucrados, String nombre, int precioMensual, String calificacion, String fechaLanzamiento, String empresaDueñaDelServicio, ArrayList productos) {
        super(nombre, precioMensual, calificacion, fechaLanzamiento, empresaDueñaDelServicio, productos);
        this.nombre2 = nombre2;
        this.cantTemporadas = cantTemporadas;
        this.clasificacionEdad = clasificacionEdad;
        this.añoEstreno = añoEstreno;
        this.cantActoresInvolucrados = cantActoresInvolucrados;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre) {
        this.nombre2 = nombre;
    }

    public int getCantTemporadas() {
        return cantTemporadas;
    }

    public void setCantTemporadas(int cantTemporadas) {
        this.cantTemporadas = cantTemporadas;
    }

    public String getClasificacionEdad() {
        return clasificacionEdad;
    }

    public void setClasificacionEdad(String clasificacionEdad) {
        this.clasificacionEdad = clasificacionEdad;
    }

    public int getAñoEstreno() {
        return añoEstreno;
    }

    public void setAñoEstreno(int añoEstreno) {
        this.añoEstreno = añoEstreno;
    }

    public int getCantActoresInvolucrados() {
        return cantActoresInvolucrados;
    }

    public void setCantActoresInvolucrados(int cantActoresInvolucrados) {
        this.cantActoresInvolucrados = cantActoresInvolucrados;
    }

    @Override
    public String toString() {
        return nombre2;
    }
    
    
    
}
