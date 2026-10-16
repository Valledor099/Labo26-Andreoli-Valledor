package deportes.Futbol;

import java.time.LocalDate;

public class Preparados_Fisico extends Integrante_Cuerpo_Tecnico implements Personas_Plantel {
    private String especialidad;
    private Boolean matriculaHabilitante;
    public static int aniosExperienciaMinimo = 2;

    public Preparados_Fisico(String nombre, LocalDate fecha_de_nacimiento, String titulo_profesional, int anios_experiencia, String especialidad, Boolean matriculaHabilitante) {
        super(nombre, fecha_de_nacimiento, titulo_profesional, anios_experiencia);
        this.especialidad = especialidad;
        this.matriculaHabilitante = matriculaHabilitante;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Boolean getMatriculaHabilitante() {
        return matriculaHabilitante;
    }

    public void setMatriculaHabilitante(Boolean matriculaHabilitante) {
        this.matriculaHabilitante = matriculaHabilitante;
    }

    @Override
    public void puedeContratarse() throws NoPuedeContratarseException {
    if(!(matriculaHabilitante && super.getAnios_experiencia() > aniosExperienciaMinimo)){
        throw new NoPuedeContratarseException("no puede contratarse");
    }
    }

    @Override
    public void puedeRenovarse() throws NoPuedeRenovarseException {
    if(!(matriculaHabilitante)){
        throw new NoPuedeRenovarseException("no puede renovarse");
    }
    }

    @Override
    public String toString() {
        return "Preparados_Fisico{" +
                "especialidad='" + especialidad + '\'' +
                ", matriculaHabilitante=" + matriculaHabilitante +
                '}';
    }

    @Override
    public String mostrarInfo() {
        return toString();
    }
}
