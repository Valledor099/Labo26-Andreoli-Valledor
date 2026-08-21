package animales;

public abstract class Pajaro extends Mascotas{
    private Boolean cantor;

    public Pajaro(String nombre, Duenio duenio) {
        super(nombre, duenio,Tipo_Mascota.PAJARO);
    }

    @Override
    public String saludar() {
        return "pio";
    }
}
