package colegios;

import humanos.Persona;

import java.time.LocalDate;

public abstract class PersonaEducativa extends Persona {
    private int descuento ;


    public PersonaEducativa(String nombre, String apellido, int descuento) {
        super(nombre, apellido);
        this.descuento = descuento;
    }

    public PersonaEducativa(String nombre, String apellido, LocalDate fecha_de_nacimiento) {
        super(nombre, apellido, fecha_de_nacimiento);
    }

    public int getDescuento() {
        return descuento;
    }

    public  void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public int precioDesc(int precio){
        return (int)(precio -(precio *((float)(descuento)/(float) (100))));
    }
}
