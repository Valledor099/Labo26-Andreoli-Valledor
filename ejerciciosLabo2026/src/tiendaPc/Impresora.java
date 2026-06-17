package tiendaPc;

public class Impresora extends DispSalida{
    private Inyeccion_Laser metodo;

    public Impresora(String fabricante, String modelo, Float precioVenta, int stock, int cantPuertos, Inyeccion_Laser metodo) {
        super(fabricante, modelo, precioVenta, stock, cantPuertos);
        this.metodo = metodo;
    }

    public Inyeccion_Laser getMetodo() {
        return metodo;
    }

    public void setMetodo(Inyeccion_Laser metodo) {
        this.metodo = metodo;
    }


    public String impresion() {
        return metodo.name();
    }
}
