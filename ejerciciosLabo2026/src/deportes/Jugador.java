package deportes;

import humanos.Persona;

import java.time.LocalDate;

public class Jugador extends Persona {

    private int numero_de_camiseta;

    public Jugador(String nombre, String apellido, LocalDate fecha_de_nacimiento, int numero_de_camiseta){
        super(nombre, apellido, fecha_de_nacimiento);
        this.numero_de_camiseta = numero_de_camiseta;
    }

    public int getNumero_de_camiseta() {
        return numero_de_camiseta;
    }

    public void setNumero_de_camiseta(int numero_de_camiseta) {
        this.numero_de_camiseta = numero_de_camiseta;
    }


}
