package control_peso_altura;

import java.time.LocalDate;
import java.util.HashMap;

public class Persona extends humanos.Persona {
    private HashMap<LocalDate,Medicion> mediciones;

    public Persona(String nombre, String apellido, LocalDate fecha_de_nacimiento) {
        super(nombre, apellido, fecha_de_nacimiento);
        this.mediciones = new HashMap<>();
    }

    public HashMap<LocalDate, Medicion> getMediciones() {
        return mediciones;
    }

    public void setMediciones(HashMap<LocalDate, Medicion> mediciones) {
        this.mediciones = mediciones;
    }

    public void registrar(Medicion medicion, LocalDate fecha){
        mediciones.put(fecha,medicion);
    }
}
