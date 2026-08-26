package animales;

public class Gato extends Mascota {

    public Gato(String nombre, Duenio duenio) {
        super(nombre, duenio,Tipo_Mascota.GATO);
    }

    @Override
    public String saludar() {
        return "miau";
    }

    @Override
    public Tipo_Mascota tipoMascota() {
        return Tipo_Mascota.GATO;
    }
}
