package edificio;

import java.time.Year;

public class Temperatura extends Sensor{
    public Temperatura(boolean estado, int valor_umbral) {
        super(estado, valor_umbral);
    }

    @Override
    public void dispararAlarma() {
        System.out.println("¡Cuidado!La temperatura sube");
    }
}
