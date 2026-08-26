package animales;

public class Perro extends Mascota {

    public Perro(String nombre, Duenio duenio) {
        super(nombre, duenio);
    }


    @Override
    public String saludar(String nombre_usuario) {
        String saludo;
        if (esDuenio(nombre_usuario)){
            saludo = "guau";
        }
        else {
            saludo = "GUAU!";
        }
        return repetirSaludo_Alegria(saludo);
    }

    @Override
    public Tipo_Mascota tipoMascota() {
        return Tipo_Mascota.PERRO;
    }
}
