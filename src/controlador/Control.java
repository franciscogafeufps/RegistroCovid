
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import servicios.UsuarioServicios;
import servicios.PersonalServicios;
import modelo.Paciente;
import modelo.PersonalSalud;
import modelo.LugarProcedencia;
import modelo.Especialidad;
import modelo.Clinica;
import vista.Vista;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import modelo.Estado;

public class Control implements ActionListener {
    
    private Paciente paciente;
    private PersonalSalud personalSalud;
    private Vista formulario;
    private UsuarioServicios us;
    private PersonalServicios ps;
    
     public Control(Paciente paciente, PersonalSalud personalSalud, Vista formulario, UsuarioServicios us, PersonalServicios ps) {
        this.paciente = paciente;
        this.personalSalud = personalSalud;
        this.formulario = formulario;
        this.us = us;
        this.ps = ps;
        
        this.formulario.btnRegistarPaciente.addActionListener(this);
        this.formulario.btnRegistarPersonal.addActionListener(this);
    }
     
    public void iniciar(){
        
        formulario.setTitle("Pacientes");
        formulario.setLocationRelativeTo(null);
               
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    if (e.getSource() == formulario.btnRegistarPaciente) {
        System.out.println("estoy guardando");

        // Obtener el valor de texto del campo txtNacimiento
        String fechaNacimientoTexto = formulario.txtFechaNacimiento.getText();
        String fechaPruebaTexto = formulario.txtFechaPrueba.getText();

        // Definir el formato de la fecha (ejemplo: "dd/MM/yyyy")
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formato2 = new SimpleDateFormat("dd/MM/yyyy");

        try {
            
            String nombreLugarProcedencia = formulario.txtLugarProcedencia.getText();
            LugarProcedencia lugarProcedencia = new LugarProcedencia();
            lugarProcedencia.setNombre(nombreLugarProcedencia);
            
            String estadoSeleccionado = formulario.cmbEstado.getSelectedItem().toString();
            Estado estado = Estado.valueOf(estadoSeleccionado.toUpperCase());
            
            
            
            // Convertir el texto a un objeto Date
            Date fechaNacimiento = formato.parse(fechaNacimientoTexto);
            Date fechaPrueba = formato2.parse(fechaPruebaTexto);
            
            
           
            paciente.setDocumento(formulario.txtDocuemento.getText());
            paciente.setNombre(formulario.txtNombre.getText());
            paciente.setDireccion(formulario.txtDireccion.getText());
            paciente.setTelefono(formulario.txtTelefono.getText());
            paciente.setGenero(formulario.txtGenero.getText());
            paciente.setFechaNacimiento((java.sql.Date) fechaNacimiento);
            paciente.setLugarProcedencia(lugarProcedencia);
            paciente.setFechaDeteccion((java.sql.Date) fechaPrueba);
            paciente.setEstado(estado);
            paciente.setCasa(formulario.txtLugarTratamiento.getText());

            
            us.registrarPaciente(paciente);

            JOptionPane.showMessageDialog(formulario, "Paciente registrado exitosamente");

        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(formulario, "Formato de fecha incorrecto. Use dd/MM/yyyy.", "Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(formulario, "Error al registrar paciente", "Error", JOptionPane.ERROR_MESSAGE);
        }
        }
    }
}