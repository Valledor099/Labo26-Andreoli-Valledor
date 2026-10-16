package deportes.Futbol;

import humanos.Persona;

import java.time.LocalDate;
import java.util.HashSet;

public abstract class Integrante_Cuerpo_Tecnico extends Persona implements Personas_Plantel {
    private String titulo_profesional;
    private int anios_experiencia;
    private HashSet<Club> trabajos_anteriores;

    public Integrante_Cuerpo_Tecnico(String nombre, LocalDate fecha_de_nacimiento, String titulo_profesional, int anios_experiencia) {
        super(nombre, fecha_de_nacimiento);
        this.titulo_profesional = titulo_profesional;
        this.anios_experiencia = anios_experiencia;
        this.trabajos_anteriores = new HashSet<>();
    }

    public String getTitulo_profesional() {
        return titulo_profesional;
    }

    public void setTitulo_profesional(String titulo_profesional) {
        this.titulo_profesional = titulo_profesional;
    }

    public int getAnios_experiencia() {
        return anios_experiencia;
    }

    public void setAnios_experiencia(int anios_experiencia) {
        this.anios_experiencia = anios_experiencia;
    }

    public HashSet<Club> getTrabajos_anteriores() {
        return trabajos_anteriores;
    }

    public void setTrabajos_anteriores(HashSet<Club> trabajos_anteriores) {
        this.trabajos_anteriores = trabajos_anteriores;
    }

    @Override
    public String decirNombre() {
        return this.getNombre();
    }
}
