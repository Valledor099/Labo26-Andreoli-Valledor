package tiendaPc;

public class Dispositivos extends Componente {
    private int cantPuertos;

    public Dispositivos(String fabricante, String modelo, Float precioVenta, int stock, int cantPuertos) {
        super(fabricante, modelo, precioVenta, stock);
        this.cantPuertos = cantPuertos;
    }

    public int getCantPuertos() {
        return cantPuertos;
    }

    public void setCantPuertos(int cantPuertos) {
        this.cantPuertos = cantPuertos;
    }


}
