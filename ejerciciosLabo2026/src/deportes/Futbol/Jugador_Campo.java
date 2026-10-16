package deportes.Futbol;

import deportes.Jugador;

import java.time.LocalDate;

public class Jugador_Campo extends Jugador implements Personas_Plantel {
    private int porcentaje_goles;
    private int cant_asistencias;
    private Posicion posicion;
    public static int porcentajeGolesConvertir = 30;
    public static int cantAsistenciaPromedio = 10;

    public Jugador_Campo(String nombre, String apellido, LocalDate fecha_de_nacimiento, int numero_de_camiseta, String provincia_origen, Posicion posicion, int porcentaje_goles, int cant_asistencias) {
        super(nombre, apellido, fecha_de_nacimiento, numero_de_camiseta, provincia_origen, posicion);
        this.porcentaje_goles = porcentaje_goles;
        this.cant_asistencias = cant_asistencias;

    }

    public int getPorcentaje_goles() {
        return porcentaje_goles;
    }

    public void setPorcentaje_goles(int porcentaje_goles) {
        this.porcentaje_goles = porcentaje_goles;
    }

    public int getCant_asistencias() {
        return cant_asistencias;
    }

    public void setCant_asistencias(int cant_asistencias) {
        this.cant_asistencias = cant_asistencias;
    }

    @Override
    public Posicion getPosicion() {
        return posicion;
    }

    @Override
    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    @Override
    public void puedeContratarse() throws NoPuedeContratarseException {
    if(!(porcentaje_goles > porcentajeGolesConvertir && cant_asistencias > cantAsistenciaPromedio)){
        throw new NoPuedeContratarseException("no puede contratarse");
    }
    }

    @Override
    public String decirNombre() {
        return this.getNombre();
    }

    @Override
    public String mostrarInfo() {
        return toString();
    }

    @Override
    public String toString() {
        return "Jugador_Campo{" +
                "porcentaje_goles=" + porcentaje_goles +
                ", cant_asistencias=" + cant_asistencias +
                ", posicion=" + posicion +
                '}';
    }
}


