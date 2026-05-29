package tiendaPc;

public class DispSalida extends Dispositivos{

    public DispSalida(String fabricante, String modelo, Float precioVenta, int stock, int cantPuertos) {
        super(fabricante, modelo, precioVenta, stock, cantPuertos);
    }

    @Override
    public boolean esSalida() {
        return true;
    }
}
