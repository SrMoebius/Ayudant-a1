public class Mascota {

    //Atributos
    private String nombre;
    private String especie;
    private int edad;
    private String raza;
    private String rutDueño;

    //Constructor
    public Mascota(String nombre, String especie, int edad, String raza, String rutDueño) {

        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.raza = raza;
        this.rutDueño = rutDueño;

    }

    //Metodo get
    public String getNombre() { return this.nombre; }
    public String getEspecie() { return this.especie; }
    public int getEdad() { return this.edad; }


    //Metodo set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
