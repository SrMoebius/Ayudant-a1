import java.util.Date;

public class Cita {

    private String nombreMascota;
    private String rutDueño;
    private String tipoConsulta;
    private Date fecha;

    //Constructor
    public Cita(String nombreMascota, String rutDueño, String tipoConsulta, Date fecha) {
        this.nombreMascota = nombreMascota;
        this.rutDueño = rutDueño;
        this.tipoConsulta = tipoConsulta;
        this.fecha = fecha;
    }

    //Metodo get y set

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getRutDueño() {
        return rutDueño;
    }

    public void setRutDueño(String rutDueño) {
        this.rutDueño = rutDueño;
    }

    public String getTipoConsulta() {
        return tipoConsulta;
    }

    public void setTipoConsulta(String tipoConsulta) {
        this.tipoConsulta = tipoConsulta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
