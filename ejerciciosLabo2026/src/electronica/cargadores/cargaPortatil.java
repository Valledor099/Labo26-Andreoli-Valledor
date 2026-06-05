package electronica.cargadores;

import electronica.Producto;
import electronica.Seccion;

public class cargaPortatil extends Producto {
    private int cantCargas;

    public cargaPortatil(String nombre, Float precio, Seccion seccion, int stock, int cantCargas) {
        super(nombre, precio, Seccion.CARGADORES, stock);
        this.cantCargas = cantCargas;
    }

    public int getCantCargas() {
        return cantCargas;
    }

    public void setCantCargas(int cantCargas) {
        this.cantCargas = cantCargas;
    }
}
