package tiendaPc;

public class Cpu extends Componente {

    public Cpu(String fabricante, String modelo, Float precioVenta, int stock) {
        super(fabricante, modelo, precioVenta, stock);
    }


    public int esCPU() {
        return 1;
    }


    public int esSalida() {
        return 0;
    }


    public int esEntrada() {
        return 0;
    }


    public String impresion() {
        return "";
    }
}
