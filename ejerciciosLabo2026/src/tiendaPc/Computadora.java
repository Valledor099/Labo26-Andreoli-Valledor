package tiendaPc;

import java.util.ArrayList;

public class Computadora {
    private ArrayList<Componente>componentes;
    private int precioTot;

    public Computadora(ArrayList<Componente> componentes, int precioTot) {
        this.componentes = componentes;
        this.precioTot = precioTot;
    }

    public ArrayList<Componente> getComponentes() {
        return componentes;
    }

    public void setComponentes(ArrayList<Componente> componentes) {
        this.componentes = componentes;
    }

    public int getPrecioTot() {
        return precioTot;
    }

    public void setPrecioTot(int precioTot) {
        this.precioTot = precioTot;
    }

    public void aniadirComponente(){
        //TODO: agregar componente al arraylist
    }

    public void calcularPrecio(){
        //TODO: calcular precio total
    }
}
