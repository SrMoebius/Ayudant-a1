public class Dueño {

    //Atributos
    private String nombre;
    private String apellido;
    private String N_identificacion;
    private int edad;


    //Constructor
    public Dueño(String nombre, String apellido, String n_identificacion, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        N_identificacion = n_identificacion;
        this.edad = edad;
    }


    //Metodo get
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getN_identificacion() {
        return N_identificacion;
    }

    public int getEdad() {
        return edad;
    }

    //Metodo set

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setN_identificacion(String n_identificacion) {
        N_identificacion = n_identificacion;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
