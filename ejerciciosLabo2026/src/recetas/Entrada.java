package recetas;

import java.util.ArrayList;

public class Entrada extends Plato{
    private Boolean frio;

    public Entrada(String nombre, ArrayList<String> pasos, Nivel nivel, Boolean frio) {
        super(nombre, pasos, nivel);
        this.frio = frio;
    }

    public Boolean getFrio() {
        return frio;
    }

    public void setTipo(Boolean tipo) {
        this.frio = tipo;
    }

    @Override
    public Tipo getTipo() {
        return Tipo.ENTRADA;
    }

    @Override
    public String mostrarPasos() {
        String texto= "";

        for (String paso : getPasos()){
            texto += "-" + paso + '\n';
        }

        if (frio){
            texto=texto + "guardar la preparacion en la heladera";
        }
        else {
            texto= "Recorda prender el horno" + texto;
        }

        return texto;
    }

    @Override
    public String toString() {
        return super.toString() + "Frio: " + frio + '\n';
    }
}
