
package modelo;

import java.sql.Date;

public class Paciente extends Persona{
    
    private LugarProcedencia lugarProcedencia;
    private Date fechaDeteccion;
    private Estado estado;
    private boolean casa;

    public Paciente() {
    }

    public Paciente(LugarProcedencia lugarProcedencia, Date fechaDeteccion, Estado estado, boolean casa) {
        this.lugarProcedencia = lugarProcedencia;
        this.fechaDeteccion = fechaDeteccion;
        this.estado = estado;
        this.casa = casa;
    }

    public Paciente(LugarProcedencia lugarProcedencia, Date fechaDeteccion, Estado estado, boolean casa, String documento, String nombre, String direccion, String telefono, String genero, Date fechaNacimiento) {
        super(documento, nombre, direccion, telefono, genero, fechaNacimiento);
        this.lugarProcedencia = lugarProcedencia;
        this.fechaDeteccion = fechaDeteccion;
        this.estado = estado;
        this.casa = casa;
    }

    public LugarProcedencia getLugarProcedencia() {
        return lugarProcedencia;
    }

    public void setLugarProcedencia(LugarProcedencia lugarProcedencia) {
        this.lugarProcedencia = lugarProcedencia;
    }

    public Date getFechaDeteccion() {
        return fechaDeteccion;
    }

    public void setFechaDeteccion(Date fechaDeteccion) {
        this.fechaDeteccion = fechaDeteccion;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public boolean isCasa() {
        return casa;
    }

    public void setCasa(boolean casa) {
        this.casa = casa;
    }

    
    
    
    
}
