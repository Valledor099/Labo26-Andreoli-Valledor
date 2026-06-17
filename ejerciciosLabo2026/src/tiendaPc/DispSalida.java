package tiendaPc;

public abstract class DispSalida extends Dispositivos{

    public DispSalida(String fabricante, String modelo, Float precioVenta, int stock, int cantPuertos) {
        super(fabricante, modelo, precioVenta, stock, cantPuertos);
    }

    public int esSalida() {
        return 1;
    }

    public int esEntrada() {
        return 0;
    }

    public abstract String impresion();
}
