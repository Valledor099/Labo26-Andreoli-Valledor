package bares_dianas.beneficios;

import humanos.Persona;

public abstract class Beneficio {
    private String nombre;
    private String persona;

    public Beneficio(String nombre, String persona) {
        this.nombre = nombre;
        this.persona = persona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }



    @Override
    public String toString() {
        return "nombre= " + nombre + "{"+
                "persona= " + persona;
    }
}
