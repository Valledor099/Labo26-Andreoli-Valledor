package edificio;

import java.time.Year;

public class Detector_humo extends Sensor{
    public Detector_humo(boolean estado, int valor_umbral) {
        super(estado, valor_umbral);
    }

    @Override
    public void dispararAlarma() {
        System.out.println("Llamando a los bomberos");
    }
}
