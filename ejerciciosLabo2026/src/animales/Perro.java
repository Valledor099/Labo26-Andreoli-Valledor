package animales;

public class Perro extends Mascota {

    public Perro(String nombre, Duenio duenio) {
        super(nombre, duenio, Tipo_Mascota.PERRO);
    }

    @Override
    public String saludar() {
        return "guau";
    }
}
