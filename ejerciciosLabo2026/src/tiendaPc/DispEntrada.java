package tiendaPc;

public abstract class DispEntrada extends Dispositivos{
    private String tipoConector;

    public DispEntrada(String fabricante, String modelo, Float precioVenta, int stock, int cantPuertos, String tipoConector) {
        super(fabricante, modelo, precioVenta, stock, cantPuertos);
        this.tipoConector = tipoConector;
    }

    public String getTipoConector() {
        return tipoConector;
    }

    public void setTipoConector(String tipoConector) {
        this.tipoConector = tipoConector;
    }


    public int esSalida() {
        return 0;
    }


    public int esEntrada() {
        return 1;
    }


    public String impresion() {
        return "";
    }
}
