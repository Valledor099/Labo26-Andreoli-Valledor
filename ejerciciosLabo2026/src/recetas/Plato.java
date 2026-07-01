package recetas;

import java.util.ArrayList;

public abstract class Plato {
    private String nombre;
    private ArrayList<String>pasos;
    private Nivel nivel;


    public Plato(String nombre, ArrayList<String> pasos, Nivel nivel) {
        this.nombre = nombre;
        this.pasos = pasos;
        this.nivel = nivel;

    }

    abstract public Tipo getTipo();



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getPasos() {
        return pasos;
    }

    public void setPasos(ArrayList<String> pasos) {
        this.pasos = pasos;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    abstract public String mostrarPasos();

    @Override
    public String toString() {
        return  nombre + '\n'
                + mostrarPasos()
                + nivel + '\n';
    }
}
