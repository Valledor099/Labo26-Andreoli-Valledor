package colegios;

import humanos.Persona;

public class Profesor extends Persona {
    private int porcentajeDesc;

    public Profesor(String nombre, String apellido, int porcentajeDesc) {
        super(nombre, apellido);
        this.porcentajeDesc = porcentajeDesc;
    }

    public int getPorcentajeDesc() {
        return porcentajeDesc;
    }

    public void setPorcentajeDesc(int porcentajeDesc) {
        this.porcentajeDesc = porcentajeDesc;
    }

    public int precioDesc(int precio){
        return precio *(porcentajeDesc/100);
    }
}
