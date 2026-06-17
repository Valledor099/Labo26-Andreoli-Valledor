package edificio;

import java.time.Year;

public class Detector_humo extends Simple{

    public Detector_humo(boolean estado, int valor_umbral, Year anioAdquirido, float valoReal) {
        super(estado, valor_umbral, anioAdquirido, valoReal);
    }


    public float valor() {
        return 0;
    }

    public void dispararAlarma() {
        System.out.println("Llamando a los bomberos");
    }
}
