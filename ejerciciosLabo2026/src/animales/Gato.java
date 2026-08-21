package animales;

public class Gato extends Mascotas{

    public Gato(String nombre, Duenio duenio) {
        super(nombre, duenio,Tipo_Mascota.GATO);
    }

    @Override
    public String saludar() {
        return "miau";
    }
}
