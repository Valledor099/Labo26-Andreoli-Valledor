package edificio;

import java.time.Year;

public class Detector_humo extends Sensor{
    public Detector_humo(boolean estado, int valoReal,  Year anioAdquirido) {
        super(estado, valoReal, 30, anioAdquirido);
    }

    @Override
    public void dispararAlarma() {
        System.out.println("Llamando a los bomberos");
    }
}
