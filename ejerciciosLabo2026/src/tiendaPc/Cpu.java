package tiendaPc;

public class Cpu extends Hardware{

    public Cpu(String fabricante, String modelo, Float precioVenta, int stock) {
        super(fabricante, modelo, precioVenta, stock);
    }

    @Override
    public boolean esCPU() {
        return true;
    }
}
