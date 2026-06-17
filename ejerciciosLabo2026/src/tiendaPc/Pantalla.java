package tiendaPc;

public class Pantalla extends DispSalida{
    public Pantalla(String fabricante, String modelo, Float precioVenta, int stock, int cantPuertos) {
        super(fabricante, modelo, precioVenta, stock, cantPuertos);
    }


    public String impresion() {
        return "";
    }
}
