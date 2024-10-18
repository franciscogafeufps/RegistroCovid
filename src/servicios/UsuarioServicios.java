
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
         consulta = conexion.prepareStatement("INSERT INTO producto (documento, nombre, telefono, genero, fechaNacimiento) "
                 + "VALUES(?, ?, ?,?)");        
         consulta.setString(1, paciente.getDocumento());
         consulta.setString(2, paciente.getNombre());
         consulta.setString(3, paciente.getTelefono());
         
         consulta.executeUpdate();
      }catch(SQLException ex){
         throw new SQLException(ex);
      } catch (ClassNotFoundException ex) {
            
        }
   }
    
}
