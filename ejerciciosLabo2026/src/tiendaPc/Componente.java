package tiendaPc;

public abstract class Componente {
    private String fabricante;
    private String modelo;
    private Float precioVenta;
    private int stock;

    public Componente(String fabricante, String modelo, Float precioVenta, int stock) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.precioVenta = precioVenta;
        this.stock = stock;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Float getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Float precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public abstract int esCPU();

    public abstract int esSalida();

    public abstract int esEntrada();

    public abstract String impresion();
}
