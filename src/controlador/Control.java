
package controlador;

import servicios.UsuarioServicios;
import servicios.PersonalServicios;
import modelo.Paciente;
import modelo.PersonalSalud;
import modelo.LugarProcedencia;
import modelo.Estado;
import modelo.Especialidad;
import modelo.Clinica;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Control {
    
    private UsuarioServicios usuarioServicios;
    private PersonalServicios personalServicios;

    public Control() {
        usuarioServicios = new UsuarioServicios();
        personalServicios = new PersonalServicios();
    }

    public void registrarPaciente(String documento, String nombre, String direccion, String telefono,
                                  String genero, java.sql.Date fechaNacimiento, 
                                  String lugarProcedencia, java.sql.Date fechaDeteccion,
                                  String estado, boolean casa) {
        Paciente paciente = new Paciente();
        paciente.setDocumento(documento);
        paciente.setNombre(nombre);
        paciente.setDireccion(direccion);
        paciente.setTelefono(telefono);
        paciente.setGenero(genero);
        paciente.setFechaNacimiento(fechaNacimiento);
        paciente.setLugarProcedencia(LugarProcedencia.valueOf(lugarProcedencia.toUpperCase())); 
        paciente.setFechaDeteccion(fechaDeteccion);
        paciente.setEstado(Estado.valueOf(estado.toUpperCase())); 
        paciente.setCasa(casa);
        
        try {
            usuarioServicios.registrarPaciente(paciente);
            JOptionPane.showMessageDialog(null, "Paciente registrado con éxito.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar el paciente: " + e.getMessage());
        }
    }

    public void registrarPersonalSalud(String documento, String nombre, String direccion, String telefono,
                                        String genero, java.sql.Date fechaNacimiento,
                                        String especialidad, String clinicaNombre, String clinicaDireccion) {
        PersonalSalud personal = new PersonalSalud();
        personal.setDocumento(documento);
        personal.setNombre(nombre);
        personal.setDireccion(direccion);
        personal.setTelefono(telefono);
        personal.setGenero(genero);
        personal.setFechaNacimiento(fechaNacimiento);
        personal.setEspecialidad(Especialidad.valueOf(especialidad.toUpperCase())); 
        personal.setClinica(new Clinica(clinicaNombre, clinicaDireccion));
        
        try {
            personalServicios.registrarPersonalSalud(personal);
            JOptionPane.showMessageDialog(null, "Personal de salud registrado con éxito.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar el personal de salud: " + e.getMessage());
        }
    }
}
