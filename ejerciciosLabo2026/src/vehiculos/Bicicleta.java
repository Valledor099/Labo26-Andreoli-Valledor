package vehiculos;

import java.time.LocalDate;

public class Bicicleta extends Vehiculo {


    public Bicicleta(String marca, String modelo, String color, int cantRuedas, LocalDate anioFabricacion) {
        super(marca, modelo, color,anioFabricacion,cantRuedas);
    }
}
