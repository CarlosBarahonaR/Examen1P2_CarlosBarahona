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
public class Pelicula extends Servicio {
    
    private String nombre4;
    private String duracion;
    private String fechaEstrenoCine;
    private String fechaEstrenoStreaming;
    private String plot;

    public Pelicula(String nombre4, String duracion, String fechaEstrenoCine, String fechaEstrenoStreaming, String plot, String nombre, int precioMensual, String calificacion, String fechaLanzamiento, String empresaDueñaDelServicio, ArrayList productos) {
        super(nombre, precioMensual, calificacion, fechaLanzamiento, empresaDueñaDelServicio, productos);
        this.nombre4 = nombre4;
        this.duracion = duracion;
        this.fechaEstrenoCine = fechaEstrenoCine;
        this.fechaEstrenoStreaming = fechaEstrenoStreaming;
        this.plot = plot;
    }

    public String getNombre4() {
        return nombre4;
    }

    public void setNombre4(String nombre4) {
        this.nombre4 = nombre4;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getFechaEstrenoCine() {
        return fechaEstrenoCine;
    }

    public void setFechaEstrenoCine(String fechaEstrenoCine) {
        this.fechaEstrenoCine = fechaEstrenoCine;
    }

    public String getFechaEstrenoStreaming() {
        return fechaEstrenoStreaming;
    }

    public void setFechaEstrenoStreaming(String fechaEstrenoStreaming) {
        this.fechaEstrenoStreaming = fechaEstrenoStreaming;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "nombre4=" + nombre4 + ", duracion=" + duracion + ", fechaEstrenoCine=" + fechaEstrenoCine + ", fechaEstrenoStreaming=" + fechaEstrenoStreaming + ", plot=" + plot + '}';
    }
    
    
    
}
