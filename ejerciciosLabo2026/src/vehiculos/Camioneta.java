package vehiculos;

import java.time.LocalDate;

public class Camioneta extends Vehiculo{

    private int capacidad;

    public Camioneta(String marca, String modelo, String color, int cantRuedas, LocalDate anioFabricacion, String patente, int capacidad) {
        super(marca, modelo, color, cantRuedas, anioFabricacion, patente);
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
