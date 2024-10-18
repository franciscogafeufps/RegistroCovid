
package modelo;

import java.util.ArrayList;
import java.util.List;

public class Clinica {
    
    private String nombre;
    private String direccion;
    private List<PersonalSalud> personal = new ArrayList<>();
    private List<Paciente> pacientes = new ArrayList<>();

    public Clinica() {
    }

    public Clinica(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public List<PersonalSalud> getPersonal() {
        return personal; 
    }

    public void setPersonal(List<PersonalSalud> personal) {
        if (personal != null) {
            this.personal = personal; 
        }
    }

    public List<Paciente> getPacientes() {
        return pacientes; 
    }

    public void setPacientes(List<Paciente> pacientes) {
        if (pacientes != null) {
            this.pacientes = pacientes;
        }
    }
}
