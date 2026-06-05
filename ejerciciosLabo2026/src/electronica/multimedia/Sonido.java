package electronica.multimedia;

import electronica.Producto;
import electronica.Seccion;

public class Sonido extends Producto {
    private Boolean bluetooth;

    public Sonido(String nombre, Float precio, Seccion seccion, int stock, Boolean bluetooth) {
        super(nombre, precio, Seccion.MULTIMEDIA, stock);
        this.bluetooth = bluetooth;
    }

    public Boolean getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(Boolean bluetooth) {
        this.bluetooth = bluetooth;
    }
}
