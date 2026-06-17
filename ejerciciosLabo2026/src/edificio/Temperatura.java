package edificio;

import java.time.Year;

public class Temperatura extends Simple{

    public Temperatura(boolean estado, int valor_umbral, Year anioAdquirido, float valoReal) {
        super(estado, valor_umbral, anioAdquirido, valoReal);
    }


    public float valor() {
        return 0;
    }

    public void dispararAlarma() {
        System.out.println("¡Cuidado!La temperatura sube");
    }
}
