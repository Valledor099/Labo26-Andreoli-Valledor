package edificio;

import java.time.Year;

public abstract class Sensor {
    private boolean estado;
    private int valor_umbral;

    public Sensor(boolean estado, int valor_umbral) {
        this.estado = estado;
        this.valor_umbral = valor_umbral;
    }

    public int getValor_umbral() {
        return valor_umbral;
    }

    public void setValor_umbral(int valor_umbral) {
        this.valor_umbral = valor_umbral;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public abstract float valor();

    public abstract void dispararAlarma();

}
