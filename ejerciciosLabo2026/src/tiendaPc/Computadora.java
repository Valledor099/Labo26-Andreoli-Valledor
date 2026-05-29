package tiendaPc;

import java.util.ArrayList;

public class Computadora {
    private ArrayList<Componente>componentes;
    private float precioTot;

    public Computadora() {
        this.componentes = new ArrayList<>();
        this.precioTot = 0;
    }

    public ArrayList<Componente> getComponentes() {
        return componentes;
    }

    public void setComponentes(ArrayList<Componente> componentes) {
        this.componentes = componentes;
    }

    public float getPrecioTot() {
        return precioTot;
    }

    public void setPrecioTot(float precioTot) {
        this.precioTot = precioTot;
    }

    public void aniadirComponente(Componente componente){
        componentes.add(componente);
        this.precioTot = calcularPrecio();
    }

    public float calcularPrecio(){
        float total = 0;

        for(Componente componente : componentes){
            total += componente.getPrecioVenta();
        }

        return total;

    }

    public boolean computadoraValida(){
        int cantCPU = 0;
        int cantEntrada = 0;
        int cantSalida = 0;

        for (Componente componente : componentes){

                cantCPU+=componente.esCPU();


                cantEntrada+=componente.esEntrada();


                cantSalida+=componente.esSalida();

        }

        if (cantCPU>0 && cantEntrada>0 && cantSalida>0){
            return true;
        }
        else {
            return false;
        }
    }

    public String detalleComponentes(){
        String detalle = "";

        for (Componente componente : componentes){
            detalle += "- " + componente.getModelo() + " " + componente.getPrecioVenta() + '\n';
        }

        return detalle;
    }

    public String contarDispositivos(){
        int cantEntrada = 0;
        int cantSalida = 0;

        for(Componente componente : componentes){
                cantSalida+=componente.esSalida();
                cantEntrada+=componente.esEntrada();

        }

        return "Salida: " + cantSalida + '\n'
                + "Entrada: " + cantEntrada;
    }

}
