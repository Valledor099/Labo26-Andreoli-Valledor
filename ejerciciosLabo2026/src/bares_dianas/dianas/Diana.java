package bares_dianas.dianas;

import java.util.HashMap;

public abstract class Diana {
    private String nombre, nivel_dificultad;
    private HashMap<Integer, Color> puntajes_color;


    public Diana(String nombre, String nivel_dificultad) {
        this.nombre = nombre;
        this.nivel_dificultad = nivel_dificultad;
        this.puntajes_color = new HashMap<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNivel_dificultad() {
        return nivel_dificultad;
    }

    public void setNivel_dificultad(String nivel_dificultad) {
        this.nivel_dificultad = nivel_dificultad;
    }

    public HashMap<Integer, Color> getPuntajes_color() {
        return puntajes_color;
    }

    public void setPuntajes_color(HashMap<Integer, Color> puntajes_color) {
        this.puntajes_color = puntajes_color;
    }

    public abstract double calcularArea();

    public void agregarPuntajeColor(int puntaje, Color color){
        puntajes_color.put(puntaje,color);
    }

    @Override
    public String toString() {
        return  "nombre='" + nombre + '\'' +
                ", nivel_dificultad='" + nivel_dificultad + '\'' +
                ", puntajes_color=" + puntajes_color;
    }
}
