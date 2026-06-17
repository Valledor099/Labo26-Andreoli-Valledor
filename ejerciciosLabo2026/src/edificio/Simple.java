package edificio;

import java.time.Year;

public abstract class Simple extends Sensor{
    private Year anioAdquirido;
    private float valoReal;

    public Simple(boolean estado, int valor_umbral, Year anioAdquirido, float valoReal) {
        super(estado, valor_umbral);
        this.anioAdquirido = anioAdquirido;
        this.valoReal = valoReal;
    }

    public Year getAnioAdquirido() {
        return anioAdquirido;
    }

    public void setAnioAdquirido(Year anioAdquirido) {
        this.anioAdquirido = anioAdquirido;
    }

    public float getValoReal() {
        return valoReal;
    }


    public abstract float valor();


    public abstract void dispararAlarma();

    public void setValoReal(float valoReal) {
        this.valoReal = valoReal;
    }
}
