package colegios;

import humanos.Persona;

import java.time.LocalDate;
import java.time.LocalTime;

public class Pedido {
    private LocalDate fechaCreacion;
    private Plato plato;
    private PersonaEducativa persona;
    private LocalTime horaEntrega;
    private boolean entregado;

    public Pedido(LocalDate fechaCreacion, Plato plato, PersonaEducativa persona, LocalTime horaEntrega, boolean entregado) {
        this.fechaCreacion = fechaCreacion;
        this.plato = plato;
        this.persona = persona;
        this.horaEntrega = horaEntrega;
        this.entregado = entregado;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Plato getPlato() {
        return plato;
    }

    public void setPlato(Plato plato) {
        this.plato = plato;
    }

    public PersonaEducativa getPersona() {
        return persona;
    }

    public void setPersona(PersonaEducativa persona) {
        this.persona = persona;
    }

    public LocalTime getHoraEntrega() {
        return horaEntrega;
    }

    public void setHoraEntrega(LocalTime horaEntrega) {
        this.horaEntrega = horaEntrega;
    }

    public boolean isEntregado() {
        return entregado;
    }

    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }

    public int precioDescuento(){
        int precio=plato.getPrecio();

        if (persona.getDescuento() != 0){
            precio=persona.precioDesc(plato.getPrecio());
        }

        return precio;
    }


}
