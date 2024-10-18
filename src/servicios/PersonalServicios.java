
package servicios;

import modelo.PersonalSalud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonalServicios {
    
    public void registrarPersonalSalud(PersonalSalud personal) throws SQLException{
      try{
         Connection conexion = Conexion.obtener();
         PreparedStatement consulta;
         consulta = conexion.prepareStatement("INSERT INTO personalsalud (documento, nombre, direccion, telefono, genero, fecha_nacimiento, especialidad, clinica) "
                 + "VALUES(?, ?, ?, ?, ?, ?, ?, ?)");        
         
         consulta.setString(1, personal.getDocumento());
         consulta.setString(2, personal.getNombre());
         consulta.setString(3, personal.getDireccion());
         consulta.setString(4, personal.getTelefono());
         consulta.setString(5, personal.getGenero());
         consulta.setDate(6, personal.getFechaNacimiento());
         consulta.setString(7, personal.getEspecialidad().toString());
         consulta.setString(8, personal.getClinica().getNombre());
         
         consulta.executeUpdate();
      }catch(SQLException ex){
         throw new SQLException(ex);
      } catch (ClassNotFoundException ex) {
            
        }
   }
}
