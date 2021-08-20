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
public class Miniseries extends Servicio {
    
    private String nombre3;
    private int cantTemporadas;
    private String genero;
    private int duracionPromedioCapitulo;
    private String descripcionBreve;

    public Miniseries(String nombre3, int cantTemporadas, String genero, int duracionPromedioCapitulo, String descripcionBreve, String nombre, int precioMensual, String calificacion, String fechaLanzamiento, String empresaDueñaDelServicio, ArrayList productos) {
        super(nombre, precioMensual, calificacion, fechaLanzamiento, empresaDueñaDelServicio, productos);
        this.nombre3 = nombre3;
        this.cantTemporadas = cantTemporadas;
        this.genero = genero;
        this.duracionPromedioCapitulo = duracionPromedioCapitulo;
        this.descripcionBreve = descripcionBreve;
    }

    
    
    public String getNombre3() {
        return nombre3;
    }

    public void setNombre3(String nombre3) {
        this.nombre3 = nombre3;
    }

    public int getCantTemporadas() {
        return cantTemporadas;
    }

    public void setCantTemporadas(int cantTemporadas) {
        this.cantTemporadas = cantTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracionPromedioCapitulo() {
        return duracionPromedioCapitulo;
    }

    public void setDuracionPromedioCapitulo(int duracionPromedioCapitulo) {
        this.duracionPromedioCapitulo = duracionPromedioCapitulo;
    }

    public String getDescripcionBreve() {
        return descripcionBreve;
    }

    public void setDescripcionBreve(String descripcionBreve) {
        this.descripcionBreve = descripcionBreve;
    }

    @Override
    public String toString() {
        return "Miniseries{" + "nombre3=" + nombre3 + ", cantTemporadas=" + cantTemporadas + ", genero=" + genero + ", duracionPromedioCapitulo=" + duracionPromedioCapitulo + ", descripcionBreve=" + descripcionBreve + '}';
    }
    
    
    
    
}
