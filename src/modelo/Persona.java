
package modelo;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Persona {
    
    private String documento;
    private String nombre;
    private String direccion;
    private String telefono;
    private String genero;
    private Date fechaNacimiento;
    private List<Paciente> contactos = new ArrayList<>();

    public Persona() {
    }

    public Persona(String documento, String nombre, String direccion, String telefono, String genero, Date fechaNacimiento, List<Paciente> contactos) {
        this.documento = documento;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        if (contactos != null) {
            this.contactos = contactos;
        }
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public List<Paciente> getContactos() {
        return contactos;
    }

    public void setContactos(Paciente contactos) {
        this.contactos.add(contactos);
    }
    
    public void addContacto(Paciente contacto) {
        this.contactos.add(contacto); // Agrega un contacto a la lista
    }
   
    public void setContactos(List<Paciente> contactos) {
        this.contactos = contactos; // Reemplaza la lista de contactos
    }
        
}
