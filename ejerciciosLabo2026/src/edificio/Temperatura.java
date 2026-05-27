package edificio;

import java.time.Year;

public class Temperatura extends Sensor{
    public Temperatura(boolean estado, int valoReal, Year anioAdquirido) {
        super(estado, valoReal, 28, anioAdquirido);
    }

    @Override
    public void dispararAlarma() {
        System.out.println("¡Cuidado!La temperatura sube");
    }
}
