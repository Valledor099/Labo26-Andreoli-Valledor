package recetas;

import java.util.ArrayList;

public class Principal extends Plato{
    private int tiempoCoccion;
    private int nComensales;

    public Principal(String nombre, ArrayList<String> pasos, Nivel nivel, int tiempoCoccion, int nComensales) {
        super(nombre, pasos, nivel, Tipo.PRINCIPAL);
        this.tiempoCoccion = tiempoCoccion;
        this.nComensales = nComensales;
    }

    public int getTiempoCoccion() {
        return tiempoCoccion;
    }

    public void setTiempoCoccion(int tiempoCoccion) {
        this.tiempoCoccion = tiempoCoccion;
    }

    public int getnComensales() {
        return nComensales;
    }

    public void setnComensales(int nComensales) {
        this.nComensales = nComensales;
    }

    @Override
    public String mostrarPasos() {
        String texto = "Esta receta tarda en cocinarse: " + tiempoCoccion + " y los pasos son: "+ '\n';

        for (String paso : getPasos()){
            texto+="-" + paso + '\n';
        }

        return texto;
    }

    @Override
    public String toString() {
        return super.toString()  + "Comensales: " + nComensales + '\n';
    }
}
