package tiendaPc;

import humanos.Persona;

public class Compra {
    private Persona cliente;
    private Metodo metodo;
    private Computadora computadora;
    private Float precio;

    public Compra(Persona cliente, Metodo metodo, Computadora computadora) {
        this.cliente = cliente;
        this.metodo = metodo;
        this.computadora = computadora;
        this.precio = agegarRecargo();

    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    public Metodo getMetodo() {
        return metodo;
    }

    public void setMetodo(Metodo metodo) {
        this.metodo = metodo;
    }


    public float agegarRecargo(){
        float recargo = computadora.getPrecioTot() * metodo.recargo();

        return computadora.getPrecioTot() + recargo;
    }

    public String detalleCompra(){
        return "Cliente: " + cliente.mostrarDetalle() + '\n'
                +"Metodo de Pago: " + metodo.metodo()
                + "--Componentes PC --" + '\n'
                + computadora.detalleComponentes()
                + "-------------------" + '\n'
                + "Subtotal: $" + computadora.calcularPrecio() + '\n'
                + "Recargo: " + (metodo.recargo() * 100) + "%" + '\n'
                + "Total: $" + precio + '\n';
    }



}
