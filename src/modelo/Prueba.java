
package modelo;

import java.sql.Date;

public class Prueba {
    
    private Date fecha;
    private boolean positivo;

    public Prueba() {
    }

    public Prueba(Date fecha, boolean positivo) {
        this.fecha = fecha;
        this.positivo = positivo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean isPositivo() {
        return positivo;
    }

    public void setPositivo(boolean positivo) {
        this.positivo = positivo;
    }
    
    
}
