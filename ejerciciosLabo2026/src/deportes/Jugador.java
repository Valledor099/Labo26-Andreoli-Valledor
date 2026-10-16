package deportes;

import deportes.Futbol.Club;
import deportes.Futbol.NoPuedeRenovarseException;
import deportes.Futbol.Personas_Plantel;
import deportes.Futbol.Posicion;
import humanos.Persona;

import java.time.LocalDate;
import java.util.HashSet;

public abstract class Jugador extends Persona implements Personas_Plantel {

    private int numero_de_camiseta;
    private String provincia_origen;
    private HashSet <Club> historial_Club;
    private Posicion posicion;
    public static int edadMaxima = 35;

    public Jugador(String nombre, String apellido, LocalDate fecha_de_nacimiento, int numero_de_camiseta){
        super(nombre, apellido, fecha_de_nacimiento);
        this.numero_de_camiseta = numero_de_camiseta;
    }


    public Jugador(String nombre, String apellido, LocalDate fecha_de_nacimiento, int numero_de_camiseta, String provincia_origen,  Posicion posicion) {
        super(nombre, apellido, fecha_de_nacimiento);
        this.numero_de_camiseta = numero_de_camiseta;
        this.provincia_origen = provincia_origen;
        this.historial_Club = new HashSet<>();
        this.posicion = posicion;
    }

    public int getNumero_de_camiseta() {
        return numero_de_camiseta;
    }

    public void setNumero_de_camiseta(int numero_de_camiseta) {
        this.numero_de_camiseta = numero_de_camiseta;
    }

    public HashSet<Club> getHistorial_Club() {
        return historial_Club;
    }

    public void setHistorial_Club(HashSet<Club> historial_Club) {
        this.historial_Club = historial_Club;
    }

    public String getProvincia_origen() {
        return provincia_origen;
    }

    public void setProvincia_origen(String provincia_origen) {
        this.provincia_origen = provincia_origen;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public int calcularEdad(){
        return (LocalDate.now().getYear() - super.getFecha_de_nacimiento().getYear());
    }

    @Override
    public void puedeRenovarse() throws NoPuedeRenovarseException {
        if (calcularEdad() > edadMaxima){
            throw new NoPuedeRenovarseException("no puede renovarse");
        }
    }
}