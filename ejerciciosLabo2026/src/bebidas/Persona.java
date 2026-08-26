package bebidas;

import java.util.ArrayList;

public class Persona extends humanos.Persona {
    private String dni;
    private ArrayList <Consumicion> bebidas_consumidas;

    public Persona(String nombre, String apellido, String dni) {
        super(nombre, apellido);
        this.dni = dni;
        this.bebidas_consumidas = new ArrayList<>();
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public ArrayList<Consumicion> getBebidas_consumidas() {
        return bebidas_consumidas;
    }

    public void setBebidas_consumidas(ArrayList <Consumicion> bebidas_consumidas) {
        this.bebidas_consumidas = bebidas_consumidas;
    }

    public int hidratacionResultante(){
        int hidratacionTot = 0;
        for (Consumicion bebidasConsumida : bebidas_consumidas) {
            hidratacionTot += bebidasConsumida.hidratatacion();
        }
        return hidratacionTot;
    }

    public void consumir(Consumicion consumicion){
        bebidas_consumidas.add(consumicion);
    }

    @Override
    public String toString() {
        return super.toString() + " DNI: " + this.dni;
    }
}
