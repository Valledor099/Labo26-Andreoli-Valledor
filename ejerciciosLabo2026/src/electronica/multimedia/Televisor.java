package electronica.multimedia;

import electronica.Producto;
import electronica.Seccion;

public class Televisor extends Producto {
    private Tecnologia tecnologia;
    private int resolucionPx;

    public Televisor(String nombre, Float precio, Seccion seccion, int stock, Tecnologia tecnologia, int resolucionPx) {
        super(nombre, precio, Seccion.MULTIMEDIA, stock);
        this.tecnologia = tecnologia;
        this.resolucionPx = resolucionPx;
    }

    public int getResolucionPx() {
        return resolucionPx;
    }

    public void setResolucionPx(int resolucionPx) {
        this.resolucionPx = resolucionPx;
    }

    public Tecnologia getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(Tecnologia tecnologia) {
        this.tecnologia = tecnologia;
    }
}
