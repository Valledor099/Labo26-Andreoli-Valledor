package colegios;

import humanos.Persona;

import java.time.LocalDate;
import java.util.ArrayList;

public class Alumno extends Persona {
    private ArrayList<Float> notas;
    private ArrayList<Materia> materias;

public Alumno(){
    super("ricky","ciaschini",LocalDate.of(2009,4,16));
    this.notas= new ArrayList<>();
    this.materias = new ArrayList<>();
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
        float aux;

        if (this.notas == null){
            aux = 0;
        }

        else {
         aux = notas.getFirst(); /*es lo mismo que notas.get(0)*/

        for(Float nota : notas){
            if(aux > nota){
                aux = nota;
            }

        }}

    return aux;
    }

    public float mayorNota(){
        float aux1;

        if(this.notas == null){
            aux1 = 0;
        }

    else{
        aux1 = notas.get(0);
        for(float nota : notas){
            if(aux1 < nota){
                aux1=nota;
            }
        }}

    return aux1;
    }

    public float promedioNotas(){
        float notas = 0;
        float promedioNota;

        if (this.notas == null){
            promedioNota = 0;
        }

        else{

        for(float nota : this.notas){
            notas += nota;
        }
        promedioNota = notas/ this.notas.size();}

        return  promedioNota;

    }

    public void inscribir(Materia materia){

    this.materias.add(materia);


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
