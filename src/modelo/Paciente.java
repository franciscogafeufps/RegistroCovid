
package modelo;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Paciente extends Persona{
    
    private LugarProcedencia lugarProcedencia;
    private Date fechaDeteccion;
    private Estado estado;
    private boolean casa;
    private List<Persona> relacion = new ArrayList<>();
    private Clinica clinica;

    public Paciente() {
    }

    public Paciente(LugarProcedencia lugarProcedencia, Date fechaDeteccion, Estado estado, boolean casa,
                    String documento, String nombre, String direccion, String telefono, String genero, Date fechaNacimiento,
                    List<Persona> relacion, List<Paciente> contactos) {

        super(documento, nombre, direccion, telefono, genero, fechaNacimiento, contactos);
        this.lugarProcedencia = lugarProcedencia;
        this.fechaDeteccion = fechaDeteccion;
        this.estado = estado;
        this.casa = casa;

        if (relacion != null) {
            this.relacion = relacion; 
        }
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

    public boolean getCasa() {
        return casa;
    }

    public void setCasa(boolean casa) {
        this.casa = casa;
    }

    public List<Persona> getRelacion() {
        return relacion;
    }

    public void setRelacion(Persona[] relacion) {
        if (relacion != null) {
            this.relacion.clear(); 
            for (Persona persona : relacion) {
                this.relacion.add(persona);
            }
        }
    }

    public void addContacto(Paciente contacto) {
        if (contacto != null) {
            super.addContacto(contacto); 
        }
    }

    public Clinica getClinica() {
        return clinica;
    }

    public void setClinica(Clinica clinica) {
        this.clinica = clinica; 
    }
}
