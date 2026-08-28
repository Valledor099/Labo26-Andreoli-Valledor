package bebidas;

public class Bebida_Azucarada extends Bebida{
    private int cantidad_azucar;

    public Bebida_Azucarada(String nombre,int cantidad_azucar) {
        super(nombre, cantidad_azucar*10, 1);
        this.cantidad_azucar = cantidad_azucar;
    }


}
