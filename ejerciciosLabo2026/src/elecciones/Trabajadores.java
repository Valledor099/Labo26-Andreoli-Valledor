package elecciones;

import humanos.Persona;

import java.time.LocalDate;

public class Trabajadores extends Persona implements Mensajero {
    private String nroCUIL;
    private int sueldo;
    private boolean enHorario;

    public Trabajadores(String nombre, String apellido, String direccion, LocalDate fecha_de_nacimiento, String nroCUIL, int sueldo, boolean enHorario)
    {
        super(nombre, apellido, direccion, fecha_de_nacimiento);
        this.nroCUIL = nroCUIL;
        this.sueldo = sueldo;
        this.enHorario = enHorario;
    }

    public boolean isEnHorario() {
        return enHorario;
    }

    public void setEnHorario(boolean enHorario) {
        this.enHorario = enHorario;
    }

    public String getNroCUIL() {
        return nroCUIL;
    }

    public void setNroCUIL(String nroCUIL) {
        this.nroCUIL = nroCUIL;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public void enviarMensaje(String mensaje) {
        if (puedeTransmitir()){
            System.out.println("Yo," + getNombre() + " te invito a que " + mensaje);
        }
    }

    @Override
    public boolean puedeTransmitir() {
        return enHorario;
    }
}
