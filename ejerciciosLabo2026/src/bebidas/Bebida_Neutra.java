package bebidas;

public class Bebida_Neutra extends Bebida{
    public Bebida_Neutra(String nombre, int coefNegativo, int coefPositivo) {
        super(nombre, coefNegativo, coefPositivo);
    }

    @Override
    public int coeficienteHidratacion() {
        return getCoefPositivo() - getCoefNegativo();
    }
}
