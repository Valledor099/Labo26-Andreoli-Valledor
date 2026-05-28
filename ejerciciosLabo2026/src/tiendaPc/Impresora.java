package tiendaPc;

public class Impresora extends DispSalida{
    private String metodo;

    public Impresora(String fabricante, String modelo, Float precioVenta, int stock, int cantPuertos, String metodo) {
        super(fabricante, modelo, precioVenta, stock, cantPuertos);
        this.metodo = metodo;
    }
}
