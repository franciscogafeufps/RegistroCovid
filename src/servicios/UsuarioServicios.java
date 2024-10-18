
package servicios;

import modelo.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioServicios {
    
    public void registrarPaciente(Paciente paciente) throws SQLException{
      try{
         Connection conexion = Conexion.obtener();
         PreparedStatement consulta;
         consulta = conexion.prepareStatement("INSERT INTO paciente (documento, nombre, direccion, telefono, genero, fecha_nacimiento, lugar_procedencia, fecha_deteccion, estado, casa) "
                 + "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");        
         consulta.setString(1, paciente.getDocumento());
         consulta.setString(2, paciente.getNombre());
         consulta.setString(3, paciente.getDireccion());
         consulta.setString(4, paciente.getTelefono());
         consulta.setString(5, paciente.getGenero());
         consulta.setDate(6, paciente.getFechaNacimiento());
         consulta.setString(7, paciente.getLugarProcedencia().toString());
         consulta.setDate(8, paciente.getFechaDeteccion());
         consulta.setString(9, paciente.getEstado().toString());
         consulta.setBoolean(10, paciente.isCasa());
         
         consulta.executeUpdate();
      }catch(SQLException ex){
         throw new SQLException(ex);
      } catch (ClassNotFoundException ex) {
            
        }
   }
    
}
