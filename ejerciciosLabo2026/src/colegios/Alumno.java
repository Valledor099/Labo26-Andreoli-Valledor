package colegios;

import java.time.LocalDate;
import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private String apellido;
    private LocalDate fecha_de_nacimiento;
    private ArrayList<Float> notas;
    private ArrayList<Materia> materias;

public Alumno(){
    this.nombre = "ricky";
    this.apellido = "ciaschini";
    this.fecha_de_nacimiento = LocalDate.of(2009,4,16);
    this.notas= new ArrayList<>();
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFecha_de_nacimiento() {
        return fecha_de_nacimiento;
    }

    public void setFecha_de_nacimiento(LocalDate fecha_de_nacimiento) {
        this.fecha_de_nacimiento = fecha_de_nacimiento;
    }

    public ArrayList<Float> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Float> notas) {
        this.notas = notas;
    }

    public void agregarNota(float nota){
    this.notas.add(nota);
    }

    public float menorNota(){
    float aux = notas.get(0);
    for(Float nota : notas){
        if(aux > nota){
            aux = nota;
        }
    }
    return aux;
    }

    public float mayorNota(){
    float aux1 = notas.get(0);
    for(float nota : notas){
        if(aux1 < nota){
            aux1=nota;
        }
    }
    return aux1;
    }

    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        alumno.agregarNota(1);
        alumno.agregarNota((float) 6.5);
        alumno.agregarNota(10);
        System.out.println(alumno.menorNota());
        System.out.println(alumno.mayorNota());
    }

}
