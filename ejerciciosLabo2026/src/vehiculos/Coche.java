package vehiculos;

import java.time.LocalDate;

public class Coche extends Vehiculo{
    private int velocidad;
    private String patente;
    private boolean descapotable;

    public Coche(String marca, String modelo, String color, int cantRuedas, LocalDate aniofabricacion, String patente, boolean descapotable){
        super(marca, modelo, color, cantRuedas, aniofabricacion, patente);
        this.velocidad = 0;
        this.descapotable = descapotable;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public boolean isDescapotable() {
        return descapotable;
    }

    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }

    public void acelerar(){
        velocidad += 5;
    }

    public void frenar(){
        velocidad = 0;
    }

    public int mostrarVelocidad(){
        return velocidad;
    }

    public static void main(String[] args) {


    }

}
