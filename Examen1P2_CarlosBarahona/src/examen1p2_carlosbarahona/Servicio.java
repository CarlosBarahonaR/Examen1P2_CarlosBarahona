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
public class Servicio {
    
   public String nombre;
   public int precioMensual;
   public String calificacion;
   public String fechaLanzamiento;
   public  String empresaDueñaDelServicio;
   public ArrayList productos;

    public Servicio() {
    }
   
   

    public Servicio(String nombre, int precioMensual, String calificacion, String fechaLanzamiento, String empresaDueñaDelServicio, ArrayList productos) {
        this.nombre = nombre;
        this.precioMensual = precioMensual;
        this.calificacion = calificacion;
        this.fechaLanzamiento = fechaLanzamiento;
        this.empresaDueñaDelServicio = empresaDueñaDelServicio;
        this.productos = productos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecioMensual() {
        return precioMensual;
    }

    public void setPrecioMensual(int precioMensual) {
        this.precioMensual = precioMensual;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public String getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(String fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public String getEmpresaDueñaDelServicio() {
        return empresaDueñaDelServicio;
    }

    public void setEmpresaDueñaDelServicio(String empresaDueñaDelServicio) {
        this.empresaDueñaDelServicio = empresaDueñaDelServicio;
    }

    public ArrayList getProductos() {
        return productos;
    }

    public void setProductos(ArrayList productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
