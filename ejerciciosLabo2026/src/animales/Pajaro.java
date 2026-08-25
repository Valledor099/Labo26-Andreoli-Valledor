package animales;

public abstract class Pajaro extends Mascota {

    public Pajaro(String nombre, Duenio duenio, Tipo_Mascota tipoMascota) {
        super(nombre, duenio, tipoMascota);
    }

    @Override
    public String saludar() {
        return "pio";
    }
}
