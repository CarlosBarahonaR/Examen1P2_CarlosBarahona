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
public class Usuario {
    private String usuario;
    private String contraseña;
    private String nombre;
    private String apellido;
    private String correoElectronico;
    private String numeroTelefono;
    private String tipoPlan;
    private ArrayList ServiciosSuscritos;

    public Usuario(String usuario, String contraseña, String nombre, String apellido, String correoElectronico, String numeroTelefono, String tipoPlan, ArrayList ServiciosSuscritos) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correoElectronico = correoElectronico;
        this.numeroTelefono = numeroTelefono;
        this.tipoPlan = tipoPlan;
        this.ServiciosSuscritos = ServiciosSuscritos;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getTipoPlan() {
        return tipoPlan;
    }

    public void setTipoPlan(String tipoPlan) {
        this.tipoPlan = tipoPlan;
    }

    public ArrayList getServiciosSuscritos() {
        return ServiciosSuscritos;
    }

    public void setServiciosSuscritos(ArrayList ServiciosSuscritos) {
        this.ServiciosSuscritos = ServiciosSuscritos;
    }

    @Override
    public String toString() {
        return "Usuario{" + "usuario=" + usuario + ", contrase\u00f1a=" + contraseña + ", nombre=" + nombre + ", apellido=" + apellido + ", correoElectronico=" + correoElectronico + ", numeroTelefono=" + numeroTelefono + ", tipoPlan=" + tipoPlan + ", ServiciosSuscritos=" + ServiciosSuscritos + '}';
    }
    
    
}
