package bares_dianas.beneficios;

import humanos.Persona;

import java.util.HashSet;

public class Beneficio_Trago extends Beneficio {
    private HashSet<String> tragos;


    public Beneficio_Trago(String nombre, String persona) {
        super(nombre, persona);
        this.tragos = new HashSet<>();
    }

    public HashSet<String> getTragos() {
        return tragos;
    }

    public void setTragos(HashSet<String> tragos) {
        this.tragos = tragos;
    }


    @Override
    public String toString() {
        return super.toString()+ "tragos=" + tragos;
    }
}
