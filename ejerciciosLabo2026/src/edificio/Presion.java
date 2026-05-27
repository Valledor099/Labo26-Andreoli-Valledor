package edificio;

import java.time.Year;

public class Presion extends Sensor{
    public Presion(boolean estado, int valoReal, Year anioAdquirido) {
        super(estado, valoReal, 11, anioAdquirido);
    }

    @Override
    public void dispararAlarma() {
        System.out.println("Sensor de presion activado");
    }
}
