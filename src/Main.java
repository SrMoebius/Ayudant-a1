import ucn.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {


    Dueño dueño1 = new Dueño("Rodrigo", "aguilera", "12345678-9", 19);

    Mascota mastoca1 = new Mascota("michi", "gato", 24, "mixto", dueño1.getN_identificacion());

    Cita cita1 = new Cita(mastoca1.getNombre(), dueño1.getN_identificacion(), "cirugía", new Date());

    StdOut.println(cita1.getNombreMascota());
    StdOut.println(cita1.getRutDueño());
    StdOut.println(cita1.getTipoConsulta());
    StdOut.println(cita1.getFecha());


    }
}