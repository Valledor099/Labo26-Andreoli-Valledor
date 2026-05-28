package tiendaPc;

import humanos.Persona;

public class Compra {
    private Persona cliente;
    private Metodo metodo;
    private Computadora computadora;

    public Compra(Persona cliente, Metodo metodo, Computadora computadora) {
        this.cliente = cliente;
        this.metodo = metodo;
        this.computadora = computadora;
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


    public void chequearCompra(){
        //TODO: ver si la computadora tiene como minimo una CPU, un disp de entrada y uno de salida

    }

    public void agegarRecargo(){
        //TODO: revisar si es efectivo o deb_o_cred y agregarles el recargo
    }



}
