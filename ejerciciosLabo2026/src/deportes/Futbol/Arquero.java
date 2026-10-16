package deportes.Futbol;

import deportes.Jugador;

import java.time.LocalDate;

public class Arquero extends Jugador implements Personas_Plantel {
    private int porcentaje_atajadas;
    private int cant_goles_recibidos_ultima_temporada;
    public static int procentajeAtajadasPromedio = 60;
    public static int cant_goles = 10;

    public Arquero(String nombre, String apellido, LocalDate fecha_de_nacimiento, int numero_de_camiseta, String provincia_origen, Posicion posicion, int porcentaje_atajadas, int cant_goles_recibidos_ultima_temporada) {
        super(nombre, apellido, fecha_de_nacimiento, numero_de_camiseta, provincia_origen, posicion);
        this.porcentaje_atajadas = porcentaje_atajadas;
        this.cant_goles_recibidos_ultima_temporada = cant_goles_recibidos_ultima_temporada;
    }

    public int getPorcentaje_atajadas() {
        return porcentaje_atajadas;
    }

    public void setPorcentaje_atajadas(int porcentaje_atajadas) {
        this.porcentaje_atajadas = porcentaje_atajadas;
    }

    public int getCant_goles_recibidos_ultima_temporada() {
        return cant_goles_recibidos_ultima_temporada;
    }

    public void setCant_goles_recibidos_ultima_temporada(int cant_goles_recibidos_ultima_temporada) {
        this.cant_goles_recibidos_ultima_temporada = cant_goles_recibidos_ultima_temporada;
    }

    @Override
    public void puedeContratarse() throws NoPuedeContratarseException {
        if(!(porcentaje_atajadas > procentajeAtajadasPromedio && cant_goles_recibidos_ultima_temporada < cant_goles)){
            throw new NoPuedeContratarseException("no cumple con los requisitos");
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
        return "Arquero{" +
                "porcentaje_atajadas=" + porcentaje_atajadas +
                ", cant_goles_recibidos_ultima_temporada=" + cant_goles_recibidos_ultima_temporada +
                '}';
    }
}
