package colegios;

import java.util.ArrayList;

public class Materia {
    private String nombre;
    private ArrayList<String> contenidos;
    private ArrayList<Alumno> alumnos;

    public Materia(){
        this.nombre = "Lengua y Literatura";
        this.contenidos = new ArrayList<>();
        this.alumnos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getContenidos() {
        return contenidos;
    }

    public void setContenidos(ArrayList<String> contenidos) {
        this.contenidos = contenidos;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public void agregarMateria(Materia materia){

    }

    public float promedioEdad(){
        int edad;
        float edadProm;

        for (Alumno alumno : alumnos){

        }
    }
}
