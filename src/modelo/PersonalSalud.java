
package modelo;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;


public class PersonalSalud extends Persona{
    
    private Especialidad especialidad;
    private Clinica clinica;
    private List<Prueba> pruebas = new ArrayList<>();

    public PersonalSalud() {
    }

    public PersonalSalud(Especialidad especialidad, Clinica clinica, String documento, String nombre, String direccion, String telefono, String genero, Date fechaNacimiento, List<Paciente> contactos) {
        super(documento, nombre, direccion, telefono, genero, fechaNacimiento, contactos);
        this.especialidad = especialidad;
        this.clinica = clinica; 
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

        public Clinica getClinica() {
        return clinica;
    }

    public void setClinica(Clinica clinica) {
        this.clinica = clinica;
    }

    public List<Prueba> getPruebas() {
        return pruebas; 
    }

    public void setPruebas(List<Prueba> pruebas) {
        if (pruebas != null) {
            this.pruebas = pruebas; 
        }
    }

    public void addPrueba(Prueba prueba) {
        if (prueba != null) {
            this.pruebas.add(prueba); 
        }
    }    
}
