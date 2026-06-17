package edificio;

import java.time.Year;

public class Presion extends Simple{
    public Presion(boolean estado, float valoReal, Year anioAdquirido) {
        super(estado, 30, anioAdquirido, valoReal);
    }


    public float valor() {
        return 0;
    }

    public void dispararAlarma() {
        System.out.println("Sensor de presion activado");
    }
}
