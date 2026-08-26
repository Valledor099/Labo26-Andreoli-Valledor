package bebidas;

import java.util.ArrayList;

public class Persona extends humanos.Persona {
    private String dni;
    private ArrayList <Bebida> bebidas_consumidas;
    private ArrayList <Integer> cantidad_consumida;

    public Persona(String nombre, String apellido, String dni) {
        super(nombre, apellido);
        this.dni = dni;
        this.bebidas_consumidas = new ArrayList<>();
        this.cantidad_consumida = new ArrayList<>();
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public ArrayList<Bebida> getBebidas_consumidas() {
        return bebidas_consumidas;
    }

    public void setBebidas_consumidas(ArrayList<Bebida> bebidas_consumidas) {
        this.bebidas_consumidas = bebidas_consumidas;
    }

    public ArrayList<Integer> getCantidad_consumida() {
        return cantidad_consumida;
    }

    public void setCantidad_consumida(ArrayList<Integer> cantidad_consumida) {
        this.cantidad_consumida = cantidad_consumida;
    }

    public int hidratacionResultante(){
        int hidratacionTot = 0;
        for (int i = 0; i<bebidas_consumidas.size();i++){
            hidratacionTot += (cantidad_consumida.get(i) * bebidas_consumidas.get(i).coeficienteHidratacion());
        }
        return hidratacionTot;
    }

    public void consumir(Bebida bebida, int cantidad){
        bebidas_consumidas.add(bebida);
        cantidad_consumida.add(cantidad);
    }

    @Override
    public String toString() {
        return super.toString() + " DNI: " + this.dni;
    }
}
