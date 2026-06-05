package electronica;

public class Producto {
    private String nombre;
    private Float precio;
    private Seccion seccion;
    private int stock;

    public Producto(String nombre, Float precio, Seccion seccion, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.seccion = seccion;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Seccion getSeccion() {
        return seccion;
    }

    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }

    public String detalle(){
        return "Nombre: " + nombre + '\n' +
                "Precio: " + precio + '\n' +
                "Stock: " + stock + '\n';
    }
}
