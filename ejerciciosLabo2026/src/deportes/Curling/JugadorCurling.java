package deportes.Curling;

import deportes.Futbol.NoPuedeContratarseException;
import deportes.Futbol.NoPuedeRenovarseException;
import deportes.Jugador;

import java.time.LocalDate;

public class JugadorCurling extends Jugador {

    public JugadorCurling(String nombre, String apellido, LocalDate fecha_de_nacimiento, int numero_de_camiseta) {
        super(nombre, apellido, fecha_de_nacimiento, numero_de_camiseta);
    }

    @Override
    public void puedeContratarse() throws NoPuedeContratarseException {

    }

    @Override
    public void puedeRenovarse() throws NoPuedeRenovarseException {

    }

    @Override
    public String decirNombre() {
        return "";
    }

    @Override
    public String mostrarInfo() {
        return "";
    }
}
