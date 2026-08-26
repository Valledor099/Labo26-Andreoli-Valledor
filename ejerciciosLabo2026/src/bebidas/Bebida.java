package bebidas;

public abstract class Bebida {
    private String nombre;
    private int coefNegativo;
    private int coefPositivo;

    public Bebida(String nombre, int coefNegativo, int coefPositivo) {
        this.nombre = nombre;
        this.coefNegativo = coefNegativo;
        this.coefPositivo = coefPositivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCoefNegativo() {
        return coefNegativo;
    }

    public void setCoefNegativo(int coefNegativo) {
        this.coefNegativo = coefNegativo;
    }

    public int getCoefPositivo() {
        return coefPositivo;
    }

    public void setCoefPositivo(int coefPositivo) {
        this.coefPositivo = coefPositivo;
    }

    public abstract int coeficienteHidratacion();
}
