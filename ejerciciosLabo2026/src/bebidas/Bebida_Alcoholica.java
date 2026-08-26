package bebidas;

public class Bebida_Alcoholica extends Bebida{
    private int cant_alcohol;

    public Bebida_Alcoholica(String nombre, int cant_alcohol){
        super(nombre,cant_alcohol*20,0);
    }


    @Override
    public int coeficienteHidratacion() {
        return getCoefPositivo()- getCoefNegativo();
    }
}
