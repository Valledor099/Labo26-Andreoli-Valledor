package deportes.Futbol;

import java.time.LocalDate;

public class Entrenador extends Integrante_Cuerpo_Tecnico implements Personas_Plantel {
    private int campeonatosObtenidos;
    private Boolean licenciaVigente;
    public static int aniosExperienciaMinimos = 3;

    public Entrenador(String nombre, LocalDate fecha_de_nacimiento, String titulo_profesional, int anios_experiencia, int campeonatosObtenidos, Boolean licenciaVigente) {
        super(nombre, fecha_de_nacimiento, titulo_profesional, anios_experiencia);
        this.campeonatosObtenidos = campeonatosObtenidos;
        this.licenciaVigente = licenciaVigente;
    }

    public int getCampeonatosObtenidos() {
        return campeonatosObtenidos;
    }

    public void setCampeonatosObtenidos(int campeonatosObtenidos) {
        this.campeonatosObtenidos = campeonatosObtenidos;
    }

    public Boolean getLicenciaVigente() {
        return licenciaVigente;
    }

    public void setLicenciaVigente(Boolean licenciaVigente) {
        this.licenciaVigente = licenciaVigente;
    }

    @Override
    public void puedeContratarse() throws NoPuedeContratarseException {
        if(!(licenciaVigente && super.getAnios_experiencia() > aniosExperienciaMinimos)){
            throw new NoPuedeContratarseException("no puede contratarse");
        }
    }

    @Override
    public void puedeRenovarse() throws NoPuedeRenovarseException {
    if(!(licenciaVigente)){
        throw new NoPuedeRenovarseException("no puede renovarse");
    }
    }

    @Override
    public String toString() {
        return "Entrenador{" +
                "campeonatosObtenidos=" + campeonatosObtenidos +
                ", licenciaVigente=" + licenciaVigente +
                '}';
    }

    @Override
    public String mostrarInfo() {
        return toString();
    }
}
