
package modelo;

import java.sql.Date;


public class PersonalSalud extends Persona{
    
    private Especialidad especialidad;

    public PersonalSalud() {
    }

    public PersonalSalud(Especialidad especialidad, String documento, String nombre, String direccion, String telefono, String genero, Date fechaNacimiento) {
        super(documento, nombre, direccion, telefono, genero, fechaNacimiento);
        this.especialidad = especialidad;
        Prueba prueba = new Prueba();
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
    
    
}
