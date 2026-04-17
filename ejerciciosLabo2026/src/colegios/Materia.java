package colegios;

import java.time.LocalDate;
import java.util.ArrayList;

public class Materia {
    private String nombre;
    private ArrayList<String> contenidos;
    private ArrayList<Alumno> alumnos;

    public Materia(String nombre, ArrayList<String>contenidos, ArrayList<Alumno> alumnos){
        this.nombre = nombre;
        this.contenidos = contenidos;
        this.alumnos = alumnos;
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

    public float promedioEdad(){
        int edad=0;
        float edadProm;

        for (Alumno alumno : alumnos){
            edad += (LocalDate.now().getYear() - alumno.getFecha_de_nacimiento().getYear());
        }

        edadProm = (float) edad / this.alumnos.size();
        return  edadProm;
    }

    public void agregarAlumno(Alumno alumno){
        boolean inscripto = true;

        for (Alumno alumno1 : this.alumnos){
            if (alumno1.equals(alumno) ){
                inscripto = false;
            }
        }
        if (inscripto) {
            this.alumnos.add(alumno);
            alumno.inscribir(this);
        }
    }

    public void agregarContenido(String contenido){
        this.contenidos.add(contenido);
    }

    public void listaAlumnos(){
        for(Alumno alumno : alumnos){
            System.out.println(alumno.getNombre() + " " + alumno.getApellido());
        }
    }

    public static void main(String[] args) {
        Materia materia = new Materia("matematica", new ArrayList<>(), new ArrayList<>());
        Alumno alumno = new Alumno();
        materia.agregarContenido("sucesiones");
        materia.agregarAlumno(alumno);
        System.out.println(materia.promedioEdad());
    }


}
